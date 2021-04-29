package me.object.단원_2;

public class SequenceCondition implements DiscountCondition {
    private int seq;

    public SequenceCondition(int seq) {
        this.seq = seq;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(seq);
    }
}
