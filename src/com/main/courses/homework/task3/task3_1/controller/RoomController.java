package courses.homework.task3.task3_1.controller;



import courses.homework.task3.task3_1.model.Model;
import courses.homework.task3.task3_1.model.entity.AbstractToy;
import courses.homework.task3.task3_1.view.InputData;
import courses.homework.task3.task3_1.view.View;

import java.util.Comparator;

public class RoomController {
    private View view = new View();
    private Model model = new Model();

    public void run(){
        view.print("------------------- Start Program -----------------------");

        createEntities();

        sortEntities();

        selectEntities();

        countTotalPrice();
    }

    private void countTotalPrice() {
        view.print("------------------- Total price of toys -----------------------");
        view.print(String.valueOf(model.getTotalPriceOfToys()));
    }

    private void selectEntities() {
        view.print("------------------- Selection -----------------------");
        view.print("Enter selection parameters  (example: price,age,gender) ->");
        String[] selParameters = InputData.input().split(",");
        int price = Integer.parseInt(selParameters[0]);
        int age = Integer.parseInt(selParameters[1]);
        view.print(ConverterInString.convertArray(model.selectToysByPriceAgeGender(price,age,selParameters[2])));
    }

    private void sortEntities() {
        view.print("------------------- Sorting -----------------------");
        view.print("Please  toys sort parameter (price, age, gender) ->");
        String sortType = InputData.input().toLowerCase();

        Comparator<AbstractToy> comparator = null;
        switch (sortType){
            case "price":
                comparator = new Comparator<AbstractToy>() {
                @Override
                public int compare(AbstractToy o1, AbstractToy o2) {
                    return o1.getPrice()-o2.getPrice();
                }
            };break;
            case "age":
                comparator = new Comparator<AbstractToy>() {
                @Override
                public int compare(AbstractToy o1, AbstractToy o2) {
                    return o1.getAge()-o2.getAge();
                }
            };break;
            case "gender":
                comparator = new Comparator<AbstractToy>() {
                @Override
                public int compare(AbstractToy o1, AbstractToy o2) {
                    return o1.getGender().compareTo(o2.getGender());
                }
            };
        }
        view.print(ConverterInString.convertArray(model.sortToys(comparator)));
    }

    private void createEntities() {
        view.print("Enter number of toys you want to add ->");

        int numberOfToys = Integer.parseInt(InputData.input());

        view.print("Please enter toys types by pattern to add it in a list:");
        view.print("CAR;price,age,gender,carBrand");
        view.print("DOLL;price,age,gender,dollType");
        view.print("ROBOT;price,age,gender,bodyMaterial");

        for (int index = 0; index<numberOfToys;index++){
            view.print("Enter toy type ->");
            String toyPattern = InputData.input();
            AbstractToy toy = ToyParser.parse(toyPattern);
            model.addToyToPlayingRoom(toy);
        }
    }
}
