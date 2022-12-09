package codecademy.learnJavaBegginerProject.LanguageFamilies;

public class Language {

    /*
    This program maps language lineage like a family tree.

    In this mapping, it will focus on something that often varies between language families
    : word order - where the subject, verb, and object would go in a sentence.

    So this program will print out word order of the sentence.
    Plus it gives some information about language to us.
    */

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println("\n======================================================================\n");
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
    }

    public static void array(Language[] languages) {

        for (Language language:languages) {

            language.getInfo();
        }

    }

    public static void main(String[] args) {

        Language[] languages = {new Mayan("Ki'che'", 2330000), new SinoTibetan("MandarinChiniese",1110000000),
                new SinoTibetan("Burmese", 43000000), new Korean("Korean", 77000000), new Utian("Utian",18)};

        array(languages);
    }

}
