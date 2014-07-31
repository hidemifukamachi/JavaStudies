import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class Test3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa3","bbb3","ccc3","abc3","adt3");
		list.stream().filter((String data) -> {return data.startsWith("a");})
		.forEach((String data) -> {System.out.println(data);});
	}
}

