package com.company;

public class Calculator {
    Carpet carpet;
    Floor floor;

    public Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }
    public double getTotalCost(){
        return this.carpet.getCost() * this.floor.getArea();
    }
}
