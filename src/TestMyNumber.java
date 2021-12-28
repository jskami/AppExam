
public class TestMyNumber { // 람다식 / 교재 463p

	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y; 
		// ()안에 인수(argument)를 넣어주고 ->이렇게 치환하겠다!-의 의미를 써준다.
		// 인터페이스의 메서드를 구현한 것이다.
		System.out.println(max.getMax(100, 200));
	
	
	// StringConcat인터페이스에 대한 테스트class로 새로 만들지 말고 그냥 여기서 쓰자	
		String s1 = "자바";
		String s2 = "프로그래밍";
		StringConcat concat = (x, y) -> System.out.println(x+y);
		concat.makeString(s1, s2);
	}

}

