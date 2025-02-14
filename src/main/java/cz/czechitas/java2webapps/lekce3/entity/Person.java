package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String givenName;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String photosURL;
    private Adress adress;

    public Person(String givenName, String surname, String email, LocalDate birthDate, String photosURL, Adress adress) {
        this.givenName = givenName;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        this.photosURL = photosURL;
        this.adress = adress;
    }

    public Adress getAdress() {
      return adress;
    }
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getPhotosURL() {
        return photosURL;
    }
    public void setPhotosURL(String photosURL) {
        this.photosURL = photosURL;
    }

    public int getAge(){
        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }
}
