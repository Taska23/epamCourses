package courses.homework.task5.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {

    public Map<String, String> words = new HashMap<>();
    private Scanner scanner;

    public Translator(){
        File file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\task5\\task3\\words.txt");
        try {
            this.scanner = new Scanner(file);
            readFromFile();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
    public void addWords(String eng, String russ) {
        words.put(eng.toLowerCase(),russ.toLowerCase());
    }

    public String translate(String line){
        String[] text = line.split("[,\\s]");
        StringBuilder stringBuilder = new StringBuilder();

        for (String txt : text) {
            String translatedWord = words.get(txt.toLowerCase());
            if (translatedWord != null)
                stringBuilder.append(translatedWord).append(" ");
            else
                stringBuilder.append(txt).append(" ");
        }
        return stringBuilder.toString();
    }

    private void readFromFile(){
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] words = line.split("[\\s]");
            addWords(words[2], words[1]);
        }
        scanner.close();
    }

}
