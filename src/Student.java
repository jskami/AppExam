
public class Student {
	private int studentId;
	String studentName;
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public int getStudentId() {  //읽기
		return studentId;
	}
	public void setStudentId(int studentId) {  //저장
		this.studentId = studentId;  //멤버변수에 저장
	}
	
	public String getStudentName() {  
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
		
	// 오버라이딩 할래!!
//	@Override
//	public boolean equals(Object obj) {
//		Student std = (Student)obj; // Student 객체로 저장해야 하기 때문에 캐스팅 필요
//		if(this.studentId == std.studentId && studentName.equals(std.studentName)) {	
//			return true;             // 문자열 비교할 때 studentName == std.studentName 쓰지 말 것!
//		} else {
//			return false;
//		}
//	}
	
	//필요에 따라 toString메서드를 만들어 사용하라. 안해도 상관은 없다.
	@Override
	public String toString() {
		return studentId + ":" + studentName;
	}
	
}
