public class Mouse extends Animal implements Suckable{
    @Override
    public void eat() {
        System.out.println("The mouse is eating");
    }

    @Override
    public void move() {
        System.out.println("The mouse is moving");
    }

    @Override
    public void suck() {
        System.out.println("The mouse is sucking");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
