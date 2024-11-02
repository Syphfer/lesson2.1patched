package org.example;

public class Robot implements Challenger{
public int maxRun;
public int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void challenge(Obstacle obstacle) {
        if (obstacle instanceof Cross) {
            if (obstacle.getLenght() <= maxRun) {
                System.out.println("Робот преодолел дистанцию");
            } else {
                System.out.println("Робот не смог пробежать");
            }
        }
        if (obstacle instanceof Wall) {
            if (obstacle.getLenght() <= maxJump) {
                System.out.println("Робот преодолел стену");
            } else {
                System.out.println("Робот не перепрыгнул");
            }
        }
    }
}