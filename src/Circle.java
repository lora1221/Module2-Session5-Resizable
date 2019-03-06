public class Circle extends Shape {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString(){
        return "A Circle with radius = " + this.getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*(1 + percent/100));
    }

}
