package oopsPractice.practiceModel.movieModule;


import oopsPractice.practiceModel.movieModule.artists.MovieArtist;
import oopsPractice.practiceModel.movieModule.artists.Profession;
import oopsPractice.practiceModel.movieModule.charAnnotations.Character;
import oopsPractice.practiceModel.movieModule.roleAnnotations.MovieRole;
import oopsPractice.practiceModel.movieModule.roleAnnotations.Role;

import java.util.Date;

public class Movie {

    private MovieService movieService;
    private String name;

    @CinemaIndustry
    private Industry industry;

    @Role(Profession.ACTOR)
    @Character(MovieRole.HERO)
    private MovieArtist hero;

    @Character(MovieRole.HEROINE)
    private MovieArtist heroine;

    @Role(Profession.DIRECTOR)
    private MovieArtist director;

    @Role(Profession.PRODUCER)
    private MovieArtist producer;

    @Role(Profession.MUSIC_DIRECTOR)
    private MovieArtist musicDirector;

    @Role(Profession.DANCE_MASTER)
    private MovieArtist danceMaster;

    @Role(Profession.SINGER)
    private MovieArtist singer;
    
    @Role(Profession.FIGHT_MASTER)
    private MovieArtist fightMaster;

    @Role(Profession.CAMERAMAN)
    private MovieArtist cameraMan;
    
    private Long budget;

    private Date releaseDate;
    
    private Long collection;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public MovieArtist getHero() {
        return hero;
    }

    public void setHero(MovieArtist hero) {
//        this.movieService.addMovieToHero(this, hero);
        this.hero = hero;

    }

    public MovieArtist getHeroine() {
        return heroine;
    }

    public void setHeroine(MovieArtist heroine) {
        this.heroine = heroine;
    }

    public MovieArtist getDirector() {
        return director;
    }

    public void setDirector(MovieArtist director) {
        this.director = director;
    }

    public MovieArtist getProducer() {
        return producer;
    }

    public void setProducer(MovieArtist producer) {
        this.producer = producer;
    }

    public MovieArtist getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(MovieArtist musicDirector) {
        this.musicDirector = musicDirector;
    }

    public MovieArtist getDanceMaster() {
        return danceMaster;
    }

    public void setDanceMaster(MovieArtist danceMaster) {
        this.danceMaster = danceMaster;
    }

    public MovieArtist getSinger() {
        return singer;
    }

    public void setSinger(MovieArtist singer) {
        this.singer = singer;
    }

    public MovieArtist getFightMaster() {
        return fightMaster;
    }

    public void setFightMaster(MovieArtist fightMaster) {
        this.fightMaster = fightMaster;
    }

    public MovieArtist getCameraMan() {
        return cameraMan;
    }

    public void setCameraMan(MovieArtist cameraMan) {
        this.cameraMan = cameraMan;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getCollection() {
        return collection;
    }

    public void setCollection(Long collection) {
        this.collection = collection;
    }
}
