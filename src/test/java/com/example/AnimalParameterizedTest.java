package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {
    private final String animalKind;
    private final List<String> expected;

    public AnimalParametrizedTest(String animalKind,List<String> expected) {
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
        List<String> list = animal.getFood(animalKind);
        int actual = list.size();

        assertThat(actual).isEqualTo(expected.size());
    }
}
