package object.chapter02.src.main.java.org.eternity.movie.step02;

import object.chapter02.src.main.java.org.eternity.money.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}

