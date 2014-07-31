import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class Test6 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa6","bbb6","ccc6","abc6","adt6");
		list.stream().filter(data ->  data.startsWith("a"))
		.forEach(System.out::println);
	}
}

