package object.chapter02.src.main.java.org.eternity.movie.step02.pricing;


import object.chapter02.src.main.java.org.eternity.money.Money;
import object.chapter02.src.main.java.org.eternity.movie.step02.DefaultDiscountPolicy;
import object.chapter02.src.main.java.org.eternity.movie.step02.DiscountCondition;
import object.chapter02.src.main.java.org.eternity.movie.step02.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
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
