public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
//        Animal animal1 = new Mouse();
//        Animal[] animals = new Animal[4];
//        animals[0] = new Cat();
//        animals[1] = new Mouse();
//        animals[0].hunt(animal1);
        Cat[] cats = new Cat[2];
        Mouse[] mice = new Mouse[5];
        cats[0] = new Cat();
        mice[0] = new Mouse();
        cats[0].hunt(mice[0]);

        System.out.println(cats[0].tail);
        cats[0].tail.moveTail();
    }
}