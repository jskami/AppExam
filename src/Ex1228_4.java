import java.io.*;
public class Ex1228_4 {

	public static void main(String[] args) {
		// 스트림 클래스 활용(파일 읽기) / 교재 534~5p
		FileReader fr = null;
		try {
			fr = new FileReader("reader.txt"); // AppExam폴더 내 bin(실행)폴더에 만들어 놓은 상태
			//처리 구간, 문자열을 받아내기만 하면 되는데, 문자열이 얼마나 있는지는 모르는 상태
			int i;  // 읽은 바이트 값을 저장할 변수
			while ((i = fr.read()) != -1) {  // 데이터를 읽으면 계속 진행, 못 읽었으면 -1씩 반환-> 반복문 탈출!
				//System.out.println(i);  // 이러면 i는 바이트형식으로 출력되기 때문에 안돼!
					System.out.println((char)i);  //바이트를 문자로 출력! 
			}
			// 여기까지.. but 실패할거야, 메모장에 있는 '안녕하세요'는 문자열이기 때문이지, 한글은 여러 바이트로 조합된 문자열이기 때문이야. ???????로 출력될거야. 이제 영문자로 바꿔보자. 출력이 잘 될거야------------------
			
		} catch (Exception e) {
			System.out.println("1:" + e);
		} finally {
			if (fr != null) {  // reader.txt파일이 존재하니까 파일을 오픈했다면
				try {
					fr.close();  // 닫아야지! 닫는 구문을 만들자.
				} catch (Exception ex) {
					System.out.println("2:" + ex);
				}
			}
		}

	}

}