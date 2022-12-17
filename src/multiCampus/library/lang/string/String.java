package src.multiCampus.library.lang.string;

import java.util.Arrays;

public class String {
    private java.lang.String str = "			The String class represents character strings.			";

    public String (java.lang.String java) {


    }

    public void readAPIDocument() {

        java.lang.String res = "";

        // str 의 길이를 출력하세요.
        System.out.println("1. str 의 길이를 출력하세요.");
        System.out.println(str.length());

        // str 을 모두 대문자로 바꿔 출력 해주세요.
        res = str.toUpperCase();
        System.out.println("2. str 을 모두 대문자로 바꿔 출력 해주세요.");
        System.out.println(res);

        // str 을 모두 소문자로 바꿔 출력 해주세요.
        res = str.toLowerCase();
        System.out.println("3. str 을 모두 소문자로 바꿔 출력 해주세요.");
        System.out.println(res);

        // str 에 있는 "class"를 "java"로 바꿔 출력 해주세요
        res = str.replace("class", "java");
        System.out.println("4. str 에 있는 class 를 java 로 바꿔 출력 해주세요");
        System.out.println(res);

        // str 에서 첫번째 t의 위치를 구해주세요.
        System.out.println("5. str 에서 첫번째 t의 위치를 구해주세요.");
        System.out.println(str.indexOf("t"));

        // str 의 앞 뒤 공백을 제거해서 출력해주세요
        System.out.println("6. str 의 앞 뒤 공백을 제거해서 출력해주세요");
        System.out.println(str.trim());

        // str 을 char[]형태로 출력 해주세요.
        System.out.println("7. str 을 char[]형태로 출력 해주세요.");
        System.out.println(Arrays.toString(str.toCharArray()));


    }

}
