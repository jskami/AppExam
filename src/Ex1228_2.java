import java.io.*;
public class Ex1228_2 {

	public static void main(String[] args) {
		//컴파일러에 의해 체크되는 예외, try ~ catch ~ finally구문 / 교재 495p
		FileInputStream fis = null;  // 명시적으로 null값을 준 것이다. 여기서 null값조차 안주면 finally에서 fis가 무슨 값인지 몰라서 모호하기 때문에 오류가 날 수 있다. 
		                             //블럭 밖에서 fis 객체를 선언해야 try 블럭 외부에서도 인식(사용)되도록 한 것
		try {
			fis = new FileInputStream("a.txt"); // 예외처리를 반드시 해야한다. but, a.txt가 실제로 존재하면 catch구문까지 내려오지 않고 찾아낸다.
			
			//이 부분은 정상처리되는 영역
			//리소스 종료 처리
		} catch (Exception e) {
			System.out.println(e); // 캐치블럭에서의 처리
			// e.printStckTrace(); 써도
			// 비정상 종료 영역
			// 여기도 리소스 종료 처리
		} finally {
			// 최종 처리할 공통의 내용 작성
			// 예외처리를 해야한다.
			if (fis != null) {  // fis가 null과 같지 않다면(=객체가 열려 있다면)
				try {
					fis.close();  // 열려있으니까 닫아야지
				} catch (Exception ex) {
					//System.out.println(ex); //①객체를 직접 출력해도 되고, 
					ex.printStackTrace(); //②예외관련 내용으로 출력해도 된다.
				}
			}
		}
		System.out.println("완료부분입니다.");
	}

}