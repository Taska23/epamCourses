package courses.homework.task5.task1.controller.parser.validator;

import java.util.regex.Pattern;

public class RecordValidator {

    public static String delimiter = "[;\\s]*";

    public enum Patterns{
        SURNAME("(^[A-Z][a-z]+[-]?[A-Z]?[a-z]+)"),
        NAME("([A-Z][a-z]+)"),
        BIRTHDAY("(0[1-9]|[12][0-9]|3[01])[-/.](0[1-9]|1[012])[-/.](19|20)\\d\\d"),
        TELEPHONE("([+]*38[(]?[0-9]{1,4}[)]?[-\\s./0-9]*)"),
        ADDRESS("([A-Z][a-z]+[,]+[0-9]+[A-Za-z]?[,]+[0-9]+)");

        private String pattern;

         Patterns(String pattern){
             this.pattern = pattern;
         }
         public String getPattern(){
             return pattern;
         }
    }



    public static Pattern createValidator(){
        String result = "";
        for (Patterns patterns : Patterns.values())
            result = result + patterns.pattern + RecordValidator.delimiter;
        return Pattern.compile(result);
    }

    public static Pattern compilePattern(Patterns pattern){
        return Pattern.compile(pattern.getPattern());
    }



}
