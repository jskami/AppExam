public class EX1228_1 {

	public static void main(String[] args) {
		// 예외처리 try ~ catch / 교재 491p
		int[]arr = new int[5];
		
		try {
			// 예외가 발생할 가능성이 있는 문장 자리
			// 변수의 선언관계를 정확히 이해해야한다!
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {  //Exception은 최상위 클래스를 말하고 e는 Exception의 앞 글자를 따온 것(별 의미 없음)
			// 예외가 발생했을 경우 처리할 문장 자리(비워놓아도 무관)
			System.out.println(e.toString()); //이게 예외를 처리한 건지 안한건지 개발자가 모를 수 있으니까 e.tostring써서 출력문으로 표현한다. .toString은 생략 가능하다. 
		}
		
	}

}