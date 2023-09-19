package codecademy.learnJavaBegginerProject;

public class DNASequencing {

    /*
    This program determines whether there is a protein in a strand of DNA.
        A protein has the following qualities:
            1. condition1 : It begins with a "start codon" : ATG
            2. condition2 : It ends with a "stop codon" : TGA
            3. condition3 : In between, each additional codon is a sequence of three nucleotides
     */

    public static void main(String[] args) {

        String[] str = {"ATGCGATACGCTTGA", "ATGCGATACGTGA", "ATTAATATGTACTGA"};

        dnaArray(str);

    }

    static void dnaArray(String[] str) {
        for (int i = 0; i < str.length; i++) {
            result(str[i]);
        }
    }

    public static void result (String dna) {

        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");

        String type = "NONE";
        String protein = "";

        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            protein = dna.substring(start, stop+3);
            type = "Protein";

        } else if (start != -1 && stop != -1) {
            type = "NotProtein";

        }
        printResult(dna.length(), start, stop, protein, type);

    }

    public static void printResult (int length, int start, int stop, String protein, String type) {
        StringBuilder sb = new StringBuilder(
            "============================" +
            "\n\nLet's start DNA sequencing" +
            "\n\nLength: " + length +
            "\nStart: " + start +
            "\nStop: " + stop + "\n"
        );
        if ("Protein".equals(type)) {
            sb.append("\nCondition 1 and 2 and 3 are satisfied.")
                .append("\nDNA contains a protein!\n")
                .append(" * Protein: ")
                .append(protein)
                .append("\n");
        } else if ("NotProtein".equals(type)) {
            sb.append("\nCondition 1 and 2 are satisfied \nDAN doesn't contain a protein!\n");
        }
        System.out.println(sb);
    }
}
