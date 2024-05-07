import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Given a random text, find out how many words have three or more letters
        Scanner textInput = new Scanner(System.in);
        System.out.println("Input text:");
        String sentence = textInput.nextLine();

        int counter=0;
        String[] words = sentence.split(" ");
        for(String word:words) {
            if(word.length()>3) {
                counter++;
            }
        }
        System.out.println("Number of words that have more than three letters: " + counter);
    }
}