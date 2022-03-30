import java.io.*;
public class Ex1228_5 {

	public static void main(String[] args) {
		//스스로 해보자! 
		//바이트 처리 클래스(FileInputStream) 사용
		//영문과 숫자 또는 특수문자(키보드내에 있는..즉, 아스키코드를 말하는 것)로 구성된 파일을 읽어 화면에 출력
		//System.out.println() 사용해서 출력
		//파일명 test.txt
		//파일의 내용은 최소 3라인 이상
		//Ex1228_5 클래스 작성
		
			FileInputStream fr = null;
			try {
				fr = new FileInputStream("test.txt");
			int i;
			while ((i = fr.read()) != -1) {  // -1의 의미 ->
				System.out.print((char)i);
			}
				
		} catch (Exception e) {
			System.out.print(e);  //"1:" + 
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception ex) {
					System.out.print(ex);  //"2:" + 
				}
			}
		}
			
	}

}