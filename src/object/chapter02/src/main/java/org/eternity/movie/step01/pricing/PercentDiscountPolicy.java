package object.chapter02.src.main.java.org.eternity.movie.step01.pricing;

import object.chapter02.src.main.java.org.eternity.money.Money;
import object.chapter02.src.main.java.org.eternity.movie.step01.DiscountCondition;
import object.chapter02.src.main.java.org.eternity.movie.step01.DiscountPolicy;
import object.chapter02.src.main.java.org.eternity.movie.step01.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
