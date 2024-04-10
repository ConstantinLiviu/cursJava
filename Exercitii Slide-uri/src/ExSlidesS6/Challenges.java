package ExSlidesS6;

import java.util.*;

public class Challenges {
    public static void main(String[] args) {
        // 1. Reverse a String
        // Description: Use the StringBuilder class to write a program that reverses an input string. For example, the
        // input "hello" should return "olleh".
        StringBuilder reversed = new StringBuilder("hello");
        System.out.println(reversed.reverse());

        // 2. Palindrome Checker
        // Description: Write a program that checks whether a given string is a palindrome using the StringBuilder
        // class. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward
        // and backward.
        Scanner palindromeChecker = new Scanner(System.in);
        System.out.println("Which word would you like to check?");
        String toCheck = palindromeChecker.next();
        StringBuilder toCheckReverse = new StringBuilder(toCheck);
        toCheckReverse = toCheckReverse.reverse();
        boolean isPalindrome = true;

        for (int i = 0; i < toCheck.length(); i++) {
            if (toCheck.charAt(i) != toCheckReverse.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
        String confirmation = isPalindrome ? "is a palindrome" : "isn't a palindrome";
        System.out.println("The word you input " + confirmation);


        // 3. Concatenate Multiple Strings
        // Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.
        ArrayList<String> listaStringuri = new ArrayList<>();
        Collections.addAll(listaStringuri, "Ana", "are", "mere");
        StringBuilder finalString = new StringBuilder();

        for (String word : listaStringuri) {
            finalString.append(word);
            if (!word.equals(listaStringuri.get(listaStringuri.size() - 1))) {
                finalString.append(" ");
            } else {
                finalString.append(".");
            }
        }
        System.out.println(finalString);

        // 4. Removing Vowels
        // Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input
        // string.
        Scanner removeVowels = new Scanner(System.in);
        System.out.println("Input a string");
        String toEdit = removeVowels.next();
        StringBuilder noVowels = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < toEdit.length(); i++) {
            if (!vowels.contains(Character.toString(toEdit.charAt(i)))) {
                noVowels.append(toEdit.charAt(i));
            }
        }

        System.out.println(noVowels);

        // 5. Word Capitalizer
        // Description: Write a program that capitalizes the first letter of every word in a sentence using the
        // StringBuilder class.
        String capitalize = "Ana are mere";
        StringBuilder capitalized = new StringBuilder();
        for (String cuvant : capitalize.split(" ")) {
            capitalized.append(cuvant.substring(0, 1).toUpperCase()).append(cuvant.substring(1)).append(" ");
        }
        System.out.println(capitalized.toString().trim());

        // 6. String Replacement
        // Description: Use the StringBuilder class to replace every occurrence of a substring within a given string
        // with another substring. For instance, replace "cat" with "dog" in the string "The cat sat on the mat."
        StringBuilder givenString = new StringBuilder("The cat sat on the mat");
        givenString.replace(givenString.indexOf("cat"), givenString.indexOf("cat")+3, "dog");
        System.out.println(givenString);

        // 7. Duplicate Character Remover
        // Description: Design a program using StringBuilder that removes duplicate characters from a string. For
        // example, "balloon" should become "balon".
        StringBuilder removeDuplicates = new StringBuilder("balloon");
        for (int i = 0; i < removeDuplicates.length(); i++) {
            for (int j = i + 1; j < removeDuplicates.length(); j++) {
                if (removeDuplicates.charAt(i) == removeDuplicates.charAt(j)) {
                    removeDuplicates.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(removeDuplicates);

        // 8. Inserting at Index
        // Description: Write a Java program that inserts a given string into another string at a specified index
        // using the StringBuilder class.
        String substringInsert = "Ana are mere";
        StringBuilder concatString = new StringBuilder();
        String givenSubstring = "multe";
        int givenIndex = 8;

        concatString.append(substringInsert.substring(0, givenIndex).concat(givenSubstring).concat(" ").concat(substringInsert.substring(givenIndex)));
        System.out.println(concatString);

        // 9. Frequency Counter
        // Description: Using StringBuilder, write a program that counts the frequency of each character in a string.
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        StringBuilder testString = new StringBuilder("onomatopee");
        for(int i=0; i<testString.length(); i++) {
            if (frequencyMap.containsKey(testString.charAt(i))) {
                frequencyMap.put(testString.charAt(i), frequencyMap.get(testString.charAt(i))+1);
            } else {
                frequencyMap.put(testString.charAt(i), 1);
            }
        }
        System.out.println(frequencyMap);

        // 10. Morse Code Converter
        // Description: Create a program that takes in a string and converts it to Morse code using the StringBuilder
        // class. For simplicity, you can assume the input string only contains alphabets and numbers.
        Map<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
        morseCodeMap.put(' ', " // ");

        StringBuilder codedMessage = new StringBuilder();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Input text below:");
        String text = userInput.nextLine().toUpperCase();

        for(int i=0; i<text.length(); i++) {
            codedMessage.append(morseCodeMap.get(text.charAt(i)));
        }

        System.out.println(codedMessage);

        // 11. Encode and Decode using Caesar Cipher
        // Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class. The Caesar Cipher
        // involves rotating letters a certain number of steps down or up the alphabet. For example, with a shift of 1,
        // 'A' would be replaced by 'B', 'B' would become 'C', and so on.

        // 12. CamelCase to Snake_case Converter
        // Description: Write a program using StringBuilder to convert a given CamelCase string to snake_case. For
        // instance, "thisIsCamelCase" would become "this_is_camel_case".

        // 13. Expand Compressed Strings
        // Description: Given a compressed string like "a3b2c4", expand it to "aaabbc", making use of the
        // StringBuilder class.

        // 14. Remove Comments from Code
        // Description: Create a Java program using StringBuilder that removes all single line (//) and multi-line (/*
        // */) comments from a provided piece of code.

        // 15. Anagram Checker
        // Description: Develop a program that checks if two provided strings are anagrams of each other using
        // the StringBuilder class. Anagrams are words or phrases made up of the same characters.

        // 16. Toggling Case
        // Description: Design a program using StringBuilder that toggles the case of every character in a given
        // string. For example, "HelLo" should become "hELlO".

        // 17. String Interleaver
        // Description: Write a program using StringBuilder that interleaves two strings. For instance, given "abc"
        // and "123", the result should be "a1b2c3".

        // 18. Pattern Recognition
        // Description: Design a Java program using StringBuilder that checks if a given pattern repeats in a string.
        // For instance, given the string "ababab", the repeating pattern is "ab".

        // 19. Encode Strings with Run-Length Encoding (RLE)
        // Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm. For
        // instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".

        // 20. Balanced Parenthesis Checker
        // Description: Develop a program that checks if a string has balanced parentheses ((, ), {, }, [, and ])
        // using StringBuilder. The program should return true if the parentheses in the string are balanced and false
        // otherwise.

    }
}
