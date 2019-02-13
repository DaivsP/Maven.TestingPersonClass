package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private String eyeColor;
    private Boolean facialHair;
    private int weight;
    private int height;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Person(String name, int age, String hairColor, String eyeColor, Boolean facialHair, int weight, int height) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.facialHair = facialHair;
        this.weight = weight;
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Boolean getFacialHair() {
        return facialHair;
    }

    public void setFacialHair(Boolean facialHair) {
        this.facialHair = facialHair;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
