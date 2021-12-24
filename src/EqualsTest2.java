
public class EqualsTest2 {

	public static void main(String[] args) {
		Student st1 = new Student(100, "홍길동"); // int와 string 속성으로 객체를 만든거야
		Student st2 = new Student(100, "홍길동"); 
		//System.out.println("연산자 비교 : " + (st1 == st2));  // hashcode(주소(메모리)) 비교, (메모리가 다르면 false가 나온다.)
		//System.out.println("메서드 비교 : " + st1.equals(st2));  // hashcode(주소) 비교
		
		Student st3 = st1; //객체 복사, st1을 st3에 넣은거니까 true가 나온다.
		System.out.println("연산자 비교 : " + (st1 == st3));
		System.out.println("메서드 비교 : " + st1.equals(st3));
		
		String s1 = new String("호랑이"); // 문자열 객체니까! 알지?
		String s2 = new String("호랑이");  //위와 아래는 문자열이 서로 다른 상황이야! 알지?
		System.out.println("연산자 비교 : " + (s1 == s2));  // hashcode(주소) 비교
		System.out.println("메서드 비교 : " + s1.equals(s2));  // 문자열내용 비교
		//만약 문자열이 같은 상황이라면? 연산자 비교는 주소비교를 하여 다르게 나오고 
		//메서드 비교는 문자열 내용을 비교하기 때문에 같게 나올거야
		
		String s3 = s1;  // 문자열복사
		System.out.println("연산자 비교 : " + (s1 == s3));  // hashcode(주소) 비교
		System.out.println("메서드 비교 : " + s1.equals(s3));  // 문자열내용 비교
		// 이러한 경우에는 s3과 s1이 다를 수가 없다.
		// 내용 비교를 하고 싶으면 메서드 비교를 하자! 즉, equals 메서드를 써라 equals메서드는 객체 비교를 하지만 
		// 일반적으로 쓰일 일은 거의 없다. 단지, 문법적으로 이러한 내부 기능이 있다는 것 정도만 알아두면 좋다.
		
		// String class 교재 369p
		String s4 = "이순신"; //객체 생성(상수풀에 저장), new를 안쓰고 객체복사식으로 생성한 것!
		String s5 = "이순신"; //객체 생성
		System.out.println("연산자 비교 : " + (s4 == s5));  // 주소비교
		System.out.println("메서드 비교 : " + s4.equals(s5));  // 문자열내용 비교 
		
		// wrapper class 교재 375p
		// 
		String svalue = "100";  // 문자열, 연산 불가능
		
		//Integer ivalue = new Integer(svalue); // 이러한 new연산자를 이용한 방식으로는 생성하지 않는다.
		//int ivalue = (int)svalue;  // 이렇게 캐스팅할 수도 없다(형 변환 불가)
		int ivalue = Integer.parseInt(svalue);  // 매개변수는 정수형태의 문자열
		System.out.println(ivalue + 1); // 정수연산, 연산이 된다면 101이 나타나겠지?
		
		double dvalue = Double.parseDouble("3.14");  // 더블형을 주고 문자열 값을 줬으니 이 경우 될리가 없지! 그래서 이렇게 수정한다.
		// 3.14 문자열을 double로 형 변환 한거야!
		System.out.println(dvalue + 10);  // 실수연산

	
	}

}
