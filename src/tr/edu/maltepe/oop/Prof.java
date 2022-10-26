package tr.edu.maltepe.oop;

public class Prof {
    private String name;

    public Prof(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void read(Book book) {
        System.out.println("Now " + this.getName() + " is reading " + book.getName());
    }

    public void teach(Student st, Book book) {
        System.out.println("Now " + this.getName() + " is teaching " + book.getName() + " to " + st.getName());
        st.read(book);
}
}

