package courses.homework.task5.task2;


public class Main {
    public static void main(String[] args) {
            try {
                CollectionGenerator collectionGenerator = new CollectionGenerator();
                collectionGenerator.display();
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
    }
}
