package tr.edu.maltepe.oop;

import tr.edu.maltepe.oop.Prof;
import tr.edu.maltepe.oop.Student;

public class Main {
    public static void main(String[] args) {
        Student Tunahan = new Student("Tunahan");
        Prof Ensar = new Prof("Ensar");
        Book OOPBook = new Book( " OOP book");
        Ensar.read(OOPBook);
        Ensar.teach(Tunahan , OOPBook);
}
}




