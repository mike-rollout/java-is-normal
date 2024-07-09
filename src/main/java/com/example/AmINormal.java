package com.example;

import java.util.Random;

public class AmINormal {
    private static final String[] QUOTES = {
        "You are unique!",
        "Normal is just a setting on the dryer.",
        "You are perfectly imperfect!",
        "Normality is a paved road: it's comfortable to walk, but no flowers grow on it."
    };

    public String isNormal() {
        Random random = new Random();
        boolean normal = random.nextBoolean();
        String quote = QUOTES[random.nextInt(QUOTES.length)];
        return normal ? "Yes, you are normal. " + quote : "No, you are not normal. " + quote;
    }

    public static void main(String[] args) {
        AmINormal amINormal = new AmINormal();
        System.out.println(amINormal.isNormal());
    }
}
