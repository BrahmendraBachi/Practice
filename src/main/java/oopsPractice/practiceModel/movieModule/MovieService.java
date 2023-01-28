package oopsPractice.practiceModel.movieModule;

import oopsPractice.practiceModel.movieModule.artists.MovieArtist;
public class MovieService {

    public static String isMovieHitOrFlop(Movie movie){
        return movie.getCollection() > movie.getBudget() ? "Hit" : "Flop";
    }
    
    public static String profitGained(Movie movie){
        return movie.getCollection() > movie.getBudget() ? "Profit is : " + (movie.getCollection() - movie.getBudget()) : "No Profit";
    }


}
