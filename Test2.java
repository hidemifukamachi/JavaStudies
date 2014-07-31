import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class Test2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa2","bbb2","ccc2","abc2","adt2");
		list.stream().filter(
			new Predicate<String>() {
				public boolean test(String data) {
					return data.startsWith("a");}
		}).forEach(new Consumer<String>() {
			public void accept(String data) {
				System.out.println(data);}});
	}
}