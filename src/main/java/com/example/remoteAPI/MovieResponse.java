package com.example.remoteAPI;

public class MovieResponse {

    private int budget;

    private int revenue;

    private String tagline;

    private String status;

    private int newProfit;

    public MovieResponse() {
    }

    public MovieResponse(int budget, int revenue, String tagline, String status) {
        this.budget = budget;
        this.revenue = revenue;
        this.tagline = tagline;
        this.status = status;
        this.newProfit = revenue - budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNewProfit() {
        return newProfit;
    }

}
