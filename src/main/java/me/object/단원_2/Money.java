package me.object.단원_2;

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);
    private BigDecimal amount;

    public Money(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }

    public Money minus(Money calculateDiscountAmount) {
        return new Money(this.amount.subtract(calculateDiscountAmount.amount));
    }
}
