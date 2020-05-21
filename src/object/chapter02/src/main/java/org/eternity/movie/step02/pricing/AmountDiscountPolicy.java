package object.chapter02.src.main.java.org.eternity.movie.step02.pricing;

import object.chapter02.src.main.java.org.eternity.money.Money;
import object.chapter02.src.main.java.org.eternity.movie.step01.DiscountCondition;
import object.chapter02.src.main.java.org.eternity.movie.step01.DiscountPolicy;
import object.chapter02.src.main.java.org.eternity.movie.step01.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
