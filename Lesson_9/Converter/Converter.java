package Lesson_9.Converter;

public class Converter {


    public  void calvin (int celsiy){
        int calvin = (int) (celsiy+273.15);
        System.out.println(celsiy +" Цельсія це - " + calvin + " по Фаренгейту.");
    }

    public Converter() {
    }

    public  void farengate (int celsiy){
        int farengate = celsiy+32;
        System.out.println(celsiy +" Цельсія це - " + farengate + " по Фаренгейту.");
    }


}
