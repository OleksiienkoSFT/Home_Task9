package Lesson_9;

import Lesson_9.Beer_Mix.Beer;
import Lesson_9.Beer_Mix.Cola;
import Lesson_9.Print.Book;
import Lesson_9.Print.Magazine;
import Lesson_9.Print.Printable;
import Lesson_9.Seasons.Seasons;
import Lesson_9.Seasons.SeasonsOfTheYear;
import Lesson_9.Size.*;

import java.util.Arrays;

import static Lesson_9.Size.Atelier.*;

public class Main {
    public static void main(String[] args) {
        // Task 6 beer & cola
        System.out.println();
        System.out.println("Task 6");;
        Cola cola = new Cola();
        cola.isAlcoholic();
        Beer beer = new Beer();
        beer.isAlcoholic();

        // Print
        System.out.println();
        System.out.println("Task 9");;
        Book book = new Book("Bukvar");
        Book book1 = new Book("Java development");
        Magazine magazine = new Magazine("Maxim");
        Magazine magazine1 = new Magazine("Crocodile");

        Printable[] arrPrint = {book1,book,magazine1, magazine};
        for (int i = 0; i < arrPrint.length; i++) {
            arrPrint[i].print();
        }

        System.out.println("Only printMagazines!");
        System.out.println();
        magazine1.printMagazines(arrPrint);
        System.out.println();

        System.out.println("Only printBooks");
        System.out.println();
        book.printBooks(arrPrint);

        // Seasons
        System.out.println();
        System.out.println("Task Seasons");
            System.out.println(Arrays.toString(Seasons.values()));

        System.out.println();
        Seasons.Summer.getDescription();
        Seasons.Autumn.getAverageTemp();
        Seasons.Spring.getLove_Seasons(Seasons.Spring);
        Seasons.Winter.toString();

        // Clothes
        System.out.println("Task Clothes.");
        System.out.println();

        T_shirt t_shirt = new T_shirt(Size.S,"white",100);
        Tie tie = new Tie(Size.XXS,"ping", 200);
        Pants pants = new Pants(Size.L,"brown", 300);
        Skirt skirt =  new Skirt(Size.XS, "orange", 400 );

        Clothes [] arrClothes = {tie,t_shirt,pants,skirt};

        Atelier atelier = new Atelier();
        atelier.DressMan(arrClothes);
        System.out.println();
        atelier.DressWoman(arrClothes);
        }
    }

