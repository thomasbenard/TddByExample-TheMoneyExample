import java.util.Objects;

public class Franc extends Money{
    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
