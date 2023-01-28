package oopsPractice.practiceModel.movieModule;

import basicInformationPackage.Gender;
import oopsPractice.practiceModel.movieModule.artists.Artist;
import oopsPractice.practiceModel.movieModule.artists.Profession;
import oopsPractice.practiceModel.movieModule.roleAnnotations.MovieRole;

public class Cast implements Artist {
    private String name;

    private int age;

    private Gender gender;

    private String phoneNumber;

    private String emailId;

    private Profession profession;

    private String fatherName;

    private String motherName;

    private String city;

    private int pinCode;

    private String country;

    public Cast(String name, int age, Gender gender, String phoneNumber, String emailId, Profession profession, String fatherName,
                String motherName, String city, int pinCode, String country){

        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setPhoneNumber(phoneNumber);
        this.setEmailId(emailId);
        this.setProfession(profession);
        this.setFatherName(fatherName);
        this.setMotherName(motherName);
        this.setCity(city);
        this.setPinCode(pinCode);
        this.setCountry(country);


    }

    private String characterName;

    private MovieRole movieRole;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public MovieRole getMovieRole() {
        return movieRole;
    }

    public void setMovieRole(MovieRole movieRole) {
        this.movieRole = movieRole;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String getEmailId() {
        return this.emailId;
    }

    @Override
    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public Profession getProfession() {
        return profession;
    }

    @Override
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String getFatherName() {
        return this.fatherName;
    }

    @Override
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Override
    public String getMotherName() {
        return this.motherName;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int getPinCode() {
        return pinCode;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getCountry() {
        return this.country;
    }



}
