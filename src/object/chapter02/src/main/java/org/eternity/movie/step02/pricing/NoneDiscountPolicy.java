package object.chapter02.src.main.java.org.eternity.movie.step02.pricing;

import object.chapter02.src.main.java.org.eternity.money.Money;
import object.chapter02.src.main.java.org.eternity.movie.step01.DiscountPolicy;
import object.chapter02.src.main.java.org.eternity.movie.step01.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}

