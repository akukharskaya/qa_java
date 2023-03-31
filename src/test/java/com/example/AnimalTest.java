package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    Animal animal = new Animal();

    @Test(expected = Exception.class)
    public void getFood_throwsException() throws Exception{
        animal.getFood("Несуществующий вид");
    }

    @Test
    public void getFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();

        assertThat(actual).isEqualTo(expected);
    }
}
