package com.example.imageSalesSite.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString(exclude = "codeDetails")
@Entity
@EqualsAndHashCode(of = "groupCode")
@Table(name="code_group")
public class CodeGroup {

    // 유효성 검증 annotation 지정
    @NotBlank
    @Id
    @Column(length = 3)
    private String groupCode;

    // 유효성 검증 annotation 지정
    @NotBlank
    @Column(length = 30, nullable = false)
    private String groupName;

    @Column(length = 1)
    private String useYn = "Y";

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    // CodeDetail 과 연관관계 매핑
    @OneToMany
    @JoinColumn(name = "groupCode")
    private List<CodeDetail> codeDetails;
}
