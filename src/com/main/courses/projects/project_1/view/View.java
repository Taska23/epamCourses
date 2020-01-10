package courses.projects.project_1.view;

import courses.homework.task2.task2_2.model.Book;
import courses.projects.project_1.model.Publication;

public class View {
    public void printAllCommands() {
        System.out.println("Select:" +
                "\n1.Show all Publications with same Tag\n" +
                "2.Show all publications that link to the selected\n" +
                "3.Show all publications referenced by the selected\n" +
                "4.Sort books by year\n" +
                "5.Print all\n" +
                "6.Save all\n" +
                "7.Load all from last save\n"+
                "8.Reset to default\n"+
                "9.Exit\n");
    }

    public void printAll(Publication[] publications) {
        for (Publication publication : publications) {
            if (publication != null) {
                System.out.println(publication);
            }
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }


}
