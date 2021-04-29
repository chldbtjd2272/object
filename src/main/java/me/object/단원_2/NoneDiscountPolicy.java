package me.object.단원_2;

import static me.object.단원_2.Money.ZERO;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return ZERO;
    }
}
