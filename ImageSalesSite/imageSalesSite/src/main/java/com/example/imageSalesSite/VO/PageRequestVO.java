package com.example.imageSalesSite.VO;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageRequestVO {

    private int page;
    private int sizePerPage;

    // 검색 유형과 검색어를 필드로 선언한다.
    private String searchType;
    private String keyword;

    public PageRequestVO() {
        this.page =1;
        this.sizePerPage = 10;

    }

    public void setPage(int page) {
        if(page <= 0) {
            this.page  = 1;
            return;
        }

        this.page = page;

    }

    public void setSizePerPage(int size) {
        if (size <= 0 || size > 100) {
            this.sizePerPage = 10;
            return;
        }

        this.sizePerPage = size;

    }

    public int getPage() {
        return page;
    }

    public int getPageStart() {
        return (this.page -1) * sizePerPage;
    }

    public int getSizePerPage() {
        return this.sizePerPage;
    }

    // searchType, keyword 필드의 Getter / Setter  를 직접 정의한다.


    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    // 페이지 번호를 넘겨받아 다양한 형태의 쿼리 파라미터를 생헝한다.
    public String toUriStringByPage(int page) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("size", this.sizePerPage)

                // 검색 타입과 검색어를 추가하여 쿼리파라미터를 생성한다.
                .queryParam("searchType", this.searchType)
                .queryParam("keyword", this.keyword)
                .build();

        return uriComponents.toUriString();
    }

    // 필드를 활용하여 다양한 형태의 쿼리 파라미터를 생성한다.
    public String toUriString() {
        return toUriStringByPage(this.page);
    }

    // 검색폼의 액션 URI 를 생성한다.
    public String toUriStringForSearchAction(int page) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .build();

        return uriComponents.toUriString();
    }
}
