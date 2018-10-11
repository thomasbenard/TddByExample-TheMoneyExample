import java.util.Objects;

public class Franc extends Money{
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc Franc = (Franc) o;
        return amount == Franc.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
