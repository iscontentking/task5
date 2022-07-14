package exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayConverterTest {

    @Test
    public void generics() {
        Integer[] arrayOfInts = {1, 2, 3, 4, 5};
        List<String> listOfStrings
                = ArrayConverter.toList(arrayOfInts, Object::toString);

        assertThat(listOfStrings).containsExactlyInAnyOrder("1", "2", "3", "4", "5");
    }
}