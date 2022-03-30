import java.io.*;

public class Ex1231_2 {

	public static void main(String[] args) {
		// File 클래스 - 파일관련 메타정보 / 교재 557p
		File file = null; 
		try {
			file = new File("C:\\myWorkSpace\\learnJava\\AppExam\\newFile.txt");
			file.createNewFile(); // 0byte의 빈 파일 생성
			
			System.out.println(file.getName());
			System.out.println(file.isFile()); // 파일이냐 디렉터리냐를 묻는 메서드
			System.out.println(file.isDirectory());
			System.out.println(file.exists()); // 파일의 존재 여부 파악
			System.out.println(file.getPath()); // 
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getTotalSpace());
			
			file.delete(); // 파일 삭제
		} catch (Exception e) {
			
		} finally { // 원칙적으로 내용에 접근했으면 닫는메서드를 써주자 
			
		}
	
	
	
	}

}
