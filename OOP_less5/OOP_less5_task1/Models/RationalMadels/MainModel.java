package Models.RationalMadels;

import Models.Model;

public abstract class MainModel implements Model {

    int a, b, m, n;
    String x;

    @Override
    public String toString() {
        return String.format("%d/%d %s %d/%d", a, b, x, m, n);
    }
}
