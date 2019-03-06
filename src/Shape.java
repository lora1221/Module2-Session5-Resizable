public abstract class Shape implements Resizable{
    private String color;
    private boolean filled;
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A Shape with color of " + this.getColor() + (filled ? " filled" : " not filled");
    }

    public abstract void resize(double percent);
}
