package Lesson_9.Print;

public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void printBooks(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book){
                System.out.println(((Book) printable[i]).name);
            }
        }
    }

}
