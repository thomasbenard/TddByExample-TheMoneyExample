import java.util.Objects;

public class Franc extends Money{
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
