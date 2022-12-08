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

        String dna = null;
        for (int i = 0; i < str.length; i++) {
            dna = str[i];
            result(dna);
        }
    }

    public static boolean result (String dna) {

        System.out.println("============================");
        System.out.println("\nLet's start DNA sequencing");

        System.out.println("\nLength: " + dna.length());

        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop + "\n");

        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {

            System.out.println("Condition 1 and 2 and 3 are satisfied.");
            String protein = dna.substring(start, stop+3);

            System.out.println("\nDNA contains a protein!\n");
            System.out.println(" * Protein: " + protein + "\n");

            return true;

        } else if (start != -1 && stop != -1) {

            System.out.println("Condition 1 and 2 are satisfied");
            System.out.println("\nDAN doesn't contain a protein!\n");
        }

        return false;
    }
}
