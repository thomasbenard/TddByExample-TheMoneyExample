abstract public class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
