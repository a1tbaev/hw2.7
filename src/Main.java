public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(1,2,3);
        triangle.getPerimeter();

        Shape rectangle = new Rectangle(3,4,3,4);
        rectangle.getPerimeter();

        Shape circle = new Circle(2);
        circle.getPerimeter();

        Shape square = new Square(3);
        square.getPerimeter();

        Shape pentagon = new Pentagon(1,2,3,4,5);
        pentagon.getPerimeter();
    }
}