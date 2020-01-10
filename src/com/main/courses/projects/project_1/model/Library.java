package courses.projects.project_1.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class Library {

    String filename = "Publications.dat";
    Random rnd = new Random();
    public boolean save (ArrayList toSave){
     try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
         oos.writeObject(toSave);
         System.out.println("File has been written");
         return true;
     }catch (Exception ex){
         ex.getMessage();
         return false;
     }
    }
    public boolean load (ArrayList toLoad){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            toLoad=((ArrayList<Publication>)ois.readObject());
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }


    }
    public boolean loadDefault(ArrayList toLoad){

        String[] BOOKS_NAME = {
                "The little prince", "Inhabited island", "Dead Souls", "War and Peace Novel", "The Master and Margarita", "The Twelve Chairs", "The Hound of the Baskervilles",
                "In Search of the Castaways", "D'Artagnan and the Three Musketeers", "Crime And Punishment", "The Kobzar", "Viy"};
         String[] AUTHORS_NAME = {
                "Kirill Volinskiy", "Antoine de Saint-Exupéry", "Arkady and Boris Strugatsky", "Leo Tolstoy", "Mikhail Bulgakov", "Ilf and Petrov", "Arthur Conan Doyle",
                "Fyodor Dostoevsky", "Jules Verne", "Alexandre Dumas", "Taras Shevchenko", "Nikolai Gogol"};
         String[] PUBLISHERS = {"LitRes", "Ecsmo", "Best Publisher Ever"};
         String[] TAGS = {"Science","Fantastic","Romans"};
        try{
            for (int i = 0; i < 12; ++i) {
                toLoad.add(new PublicationBuilder()
                        .withAuthor(AUTHORS_NAME[i])
                        .withName(BOOKS_NAME[i])
                        .withPublisher(PUBLISHERS[rnd.nextInt(PUBLISHERS.length)])
                        .withPublishYear((rnd.nextInt(2019)))
                        .withPagesNumber(rnd.nextInt(1000))
                        .withId(i)
                        .withTags(TAGS[rnd.nextInt(TAGS.length)])
                        .build());
            }
            setRndSubPublications(toLoad);
            return true;
        }catch (Exception ex){

            return false;
        }
    }
    public void setRndSubPublications(ArrayList<Publication> toSet) {
        for (Publication publication: toSet) {
            if (publication != null){
                publication.setSubPublications(toSet.get(rnd.nextInt(toSet.size())));
            }
        }
    }
    public void sortPublicationsByYear(ArrayList<Publication> toSort){
        //todo
    }
}


