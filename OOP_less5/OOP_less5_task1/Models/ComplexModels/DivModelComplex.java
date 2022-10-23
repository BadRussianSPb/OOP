package Models.ComplexModels;

public class DivModelComplex extends ComplexModel {

    public DivModelComplex() {
        super.x = ":";
    }

    @Override
    public String result() {
        int spamA = ((a * m) + (b * n)) / ((m * m) + (n * n));
        int spamB = ((m * b) + (a * n)) / ((m * m) + (n * n));

        if (spamB > 0) {
            return String.format("%d + i%d", spamA, spamB);
        } else {
            if ((a * n) + (b + m) == 0) {
                return String.format("%d", spamA);
            } else {
                return String.format("%d - i%d", spamA, spamB * -1);
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
