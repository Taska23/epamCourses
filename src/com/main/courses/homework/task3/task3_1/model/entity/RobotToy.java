package courses.homework.task3.task3_1.model.entity;

public class RobotToy extends AbstractToy {
    private String bodyMaterial;

    public RobotToy(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public RobotToy(int price, int age, String gender, String bodyMaterial) {
        super(price, age, gender);
        this.bodyMaterial = bodyMaterial;
    }

    public RobotToy() {
        this("undefined");
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;

    }

    @Override
    public String toString() {
        return "RobotToy bodyMaterial='" + bodyMaterial +"', "+ super.toString();
    }
}
