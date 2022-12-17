package src.multiCampus.library.util.collection.set.hashSet;

import src.multiCampus.library.util.collection.dto.Music;

public class HashSetTest {
    public void studySet() {

        _HashSet<Music> musicSet = new _HashSet<>();
        musicSet.add(new Music("김경호", "금지된 사랑"));
        musicSet.add(new Music("김경호", "금지된 사랑"));
        musicSet.add(new Music("김경호", "금지된 사랑"));
        musicSet.add(new Music("김경호", "금지된 사랑"));
        musicSet.add(new Music("김경호", "와인"));
        musicSet.add(new Music("김경호", "화인"));
        musicSet.add(new Music("김경호", "바인"));

        System.out.println(musicSet);
        musicSet.remove(new Music("김경호", "바인"));
        System.out.println(musicSet);

    }

}
