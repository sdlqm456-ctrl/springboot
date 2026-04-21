package lambda;

// 스트림 API 배열 => for 문을 간단하게 표현해서 결과값을 출력하는 방법
import java.util.Arrays;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int total = numbers.stream()
				.filter( a -> a % 2 == 0)
				.mapToInt(a -> a)
				.sum();
		System.out.println(total);
		
	}
}
