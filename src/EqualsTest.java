public class EqualsTest {  // 교재 357p Equal의 객체 복사를 알아보자!

	public static void main(String[] args) {
		Student st1 = new Student(100, "홍길동");
		Student st2 = st1; // 객체복사, st1과 st2 객체는 동일한 주소를 나타냄
		System.out.println(st1);
		System.out.println(st2);
		Student st3 = new Student(100, "홍길"); // st3은 st1과 내용이 동일한 객체
		System.out.println(st3); //st1과 st3은 다른 객체
		System.out.println("st1과 st2 비교 : " + st1.equals(st2));
		System.out.println("st1과 st3 비교 : " + st1.equals(st3));
		// equals() 메서드의 원형은 해시코드 비교이다.
		
		// 위의 설명에서 일반객체일 경우 설명내용대로 객체가 다르면 해시코드가 다르다.
		// 단, String일 경우 예외이다. String의 문자열이 동일할 경우 동일한 메모리에 저장
		// 기억장소 효율적 사용
		String a1 = new String("홍길동");
		String a2 = new String("홍길동");
		String a3 = new String("김삿갓");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a1 == a2);  // 이 문장 사용 금지!
		System.out.println(a1.equals(a2));  // 문자열의 내용 비교(이 방식을 사용하라)

	}


}