package tr.edu.maltepe.oop;

public class Student {
    private String name;
    public Student(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void read(Book book) {
        System.out.println("Now "+ this.getName() + " is reading "+ book.getName());
}
}