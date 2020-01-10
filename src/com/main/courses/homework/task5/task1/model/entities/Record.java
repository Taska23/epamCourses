package courses.homework.task5.task1.model.entities;

public class Record {

    private String surname;
    private String name;
    private String birthday;
    private String telephone;
    private String address;

    public Record(String surname, String name, String birthday, String telephone, String address){
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.telephone = telephone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Record{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                "}\n";
    }

    public static Record createRecord(String... args){
        for (int i = 0; i < args.length; i++)
            args[i] = args[i].trim();

        return new Record(args[0],args[1],args[2],args[3],args[4]);
    }
}
