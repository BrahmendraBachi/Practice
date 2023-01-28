package oopsPractice.practiceModel.movieModule.artists;

import basicInformationPackage.Gender;

public interface Artist {

    void setName(String name);

    String getName();

    void setAge(int age);

    int getAge();

    void setGender(Gender gender);

    Gender getGender();

    void setPhoneNumber(String phoneNumber);

    String getPhoneNumber();

    void  setEmailId(String emailId);

    String getEmailId();

    void setProfession(Profession profession);

    Profession getProfession();

    void setFatherName(String fatherName);

    String getFatherName();

    void setMotherName(String motherName);

    String getMotherName();

    void setCity(String city);

    String getCity();

    void setPinCode(int pinCode);

    int getPinCode();

    void setCountry(String country);

    String getCountry();

}
