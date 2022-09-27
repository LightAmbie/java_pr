package mirea.ru.lazarev_pavel.kvbo0121.pr4_1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){

    }

    public Shape(String color, boolean filled){
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

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
