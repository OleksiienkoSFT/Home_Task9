package Lesson_9.Beer;

public class BeerLover implements Drink {
    @Override
    public void askMore() {
        System.out.println("Ще бокальчик, будь-ласка!!");
    }

    @Override
    public void sayThankYou() {
        System.out.println("Дякую Бро!!");
    }

    @Override
    public void isReadyToGoHome() {
        System.out.println("Давай по останньому.. і додому..");
    }

    @Override
    public void sleepOnTheFloor() {
        System.out.println("Зараз 5 хвилин відпочину і йдемо..");
    }
}
