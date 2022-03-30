import java.io.*;
public class Ex1231_1 {

	public static void main(String[] args) {
		// 파일에 쓰기
		FileWriter fw = null;
		try {
			// 예외발생 가능성 있는 문장 위치
			// 파일처리, 네트워크, 데이터베이스
			fw = new FileWriter("writer.txt"); // 지정된 파일생성(있으면 오버라이팅(덮어쓰기), 없으면 생성)			
			fw.write("B");
			fw.write("안녕\n"); // \n : 줄바꿈 기능
			char buf[] = {'C','D','E','\n'};
			fw.write(buf);
			fw.write("자바프로그래밍");
			// 문자를 다룬다면, 향상된 객체로서 String 클래스를 사용하는게 일반적이다.
			
			
		} catch (Exception e) {  // 캐치문 하나에 예외 발생할 경우 실행될 코드 하나 해서 캐치문을 여러개 쓰는기 일반적이긴 하지만, 애초에 캐치문 자체가 오류를 알려줄 역할일 뿐 딱히 중요하지는 않다?고 말씀하신다.
			
		} finally {
			if (fw != null) {  // fw객체와 null과 같지 않다면-
				try {
					fw.close();
				} catch (Exception e) {
					
				}
				System.out.println("파일 출력이 완료되었습니다.");
			}
		}
	}

}
