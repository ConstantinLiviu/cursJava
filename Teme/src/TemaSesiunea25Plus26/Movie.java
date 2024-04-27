package TemaSesiunea25Plus26;

import java.util.ArrayList;

public class Movie {
    // Design a Movie class with attributes like title, genre, and a list of ratings. Create a method that retrieve
    // the average rating for any movie.
    String title;

    String genre;

    ArrayList<Float> ratingsList;

    public Float getAvgRating( ArrayList<Float> ratingsListParam) {
        float sum = 0;
        for(Float rating:ratingsListParam) {
            sum+=rating;
        }
        return sum/ratingsListParam.size();
    }

    public Movie(String title, String genre, Float... ratingsList) {
        this.title = title;
        this.genre = genre;
        this.ratingsList = new ArrayList<>();
        for(Float rating: ratingsList) {
            this.ratingsList.add(rating);
        }
    }
}
