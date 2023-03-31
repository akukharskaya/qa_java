package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
    private final String animalKind;
    private final List<String> expected;

    public AnimalParameterizedTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters()
    public static Object[][] getFoodData() {
        return new Object[][] {
                {"Травоядное",List.of("Трава", "Различные растения")},
                {"Хищник",List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);

        assertThat(actual).isEqualTo(expected);
    }
}
