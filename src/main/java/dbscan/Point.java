package dbscan;

public class Point {
    private double x;

    private double y;


    Point(double a, double b) {
        x = a;
        y = b;
    }

    public double getX() {

        return x;

    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {

        return y;

    }

    public void setY(double y) {
        this.y = y;
    }
}

