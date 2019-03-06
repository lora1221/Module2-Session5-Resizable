public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.6);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(10);

        System.out.println("Before change: ");
        for (Shape shape : shapes) {
            System.out.println("\t" + shape);
            shape.resize(Math.floor(Math.random() * 100));
        }

        System.out.println("\n\nAfter change:");
        for (Shape shape : shapes) {
            System.out.println("\t" + shape);
        }
    }
}
