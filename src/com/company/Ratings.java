package com.company;

public class Ratings {
    private String rate;

    public String thisIsMyRating() {
        return "This is my rating: " + getRate();
    }

    public Ratings() {
    }

    public Ratings(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
