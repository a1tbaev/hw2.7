public class Square extends Shape{

    private int allSide;

    Square(){}

    public Square(int allSide) {
        this.allSide = allSide;
    }

    public int getAllSide() {
        return allSide;
    }

    public void setAllSide(int allSide) {
        this.allSide = allSide;
    }

    @Override
    public void getPerimeter() {
        System.out.println("perimeter of square: " + (allSide * 4));
    }
}
