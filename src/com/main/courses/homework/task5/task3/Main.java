package courses.homework.task5.task3;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate("I write word with computer"));
        System.out.println(translator.translate("I make my homework"));

        addWords(translator);

        System.out.println(translator.translate("My program doing good translate"));
    }

    private static void addWords(Translator translator){
        translator.addWords("My", "Моя");
        translator.addWords("program", "программа");
        translator.addWords("doing", "делает");
        translator.addWords("good", "хороший");
        translator.addWords("translate", "перевод");
    }
}
