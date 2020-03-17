package l9;

import java.util.Objects;

public class Dumpling {

    private String fillingType;
    private double meatPortion;

    public Dumpling(String fillingType, double meatPortion) {
        this.fillingType = fillingType;
        this.meatPortion = meatPortion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dumpling dumpling = (Dumpling) o;
        return Double.compare(dumpling.meatPortion, meatPortion) == 0 &&
                Objects.equals(fillingType, dumpling.fillingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fillingType, meatPortion);
    }

    @Override
    public String toString() {
        return "Dumpling{" +
                "fillingType='" + fillingType + '\'' +
                ", meatPortion=" + meatPortion +
                '}';
    }
}
