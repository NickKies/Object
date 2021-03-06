package object.chapter04.src.main.java.org.eternity.movie.step02;

import object.chapter04.src.main.java.org.eternity.money.Money;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}