package Models.RationalMadels;

public class MultModel extends MainModel {

    public MultModel() {
        super.x = "x";
    }

    @Override
    public String result() {

        return String.format("%d/%d", a * m, b * n);
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
        return this.x;
    }

    @Override
    public void setX(String value) {
        super.x = value;
    }

}
