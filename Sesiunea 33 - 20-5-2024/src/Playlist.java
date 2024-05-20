import java.util.ArrayList;

public class Playlist {
    // Create a Playlist class with attributes like name and a list of Song objects. Each Song has a title and
    // duration. Implement a method in Playlist that returns the total duration of all songs.

    String name;

    ArrayList<Song> songsList = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    // add songs to playlist
    public void addSongToList(Song... songParam) {
        for(Song song: songParam) {
            this.songsList.add(song);
        }
    }

    public void displaySongsList() {
        System.out.println("Lista de cantece " + '"' + name + '"' + ":");
        int counter = 1;
        for (Song song:songsList) {
            System.out.println(counter + ". " +song.getTitle() + ": " + song.getDuration() + " min");
            counter++;
        }
    }
}
