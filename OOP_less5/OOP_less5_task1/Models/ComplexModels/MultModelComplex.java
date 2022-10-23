package Models.ComplexModels;

public class MultModelComplex extends ComplexModel {

    public MultModelComplex() {
        super.x = "x";
    }

    @Override
    public String result() {
        if ((a * n) + (b * m) > 0) {
            return String.format("%d + i%d", (a * m) - (b * n), (a * n) + (b * m));
        } else {
            if ((a * n) + (b * m) == 0) {
                return String.format("%d", (a * m) - (b * n));
            } else {
                return String.format("%d - i%d", (a * m) - (b * n), ((a * n) + (b * m)) * -1);
            }
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
