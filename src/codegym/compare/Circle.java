package codegym.compare;

public class Circle implements Comparable<Circle> {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(Circle o) {
        double result = radius - o.radius;
        if (result == 0)
            return 0;
        return result > 0 ? 1 : -1;
    }
}
