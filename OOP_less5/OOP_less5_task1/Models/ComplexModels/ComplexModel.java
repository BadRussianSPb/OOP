package Models.ComplexModels;

import Models.Model;

public abstract class ComplexModel implements Model {
    int a, b, m, n;
    String x;

    @Override
    public String toString() {
        return String.format("%d + i%d %s %d + i%d", a, b, x, m, n);
    }
}
