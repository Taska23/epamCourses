package courses.homework.task2.task2_1;

public class Circle extends Shape {
    private double r;

    public Circle(String colorShape, double r) {
        super(colorShape);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + r;
    }

    @Override
    public double calcArea() {
        return Math.PI * (r * r);
    }

    @Override
    public void draw() {
        System.out.println(this + ", area = " + calcArea());
    }
}
