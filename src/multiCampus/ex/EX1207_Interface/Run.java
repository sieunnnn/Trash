package multiCampus.ex.EX1207_Interface;

public class Run {
    /*
    <다형성>

     */

    Desktop desktop = new Desktop("삼성","울트라",2000000,"intel",16,true);

    SmartPhone smartPhone = new SmartPhone("사과","아이폰",12000000,"긱벤치",8,"SKT");

    TV tv = new TV("LG","LG티비",3000000,52);

    Product[] products = {desktop,smartPhone,tv};

}
