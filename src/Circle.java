public class Circle extends Shape{

    private int radius;

    public Circle(){}
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void getPerimeter() {
        System.out.println("perimeter of circle: " +(2*Math.PI*radius));
    }
}
