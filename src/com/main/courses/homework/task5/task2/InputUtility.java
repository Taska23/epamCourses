package courses.homework.task5.task2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtility {

    private  Scanner scanner = new Scanner(System.in);
    private Pattern pattern = Pattern.compile("^[0-9]+[\\s;,][0-9]+[\\s;,][0-9]+");
    private int amount;
    private int low;
    private int high;


    public void getParameters(){
        System.out.println("Input parameters - > ");
        String line = scanner.nextLine();
        if (pattern.matcher(line).matches()) {
            String[] arguments = line.split("[;,\\s]");
            amount = Integer.parseInt(arguments[0]);
            low = Integer.parseInt(arguments[1]);
            high = Integer.parseInt(arguments[2]);
            if (amount > (high - low) + 2)
                throw new IllegalArgumentException("Set cannot be created with such parameters");
        }
        else {
            throw new IllegalArgumentException("Wrong input.");
        }
    }

    public int getAmount() {
        return amount;
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }
}
