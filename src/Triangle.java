public abstract class Triangle extends Shape{
    private double side1, side2, side3;
    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = (this.getSide1() + this.getSide2() + this.getSide3()) / 2;
        double area = Math.sqrt(p * (p-this.getSide1()) * (p - this.getSide2()) * (p - this.getSide3()));
        return area;
    }

    public double getPerimeter(){
        return this.getSide1() + this.getSide2() + this.getSide3();
    }

    @Override
    public String toString() {
        return "A Triangle with 3 sides: " + this.getSide1() + ", " + this.getSide2()
                + ", " + this.getSide3() +" has area of " + this.getArea()
                + " and perimeter of " + this.getPerimeter();
    }
}
