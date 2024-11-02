package org.example;

public abstract class Obstacle {
    public int lenght;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Obstacle(int lenght) {
        this.lenght = lenght;
    }
}
