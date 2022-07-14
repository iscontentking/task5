package exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class ArrayConverter {
    static  List toList(Object[] array, Function mapperFunction) {
        return (List) Arrays.stream(array)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }
}
