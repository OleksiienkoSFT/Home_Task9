package Lesson_9.Size;

public class Pants extends Clothes implements MenClothes,WomanClothes {
    public Pants(Size size, String color, int value) {
        super(size, color, value);
    }

    @Override
    public void DressMan() {

    }

    @Override
    public void DressMan(Clothes[] clothes) {

    }

    @Override
    public void DressWoman() {

    }

    @Override
    public void DressWoman(Clothes[] clothes) {

    }
}
