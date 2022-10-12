public class Figure {

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figure(double a) {
        this(a, a);
    }

    private double a;
    private double b;

    public double getArea() {
        double result = a * b;
        return result;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return String.format("Класс: Аргумент a:\n%s\nАргумент b: %s", this.getClass(), this.a, this.b);
    }

}
