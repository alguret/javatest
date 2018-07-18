package com.company;

public class Cat {
    public String name;
    public Genders gender;
    public Breeds breed;
    public Positions pos;

    enum Genders {m, v}

    enum Breeds {sheepdog, chihuahua}

    enum Positions {home, cafe}

    public Cat() {
        this.name = "Cat";
        this.gender = Genders.m;
        this.breed = Breeds.chihuahua;
        this.pos = Positions.home;
    }

    public Cat(String name, Genders gender) {
        this.name = name;
        this.gender = gender;
        this.breed = Breeds.chihuahua;
        this.pos = Positions.home;
    }

    public Cat(String name, Genders gender, Breeds breed, Positions pos) {
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.pos = pos;
    }

    public void goHome() {
        this.setPos(Positions.home);
    }

    public void setPos(Positions pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", breed=" + breed +
                ", pos=" + pos +
                '}';
    }
}
