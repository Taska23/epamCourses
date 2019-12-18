package com.epam.courses.homework.task3.task3_1;


import com.epam.courses.homework.task3.task3_1.controller.RoomController;

public class Main {
    public static void main(String[] args) {


        /*PlayingRoom<AbstractToy> playingRoom = new PlayingRoom<>();
        playingRoom.addToy(new CarToy(100, 1,"male","BMW"));
        playingRoom.addToy(new CarToy(99, 2,"male","Mercedez1"));
        playingRoom.addToy(new CarToy(98, 3,"female","Mercedez2"));
        playingRoom.addToy(new CarToy(97, 4,"male","Mercedez3"));
        playingRoom.addToy(new CarToy(96, 5,"female","Mercedez4"));
        playingRoom.addToy(new CarToy(95, 6,"male","Mercedez5"));
        playingRoom.addToy(new CarToy(94, 7,"male","Mercedez6"));
        playingRoom.addToy(new CarToy(93, 8,"male","Mercedez7"));
        playingRoom.addToy(new CarToy(92, 9,"mail","Mercedez8"));
        playingRoom.addToy(new CarToy(91, 10,"female","Mercedez9"));
        playingRoom.addToy(new CarToy(90, 11,"female","Mercedez10"));
        playingRoom.addToy(new CarToy(89, 12,"male","Mercedez11"));
        playingRoom.addToy(new CarToy(88, 13,"female","Mercedez12"));
        playingRoom.addToy(new CarToy(88, 13,"female","Mercedez12"));
        playingRoom.addToy(new CarToy(88, 13,"female","Mercedez12"));
        playingRoom.addToy(new CarToy(88, 13,"female","Mercedez12"));
        playingRoom.addToy(new CarToy(88, 13,"female","Mercedez12"));
        playingRoom.addToy(new CarToy(88, 13,"female","Mercedez12"));
        playingRoom.addToy(new CarToy(88, 13,"female","Mercedez12"));

        AbstractToy[] abstractToys = playingRoom.getToysByParameters(92,12,"female");
        for (AbstractToy toy:abstractToys) {

            System.out.println(((CarToy)toy).getCarBrand());
        }
        System.out.println(playingRoom.getGeneralToysPrice());*/
        RoomController controller = new RoomController();

        controller.run();

    }
}
