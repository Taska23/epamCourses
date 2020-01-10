package courses.homework.task3.task3_1.model.entity;

import courses.homework.task3.task3_1.model.interfaces.Movable;


public class MovableRobot implements Movable {
    @Override
    public void move() {
        System.out.println("Robot move");
    }
}

