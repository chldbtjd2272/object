package me.object.단원_2;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money money;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money money, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.money = money;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return money;
    }

    public Money calculateMoneyFee(Screening screening) {
        return getFee().minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
