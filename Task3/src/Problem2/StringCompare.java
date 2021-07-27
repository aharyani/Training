package Problem2;

public class StringCompare {
    /**
     * Compare the unicode of character, return the difference and if all unicode matches it return 0
     * It compare character by character  of both string
     */

    static void stringCompareto(){
        String strLiteral1= "Ammar";
        String strLiteral2= "Annus";

        String strObject1 = new String("Ammar");
        String strObject2 = new String("Annus");


        System.out.println(strLiteral1.compareTo(strObject1));// compare the unicode of character, return the difference and if all unicode matches it return 0

    }
}
