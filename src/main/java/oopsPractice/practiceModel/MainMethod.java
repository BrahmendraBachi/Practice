package oopsPractice.practiceModel;

import basicInformationPackage.Gender;
import javafx.scene.Camera;
import oopsPractice.practiceModel.movieModule.Cast;
import oopsPractice.practiceModel.movieModule.Movie;
import oopsPractice.practiceModel.movieModule.MovieService;
import oopsPractice.practiceModel.movieModule.artists.MovieArtist;
import oopsPractice.practiceModel.movieModule.artists.Profession;
import oopsPractice.practiceModel.movieModule.roleAnnotations.MovieRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class MainMethod {


    private static MovieService movieService;

    public static void main(String[] args) {


        MovieArtist mahendra = new MovieArtist("Mahendra", 22, Gender.MALE, "9676833852",
                "m1hendr1b1bu@gmail.com", Profession.ACTOR, "Amarendra Babu", "Sivagamini",
                "Madanapalle", 517001, "India");

        mahendra.setCharacterName("Vikram Rathode");

        mahendra.setMovieRole(MovieRole.HERO);

        MovieArtist bachi = new MovieArtist("Bachi", 22, Gender.MALE, "6303621185",
                "hari8185008552@gmail.com", Profession.ACTOR,"Hari", "Hari",
                "kavali", 517325, "India");


        MovieArtist hemanth = new MovieArtist("Hemanth Kumar", 22, Gender.MALE, "7483430420",
                "hemanthroyal143225@gmail.com", Profession.CAMERAMAN, "Hemanth", "Usha",
                "Vayalpad", 515661, "India");


        Movie movie = new Movie("Vikramarkudu Spoof");

        movie.setHero(mahendra); // Setting Hero

        movie.setProducer(hemanth);

        movie.setCameraMan(hemanth);

        movie.setDirector(bachi);

        movie.setBudget(500L);

        movie.setCollection(10L);

//        movie.setReleaseDate(new Date("17-07-2021"));


        System.out.println(movieService.isMovieHitOrFlop(movie));

        System.out.println(movieService.profitGained(movie));





    }

}
