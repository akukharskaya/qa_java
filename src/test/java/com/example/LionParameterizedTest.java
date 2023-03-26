package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    @Mock
    Feline feline;

    public LionParameterizedTest(String sex) {
        this.sex = sex;
    }


    @Parameterized.Parameters()
    public static Object[] getParameters() {
        return new Object[]{
                "Самец",
                "Самка",
        };
    }

    @Test
    public void testConstructor() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertThat(lion).isNotNull();
    }
}
