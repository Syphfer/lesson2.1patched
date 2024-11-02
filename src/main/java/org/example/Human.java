package org.example;

public class Human implements Challenger {
    public int maxRun;
    public int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public void challenge(Obstacle obstacle) {
        if (obstacle instanceof Cross) {
            if (obstacle.getLenght() <= maxRun) {
                System.out.println("Человек преодолел дистанцию");
            } else {
                System.out.println("Человек не смог пробежать");
            }
        }
        if (obstacle instanceof Wall) {
            if (obstacle.getLenght() <= maxJump) {
                System.out.println("Человек преодолел стену");
            } else {
                System.out.println("Человек не перепрыгнул");
            }
        }
    }
}