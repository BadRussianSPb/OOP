package Models.ComplexModels;

public class DiffModelComplex extends ComplexModel {

    public DiffModelComplex() {
        super.x = "-";
    }

    @Override
    public String result() {
        if (b - n > 0) {
            return String.format("%d + i%d", a - m, b - n);
        } else {
            if (b - n == 0) {
                return String.format("%d", a - m, b - n);
            } else {
                return String.format("%d - i%d", a - m, ((b - n) * -1));
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
