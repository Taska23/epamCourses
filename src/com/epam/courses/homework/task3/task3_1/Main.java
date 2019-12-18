package com.epam.courses.homework.task3.task3_1;


import com.epam.courses.homework.task3.task3_1.controller.RoomController;
import com.epam.courses.homework.task3.task3_1.model.PlayingRoom;
import com.epam.courses.homework.task3.task3_1.model.entity.AbstractToy;
import com.epam.courses.homework.task3.task3_1.model.entity.CarToy;
import com.epam.courses.homework.task3.task3_1.model.entity.Doll;
import com.epam.courses.homework.task3.task3_1.model.entity.RobotToy;

public class Main {
    public static void main(String[] args) {


        PlayingRoom<AbstractToy> playingRoom = new PlayingRoom<>();
        playingRoom.addToy(new CarToy(100, 1,"male","BMW"));
        playingRoom.addToy(new CarToy(99, 2,"male","Mercedes"));
        playingRoom.addToy(new CarToy(98, 3,"female","BarbieCar"));
        playingRoom.addToy(new Doll(97, 4,"male","1"));
        playingRoom.addToy(new Doll(96, 5,"female","2"));
        playingRoom.addToy(new RobotToy(95, 6,"male","METAL BRUATAL"));
        playingRoom.addToy(new RobotToy(94, 7,"female","Unicorn lether"));


        AbstractToy[] abstractToys = playingRoom.getToysByParameters(92,12,"female");
        for (AbstractToy toy:abstractToys) {

            System.out.println(((CarToy)toy).getCarBrand());
        }
        System.out.println(playingRoom.getGeneralToysPrice());
        RoomController controller = new RoomController();

        controller.run();

    }
}
