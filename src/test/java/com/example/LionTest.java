package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private static final String VALID_SEX = "Самец";
    private static final String INVALID_SEX = "invalidSex";

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void testConstructorThrowsException() throws Exception {
        new Lion(INVALID_SEX, feline);
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(VALID_SEX, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        assertThat(lion.getKittens()).isEqualTo(1);
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(VALID_SEX,feline);
        boolean actual = lion.doesHaveMane();
        assertThat(actual).isTrue();
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(VALID_SEX,feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные","Птицы", "Рыба"));
        List<String> expected = List.of("Животные","Птицы", "Рыба");
        assertThat(lion.getFood()).isEqualTo(expected);
    }

}