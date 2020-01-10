package courses.homework.task5.task2;

import java.util.*;

public class CollectionGenerator{

    private Random random;
    private InputUtility inputUtility;
    private int amount;
    private int low;
    private int high;
    private int threshold;
    private List<Number> list;
    private Set<Number> set;

    {
        this.random = new Random();
        this.inputUtility = new InputUtility();
        inputUtility.getParameters();
    }

    public CollectionGenerator(){
        this.amount = inputUtility.getAmount();
        this.low = inputUtility.getLow();
        this.high = inputUtility.getHigh();

        this.threshold = ((high - low) + 1) + low;
        this.list = generateList();
        this.set = generateSet();
    }

    public List<Number> generateList(){
        List<Number> result = new LinkedList<>();
        for (int i = 0; i < amount; i++){
            Number number = random.nextInt(threshold);
            result.add(number);
        }
        return result;
    }


    public Set<Number> generateSet(){
        Set<Number> result = new HashSet<>();
        Set<Number> addedNumbers = new HashSet<>();
        int i = 0;
        while (i != amount){
            int number = random.nextInt(threshold);
            if (!addedNumbers.contains(number)) {
                result.add(number);
                addedNumbers.add(number);
                i++;
            }
        }
        return result;
    }

    public void display(){
        System.out.println("List is : \n"+list+"\n");
        System.out.println("Set is : \n"+set+"\n");
    }

}
