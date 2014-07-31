import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class Test5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa5","bbb5","ccc5","abc5","adt5");
		list.stream().filter(data ->  data.startsWith("a"))
		.forEach(data -> System.out.println(data));
	}
}

