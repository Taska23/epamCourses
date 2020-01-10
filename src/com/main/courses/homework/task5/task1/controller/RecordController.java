package courses.homework.task5.task1.controller;

import courses.homework.task5.task1.controller.parser.RecordParser;
import courses.homework.task5.task1.model.RecordModel;
import courses.homework.task5.task1.view.RecordView;

import java.util.Scanner;

public class RecordController {

    private Scanner scanner;
    private RecordModel recordModel;
    private RecordView recordView;
    private RecordParser recordParser;

    public RecordController(){
        scanner = new Scanner(System.in);
        recordModel = new RecordModel();
        recordView = new RecordView();
        recordParser = new RecordParser();
    }


    public void doDialog(){
        recordView.printResult(RecordView.INPUT_PATTERN);
        recordView.printResult(RecordView.EXIT_MESSAGE);
        while (true){
            recordView.printResult(RecordView.INPUT_MESSAGE);
           String line = scanner.nextLine();
           if (recordParser.parseText(line))
               recordView.printResult(RecordView.ADDED_MESSAGE);
           else if (line.equals("exit")) {
               recordView.printResult(RecordView.RESULT_MESSAGE, recordModel.getRecordsRepresentation(recordParser.getRecords()));
               break;
           }
           else if (!recordParser.parseText(line))
               recordView.printResult(RecordView.ERROR_MESSAGE);

       }
    }



}
