public class TemaSesiunea11 {
    public static void main(String[] args) {
        // 1. Create a Java program to find and print the length of a given string.
        String deTest = "Acesta este un string";
        System.out.println(deTest.length());
        // 2. Create a Java program that finds and prints the character at a given index(2) in a string.
        String gasesteCaracterul = "Alt string de test";
        System.out.println(gasesteCaracterul.charAt(2));
        // 3. Create a Java program that finds and prints the index of the first occurrence of a character in a
        // string.
        String primaInstanta = "Ana are mere coapte";
        System.out.println(primaInstanta.indexOf("e"));
        // 4. Create a Java program that prints a substring of a given string from a specified start index (1)
        // to end index(3).
        String testSubstring = "Afara este senin";
        System.out.println(testSubstring.substring(1,3));
        // 5. Create a Java program that converts a given string to uppercase and lowercase and prints both outputs.
        String testCase = "Saptamana are sapte zile";
        System.out.println(testCase.toUpperCase());
        System.out.println(testCase.toLowerCase());
    }
}
