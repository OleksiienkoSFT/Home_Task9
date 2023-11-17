package Lesson_9.Print;

public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
    public void   printMagazines(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine){
                System.out.println(((Magazine) printable[i]).name);
            }
        }
    }
}
