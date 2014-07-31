import java.util.Arrays;
import java.util.List;

class Test1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa","bbb","ccc","abc","adt");
		for(String data:list) {
			if(data.startsWith("a")){
				System.out.println(data);
			}
		}
	}
}