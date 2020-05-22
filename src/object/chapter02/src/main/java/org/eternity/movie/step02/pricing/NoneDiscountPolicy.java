package object.chapter02.src.main.java.org.eternity.movie.step02.pricing;


import object.chapter02.src.main.java.org.eternity.money.Money;
import object.chapter02.src.main.java.org.eternity.movie.step02.DiscountPolicy;
import object.chapter02.src.main.java.org.eternity.movie.step02.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}

