package object.chapter02.src.main.java.org.eternity.movie.step02.pricing;


import object.chapter02.src.main.java.org.eternity.money.Money;
import object.chapter02.src.main.java.org.eternity.movie.step02.DefaultDiscountPolicy;
import object.chapter02.src.main.java.org.eternity.movie.step02.DiscountCondition;
import object.chapter02.src.main.java.org.eternity.movie.step02.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
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
