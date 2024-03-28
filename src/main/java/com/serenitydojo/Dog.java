package com.serenitydojo;

public class Dog {
    private String favoriteToy;
    private String name;
    private String favoriteFood;
    private int age;

    public Dog(String name, String favoriteFood, int age, String favoriteToy) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.favoriteToy = favoriteToy;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }
}
