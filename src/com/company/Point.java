package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double dlugosc = 0;
        dlugosc = Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
        return  dlugosc;

    }

    public double distance(int x, int y){
        double dlugosc = 0;
        dlugosc = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return  dlugosc;

    }


    public double distance(Point point) {
        return this.distance(point.getX(), point.getY());
    }
}
