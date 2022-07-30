public abstract class Animal {
    double weight;
    int age;
    String name;

    public abstract void eat();

    public void sleep(){
        System.out.println("The animal is sleeping!");
    }

    public abstract void move();

    public Animal(){
        this.weight = 0;
        this.age = 0;
        this.name = "unknown";
    }
}
