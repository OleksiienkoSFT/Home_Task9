package Lesson_9.Size;

public class T_shirt extends Clothes implements MenClothes, WomanClothes {
    public T_shirt(Size size, String color, int value) {
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
