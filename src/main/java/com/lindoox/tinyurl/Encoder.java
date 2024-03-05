package com.lindoox.tinyurl;

public class Encoder {
    private static final String BASE_58 = "123456789abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ";
    private static final Integer BASE = 58;
    public static String encode(final Integer number) {

        StringBuilder encoded = new StringBuilder();
        Integer divisionResult = number;
        Integer remainder = divisionResult % BASE;

        while (remainder != 1) {
            encoded.insert(0, BASE_58.charAt(remainder));
            divisionResult = divisionResult/BASE;
            remainder = divisionResult % BASE;
        }
    }
}
