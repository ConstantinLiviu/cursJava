public class Main {
    public static void main(String[] args) {

        // Create a Playlist class with attributes like name and a list of Song objects. Each Song has a title and
        // duration. Implement a method in Playlist that returns the total duration of all songs.

        Playlist listaCanteceTest = new Playlist("Lista de Test");
        Song macarena = new Song("Macarena", 3.27f);
        Song blocurileGri = new Song("Blocurile gri", 4.12f);
        Song vals = new Song("Vals", 2.46f);

        listaCanteceTest.addSongToList(macarena, blocurileGri, vals);

        listaCanteceTest.displaySongsList();
    }
}