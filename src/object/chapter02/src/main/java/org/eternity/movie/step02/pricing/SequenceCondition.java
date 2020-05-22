package object.chapter02.src.main.java.org.eternity.movie.step02.pricing;

import object.chapter02.src.main.java.org.eternity.movie.step02.DiscountCondition;
import object.chapter02.src.main.java.org.eternity.movie.step02.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}

