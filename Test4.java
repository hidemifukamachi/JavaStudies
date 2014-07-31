import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class Test4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa4","bbb4","ccc4","abc4","adt4");
		list.stream().filter((data) -> {return data.startsWith("a");})
		.forEach((data) -> {System.out.println(data);});
	}
}

