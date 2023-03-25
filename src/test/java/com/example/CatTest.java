package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Feline feline;
    private Cat cat;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
         feline = Mockito.mock(Feline.class);
         cat = new Cat(feline);
    }

    @Test
    public void getSound() {
       assertThat(cat.getSound()).isEqualTo("Мяу");
    }

//    @Test
//    public void getFood() {
//        assertThat(true).isFalse();
//    }


}