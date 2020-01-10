package courses.homework.task5.task1.view;

public class RecordView {

    public static final String ERROR_MESSAGE = "\n\tWrong input. \n";
    public static final String ADDED_MESSAGE = "\n\tRecord has added.\n";
    public static final String RESULT_MESSAGE = "\n\t Records : \n";
    public static final String INPUT_PATTERN = "{surname}; {name}; {birthday(dd/mm/yyyy)}; {telephone(380...); {address(street,house,flat)}}";
    public static final String EXIT_MESSAGE = "Input {exit} to exit";
    public static final String INPUT_MESSAGE = "\n\tRecord - >";

    public void printResult(String msg, String result){
        System.out.println(msg + result);
    }
    public void printResult(String msg){
        System.out.println(msg);
    }
}
