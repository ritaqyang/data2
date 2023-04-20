package com.data.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String line1;
    private String city;
    private String state;
    private String zipCode;

    private String phoneNumber;
    private String website;

    private Long overallScore;
    private Long peanutScore;
    private Long dairyScore;
    private Long eggScore;

    public Restaurant(String name, String line1, String city, String state, String zipCode, String phoneNumber, String website, Long overallScore, Long peanutScore, Long dairyScore, Long eggScore) {
        this.name = name;
        this.line1 = line1;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.overallScore = overallScore;
        this.peanutScore = peanutScore;
        this.dairyScore = dairyScore;
        this.eggScore = eggScore;
    }

    protected Restaurant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Long getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(Long overallScore) {
        this.overallScore = overallScore;
    }

    public Long getPeanutScore() {
        return peanutScore;
    }

    public void setPeanutScore(Long peanutScore) {
        this.peanutScore = peanutScore;
    }

    public Long getDairyScore() {
        return dairyScore;
    }

    public void setDairyScore(Long dairyScore) {
        this.dairyScore = dairyScore;
    }

    public Long getEggScore() {
        return eggScore;
    }

    public void setEggScore(Long eggScore) {
        this.eggScore = eggScore;
    }
}
