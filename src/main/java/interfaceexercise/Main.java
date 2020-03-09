package interfaceexercise;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(3);
        Circle circle = new Circle(6);
        display(rectangle);
        display(square);
        display(circle);
    }


    static void display(Figure figure) {
        System.out.println(figure.area());
        System.out.println(figure.perimeter());
    }
}
