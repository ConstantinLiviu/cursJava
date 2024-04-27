package TemaSesiunea25Plus26;

public class Main {
    public static void main(String[] args) {
        // Create a generic class Box<T> that can store a single item of any type. Implement methods to set and get
        // the item from the box.
        Box cutia1 = new Box("Film");
        System.out.println(cutia1.content);
        System.out.println(cutia1.getContent());
        cutia1.setContent("Haine");
        System.out.println(cutia1.getContent());
        cutia1.setContent(26);
        System.out.println(cutia1.getContent());


        // Design a Movie class with attributes like title, genre, and a list of ratings. Create a method that retrieve
        // the average rating for any movie.

        Movie garfield = new Movie("Garfield", "comedy", 2.5f, 9.3f, 6.8f);
        System.out.println(garfield.ratingsList);
        System.out.println(garfield.getAvgRating(garfield.ratingsList));

    }
}
