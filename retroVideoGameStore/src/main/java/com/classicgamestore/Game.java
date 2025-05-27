package com.classicgamestore;

public class Game {
    private String title;
    private String platform;
    private String description;
    private int stock;
    private double price;

    public Game(String title, String platform, String description, int stock, double price) {
        this.title = title;
        this.platform = platform;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDescription() {
        return description;
    }

    public int getStock(){
        return stock;
    }

    public double getPrice() {
        return price;
    }
}