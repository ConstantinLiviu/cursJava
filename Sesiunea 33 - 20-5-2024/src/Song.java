public class Song {
    // Create a Playlist class with attributes like name and a list of Song objects. Each Song has a title and
    // duration. Implement a method in Playlist that returns the total duration of all songs.

    String title;

    float duration;

    public Song(String title, float duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public float getDuration() {
        return duration;
    }
}
