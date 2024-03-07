package com.lindoox.tinyurl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class EncoderTest {

    @Test
    public void encode() {
        assertThat(Encoder.encode(1)).isEqualTo("11111112");
        assertThat(Encoder.encode(59)).isEqualTo("11111122");
        assertThat(Encoder.encode(100)).isEqualTo("1111112K");
        System.out.println(Encoder.encode(100000000000000000L));
        assertThat(Encoder.encode(100000000000000000L)).isEqualTo("3jDEPijTPGB");
    }
}
