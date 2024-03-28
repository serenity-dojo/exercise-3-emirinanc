package com.serenitydojo;

public class Dog {
    private String favoriteToy;
    private String name;
    private String favoriteFood;
    private int age;

    private boolean isFed;

    static final String DOG_NOISE = "Woof";

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

    public void feed() {
        isFed = true;
    }

    public void makeNoise(){
        System.out.println(DOG_NOISE);
    }
}
