package com.company;

import java.util.Arrays;

public class CatCafe {
    public String address;
    public Cat[] cats;
    public String workingTime;
    public Integer counter;


    public CatCafe(String address, Cat[] cats, String workingTime) {
        this.address = address;
        for (Cat cat : cats) {
            cat.pos = Cat.Positions.cafe;
        }
        this.cats = cats;
        this.workingTime = workingTime;
        this.counter = cats.length;
    }

    public Cat[] find(Cat.Breeds breed) {
        return Arrays.stream(this.cats).filter(cat -> cat.breed == breed).toArray(Cat[]::new);
    }

    @Override
    public String toString() {
        return "CatCafe{" +
                "address='" + address + '\'' +
                ", cats=" + (cats == null ? null : Arrays.asList(cats)) +
                ", workingTime='" + workingTime + '\'' +
                ", counter=" + counter +
                '}';
    }
}
