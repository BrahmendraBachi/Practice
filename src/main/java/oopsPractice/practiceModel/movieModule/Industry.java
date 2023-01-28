package oopsPractice.practiceModel.movieModule;

public enum Industry {

    TOLLYWOOD("Telugu", "Andhra Pradesh, Telangana", "India"),
    BOLLYWOOD("Hindi", "North India", "India");

    String language;

    String region;

    String country;
    Industry(String language, String region, String country){
        this.language = language;
        this.region = region;
        this.country = country;
    }



}
