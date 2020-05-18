package object.chapter02.src.main.java.org.eternity.movie.step02;

import object.chapter02.src.main.java.org.eternity.money.Money;

public class Reservation {
    private Customer customer;
    private object.chapter02.src.main.java.org.eternity.movie.step02.Screening Screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, object.chapter02.src.main.java.org.eternity.movie.step02.Screening Screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.Screening = Screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
