package src.multiCampus.library.util.collection.map.hashSet;

import src.multiCampus.library.util.collection.dto.Music;

import java.util.Map.Entry;

public class Run {
    public static void main(String[] args) {

        _Map<String, Music> map = new _Map<String, Music>();

        // Map 에 데이터를 추가
        map.put("백산예술대상", new Music("블랙핑크", "레드핑크"));
        map.put("골든디스크상", new Music("김경호", "오아시스"));
        map.put("연예대상", new Music("싹쓰리", "싹포"));

        System.out.println("===============================================");
        for (Entry<String, Music> node : map.entrySet()) {
            System.out.println(node);
        }

        System.out.println("===============================================");
        System.out.println(map.get("연예대상"));


        // Map 에 저장된 데이터의 개수를 확인
        System.out.println("\n============= Map 에 저장된 데이터의 개수를 확인=========");
        System.out.println(map.size());


        // Map 에 저장된 데이터를 수정
        System.out.println("\n============= Map 에 저장된 데이터를 수정================");
        map.replace("연예대상", new Music("이승철", "소녀시대"));

        for (Entry<String, Music> node : map.entrySet()) {
            System.out.println(node);
        }

        // Map 에 저장된 데이터를 삭제
        System.out.println("\n============= Map 에 저장된 데이터를 삭제================");
        map.remove("연예대상");

        for (Entry<String, Music> node : map.entrySet()) {
            System.out.println(node);
        }
    }

}
