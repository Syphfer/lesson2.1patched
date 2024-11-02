package org.example;

public class Cat implements Challenger {
    public int maxRun;
    public int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public void challenge(Obstacle obstacle) {
        if (obstacle instanceof Cross) {
            if (obstacle.getLenght() <= maxRun) {
                System.out.println("Кот преодолел дистанцию");
            } else {
                System.out.println("Кот не смог пробежать");
            }
        }
        if (obstacle instanceof Wall) {
            if (obstacle.getLenght() <= maxJump) {
                System.out.println("Кот преодолел стену");
            } if (obstacle.getLenght() > maxJump) {
                System.out.println("Кот не перепрыгнул");
            }
        }
    }
}
