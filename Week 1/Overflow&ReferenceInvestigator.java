
public class OverflowAndReferenceInvestigator {
    public static void main(String[] args) {

        byte number = 127;
        number++;

        System.out.println("=== BYTE OVERFLOW ===");
        System.out.println("Value after increment: " + number);
        System.out.println();

        String word1 = "Computer";
        String word2 = new String("Computer");
        String word3 = new String("Computer");

        System.out.println("word1 == word2: " + (word1 == word2));
        System.out.println("word2 == word3: " + (word2 == word3));

        System.out.println("word1.equals(word2): " + word1.equals(word2));
        System.out.println("word2.equals(word3): " + word2.equals(word3));
        System.out.println();

        String[] subjects = {"Java", "HTML", "Networking"};
        String[] copiedSubjects = subjects;

        copiedSubjects[0] = "Python";

        System.out.println("=== SHARED ARRAY ===");
        System.out.println("Original array first item: " + subjects[0]);
        System.out.println("Copied array first item: " + copiedSubjects[0]);
    }
}

