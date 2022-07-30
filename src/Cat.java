public class Cat extends Animal implements Suckable, Huntable{

    String eyeColor;

    Tail tail;

    @Override
    public void eat() {
        System.out.println("The cat is eating!");
    }

    @Override
    public void move() {
        System.out.println("The cat is running!");
    }

    public void hunt(Animal pray){
        System.out.println("The cat is catching " + pray);
    }

    @Override
    public void preparation() {
        System.out.println("The cat is sharping its nails");
    }

    @Override
    public void practice() {
        System.out.println("The cat is training to hunt");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void suck() {
        System.out.println("The cat is sucking");
    }

    public Cat(){
        super();
        this.eyeColor = "green";
        this.tail = new Tail();
    }
}
