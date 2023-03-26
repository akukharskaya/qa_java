package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    Animal animal = new Animal();

    @Test(expected = Exception.class)
    public void getFood_throwsException() throws Exception{
        animal.getFood("Несуществующий вид");
    }

    @Test
    public void getFamily() {
        animal.getFamily();
    }
}
