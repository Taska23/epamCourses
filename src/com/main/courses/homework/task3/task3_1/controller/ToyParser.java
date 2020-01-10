package courses.homework.task3.task3_1.controller;


import courses.homework.task3.task3_1.model.entity.*;

public class ToyParser {
    public static AbstractToy parse(String token){
        String objectName = token.substring(0, token.indexOf(";"));
        String [] parameters = token.split(";")[1].split(",");

        int price = Integer.parseInt(parameters[0]);
        int age = Integer.parseInt(parameters[1]);

        switch (ToyEnum.valueOf(objectName)){
            case CAR:return new CarToy(price,age,parameters[2],parameters[3]);
            case DOLL:return new Doll(price,age,parameters[2],parameters[3]);
            case ROBOT:return new RobotToy(price,age,parameters[2],parameters[3]);
        }
        return null;
    }
}
