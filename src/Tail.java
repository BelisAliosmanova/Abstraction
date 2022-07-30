public class Tail {
    double length;
    double width;
    String color;

    public void moveTail(){
        System.out.println("The tail is moving");
    }

    @Override
    public String toString() {
        return "Tail{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    public Tail() {
        this.length = 0.2;
        this.width = 0.05;
        this.color = "grey";
    }
}
