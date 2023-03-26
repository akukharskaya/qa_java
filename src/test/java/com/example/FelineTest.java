package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FelineTest {
    private Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void eatMeat() throws Exception {
        List<String> list = feline.eatMeat();
        assertThat(list.size()).isEqualTo(3);
    }

    @Test
    public void getFamily() {
        assertThat(feline.getFamily()).isEqualTo("Кошачьи");
    }

    @Test
    public void getKittens() {
        assertThat(feline.getKittens()).isEqualTo(1);
    }
}
