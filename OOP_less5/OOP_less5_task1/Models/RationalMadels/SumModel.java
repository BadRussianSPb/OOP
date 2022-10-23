package Models.RationalMadels;

public class SumModel extends MainModel {

    public SumModel() {
        super.x = "+";
    }

    @Override
    public String result() {
        if (b == n) {
            return String.format("%d/%d", a + m, n);
        } else {
            return String.format("%d/%d", (a * n) + (m * b), b * n);
        }
    }

    @Override
    public void setA(int value) {
        super.a = value;

    }

    @Override
    public void setB(int value) {
        super.b = value;

    }

    @Override
    public void setM(int value) {
        super.m = value;
    }

    @Override
    public void setN(int value) {
        super.n = value;
    }

    @Override
    public String getX() {
        return x;
    }

    @Override
    public void setX(String value) {
        super.x = value;
    }

}
