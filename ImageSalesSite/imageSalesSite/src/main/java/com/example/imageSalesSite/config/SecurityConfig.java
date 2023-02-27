package com.example.imageSalesSite.config;

import com.example.imageSalesSite.security.CustomAccessDeniedHandler;
import com.example.imageSalesSite.security.CustomLoginSuccessHandler;
import com.example.imageSalesSite.security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@EnableWebSecurity
// security annotaion 활성화를 위한 설정
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 데이터 소스
    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/auth/login").permitAll()
                .antMatchers("/user/setup", "/user/register", "/user/registerSuccess").permitAll()
                .antMatchers("/user/**").hasRole("ADMIN")
                .antMatchers("/codegroup/**").hasRole("ADMIN")
                .antMatchers("/codedetail/**").hasRole("ADMIN")

                // 회원 게시판 웹 경로 보안 지정
                .antMatchers("/board/list", "/board/read").permitAll()
                .antMatchers("/board/remove").hasAnyRole("MEMBER", "ADMIN")
                .antMatchers("/board/**").hasRole("MEMBER")

                // 공지사항 웹 경로 보안 지정
                .antMatchers("/notice/list", "/notice/read").permitAll()
                .antMatchers("/notice/**").hasRole("ADMIN")

                // 상품 관리 웹 경로 보안 지정
                .antMatchers("/item/list", "/item/read", "/item/display").permitAll()
                .antMatchers("/item/picture").hasAnyRole("MEMBER", "ADMIN")
                .antMatchers("/item/**").hasRole("ADMIN")
                .anyRequest().authenticated();

        http.formLogin()
                .loginPage("/auth/login")
                .loginProcessingUrl("/login")

                // CustomLoginSuccessHandler 를 로그인 성공 처리자로 지정
                .successHandler(authenticationSuccessHandler());

        // 로그아웃
        http.logout()
                .logoutUrl("/auth/logout")

                // 로그아웃이 성공적으로 이루어지면 이동하는 URL 지정
                .logoutSuccessUrl("/");

        http.exceptionHandling()
                // CustomAccessDeniedHandler 를 접근 거부 처리자로 지정
                .accessDeniedHandler(accessDeniedHandler());

        // 데이터소스를 지정하고 테이블을 이용해서 기존 로그인 정보를 기록
        http.rememberMe()
                .key("KsJjE4BzhhEW3juG")
                .tokenRepository(createJDBCRepository())

                // 쿠키의 유효 시간을 지정한다.
                .tokenValiditySeconds(60*60*24);
    }

    // CustomUserDetailsService 를 스프링 빈으로 정의
    @Bean
    public UserDetailsService customUserDetailsService() {
        return new CustomUserDetailsService();
    }

    @Bean
    public PasswordEncoder passWordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //CustomLoginSuccessHandler 를 스프링 빈으로 정의
    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        return new CustomLoginSuccessHandler();
    }

    // CustomAccessDeniedHandler 를 스프링 빈으로 정의
    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return new CustomAccessDeniedHandler();
    }

    // CustomUserDetailsService 빈을 인증 제공자에 지정
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService())
                .passwordEncoder(passWordEncoder());
    }

    private PersistentTokenRepository createJDBCRepository() {
        JdbcTokenRepositoryImpl repo = new JdbcTokenRepositoryImpl();
        repo.setDataSource(dataSource);

        return repo;
    }

}