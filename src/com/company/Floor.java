package com.company;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {

        this.width = width;
        if(width < 0){
            this.width = 0;
        }
        this.length = length;
        if(length < 0){
            this.length = 0;
        }


    }
    public double getArea(){

        double area = this.width * this.length;
        return area;
    }

}
