import java.util.Objects;

public class Franc extends Money{
    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier, null);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
