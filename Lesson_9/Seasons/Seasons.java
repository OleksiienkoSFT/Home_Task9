package Lesson_9.Seasons;

public enum Seasons {
    Winter("Зима. Холодна пора року.", -10),
    Spring("Весна. Не дуже холодна пора року.", 5),
    Summer("літо. Тепла пора року.", 30){
        @Override
        public void getDescription() {
            super.getDescription();
            System.out.println("Тепла пора року.");
        }
    },
    Autumn("Осінь. Не дуже тепла пора року.", 15);
    private String title;
    private int averageTemp;

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' +
                ", averageTemp=" + averageTemp +
                '}';
    }

    Seasons(String title, int averageTemp) {
        this.title = title;
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public void getLove_Seasons (Seasons title){
        switch (title){
            case Autumn:
                System.out.println("Я люблю Осінь!");
                break;
            case Summer:
                System.out.println("Я люблю Літо!");
                break;
            case Spring:
                System.out.println("Я люблю Весну!");
                break;
            case Winter:
                System.out.println("Я люблю Зиму!");
                break;
        }
    }

    public void getDescription(){
            System.out.println("Холодна пора року.");
        }
    }


