import java.util.Objects;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
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
