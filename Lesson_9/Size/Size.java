package Lesson_9.Size;

public enum Size {
    XXS(32){
        @Override
        public void getDescription() {
            super.getDescription();
            System.out.println("ДИТЯЧИЙ ОДЯГ.");
        }
    },
    XS(34), S(36), M(38), L(40);
    int euroSize;

    @Override
    public String toString() {
        return "Size{" +
                "euroSize=" + euroSize +
                '}';
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDescription(){
        System.out.println("Дорослий розмір.");
    }



}
