package courses.homework.task3.task3_1.model.entity;

public class Doll extends AbstractToy {
    private String dollType;

    public Doll(String dollType) {
        this.dollType = dollType;
    }

    public Doll(int price, int age, String gender, String dollType) {
        super(price, age, gender);
        this.dollType = dollType;
    }

    public Doll() {
        this("undefined");
    }

    public String getDollType() {
        return dollType;
    }

    public void setDollType(String dollType) {
        this.dollType = dollType;
    }

    @Override
    public String toString() {
        return "Doll dollType='" + dollType+"', " + super.toString();
    }
}
