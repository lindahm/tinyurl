package com.lindoox.tinyurl;

import java.util.ArrayDeque;
import java.util.Deque;

public class Encoder {
    /**
     *  0 = 1    10 = b    20 = m    30 = x    40 = H    50 = T
     *  1 = 2    11 = c    21 = n    31 = y    41 = J    51 = U
     *  2 = 3    12 = d    22 = p    32 = z    42 = K    52 = V
     *  3 = 4    13 = e    23 = q    33 = A    43 = L    53 = W
     *  4 = 5    14 = f    24 = r    34 = B    44 = M    54 = X
     *  5 = 6    15 = g    25 = s    35 = C    45 = N    55 = Y
     *  6 = 7    16 = h    26 = t    36 = D    46 = P    56 = Z
     *  7 = 8    17 = i    27 = u    37 = E    47 = Q    57 = -
     *  8 = 9    18 = j    28 = v    38 = F    48 = R    58 = _
     *  9 = a    19 = k    29 = w    39 = G    49 = S
     */
    private static final String BASE_58 = "123456789abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ-_";
    private static final Integer BASE = 58;
    private static final Integer ENCODED_STRING_LENGTH = 8;
    public static String encode(final long number) {
        StringBuilder encoded = new StringBuilder();
        long divisionResult = number;
        int remainder;

        while (divisionResult != 0) {
            remainder = (int) (divisionResult % BASE);
            encoded.insert(0, BASE_58.charAt(remainder));
            divisionResult = divisionResult / BASE;
        }

        int numbersOfZeroPrefix = ENCODED_STRING_LENGTH - encoded.length();
        for (int i = 0; i < numbersOfZeroPrefix; i++) {
            encoded.insert(0, BASE_58.charAt(0));
        }

        return encoded.toString();
    }
}
