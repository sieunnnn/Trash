package com.example.imageSalesSite.domain;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"gorupCode", "codeValue"})
@ToString
public class CodeDetailId implements Serializable {

    private static final long serialVersionUID = 1L;

    private String groupCode;
    private String codeValue;

}
