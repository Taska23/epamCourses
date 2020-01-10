package courses.projects.project_1.controller;

import courses.projects.project_1.model.Library;
import courses.projects.project_1.model.Publication;
import courses.projects.project_1.view.View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    private View view;
    private Library library;

    public Controller() {
        view = new View();
        library = new Library();
    }
    ArrayList<Publication> workingPublications = new ArrayList<Publication>();
    int commandNumber;
    Scanner scanner = new Scanner(System.in);


//        library.loadDefault(workingPublications);
//        System.out.println(workingPublications.toString());
//        library.save(workingPublications);
//        library.load(workingPublications);
//        System.out.println(workingPublications.toString());
//        library.setRndSubPublications(workingPublications);
//        System.out.println(workingPublications.toString());
//        library.save(workingPublications);
//        library.load(workingPublications);
//        System.out.println(workingPublications.toString());

        public void run(){
        while (true) {
            view.printAllCommands();
            commandNumber = scanner.nextInt();
            if (commandNumber == 9) {
                break;
            }
            handleCommand(commandNumber);
        }
    }
    public void handleCommand(int command) {
        switch (command) {
            case 1:
                System.out.println("Able tags: ");
                System.out.println("Enter finding tag: \"Science\",\"Fantastic\",\"Romans\"");
                String tmp1Input = scanner.next();
                for (Publication publication : workingPublications) {
                    if (tmp1Input.equalsIgnoreCase(publication.getTags())){
                        System.out.println("publication id"+ publication.getId() + " have tag " + publication.getTags());
                    } else {

                    }
                }
                break;
            case 2:
                System.out.println("Enter id of publication, you want to see links: ");
                int tmp2Input = scanner.nextInt();
                for (Publication publication : workingPublications) {
                    if (tmp2Input == (publication.getSubPublications().getId())){
                        System.out.println("Publication id" + tmp2Input + " have links with publication id" + publication.getSubPublications().getId()+ ".");
                    }
                }

                break;
            case 3:
                System.out.println("Enter id  of publication you want to see references");
                int tmp3Input = scanner.nextInt();
                System.out.println("Publication id"+tmp3Input + "referenced to publication id" + workingPublications.get(tmp3Input).getId());
                break;
            case 4:
                library.sortPublicationsByYear(workingPublications);
                break;
            case 5:
                System.out.println(workingPublications.toString());
                break;
            case 6:
                library.save(workingPublications);
                break;
            case 7:
                library.load(workingPublications);
                break;
            case 8:
                library.loadDefault(workingPublications);
                break;
            default:
                view.printMessage("Input invalid");
        }
    }
}
