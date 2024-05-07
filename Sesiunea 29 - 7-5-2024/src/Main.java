import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Given a sentence, reverse the order of the words in the sentence, but not the order of the letters in each
        // word. For example, "Java is fun" should become "fun is Java".

        Scanner userInput = new Scanner(System.in);
        System.out.println("Input text: ");
        String sentence = userInput.nextLine();

        String[] words = sentence.split(" ");
        String reversedString = "";
        for(int i = words.length - 1; i>=0; i--) {
            reversedString= reversedString + words[i] + " ";
        }
        System.out.println(reversedString.trim());

    }
}