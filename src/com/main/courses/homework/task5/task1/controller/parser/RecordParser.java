package courses.homework.task5.task1.controller.parser;

import courses.homework.task5.task1.controller.parser.validator.RecordValidator;
import courses.homework.task5.task1.model.entities.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RecordParser {

    private List<Record> records;
    private Pattern pattern;

    public RecordParser(){
        pattern = RecordValidator.createValidator();
        records = new ArrayList<>();
    }

    public boolean isValidText(String text){
        return pattern.matcher(text).matches();
    }

    public boolean parseText(String text){
        if (isValidText(text)) {
            records.add(Record.createRecord(text.split(";")));
            return true;
        }
        return false;
    }

    public List<Record> getRecords() {
        return records;
    }
}
