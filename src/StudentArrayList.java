import java.util.*;
public class StudentArrayList {
	ArrayList<Student> stList; //선언만 한 상태, 이름은 자유선택 
	
	public StudentArrayList() { // 이 클래스의 생성자를 만든거? 딩동!
		stList = new ArrayList<Student>(); //비어있는 리스트 생성, Student객체만이 stList에 들어 갈 수 있도록 해야 한다.
	}
	// 위에서 만든 ArrayList에 학생을 추가하는 메서드..? 핑퐁!
	public void addStudent(Student student) {
		stList.add(student);
	}
	
	// 학생 Id를 삭제하는 메서드, 오버로딩!
	public boolean removeStudent(int studentId) { // 삭제하는 경우 boolean을 쓰는게 습관적?이다. 필수는 아니다!
		for (int i = 0; i < stList.size(); i++) {
			Student tmp = stList.get(i);  // 캐스팅할 필요가 없다. 학생만 리스트에 있기 때문, 만약 다형성의 성격으로 학생이 아닌 다른 객체들도 있다면 지정해서 캐스팅이 필요하지!
			if (tmp.getStudentId() == studentId) {
				stList.remove(i);  // 객체제거
				return true; // 삭제성공
			}
		}
		return false; // 찾았을 경우 여기까지 올 일이 없어
	}
	
	// 학생 이름을 삭제하는 메서드(위와 다른 선생님 방식으로), 오버로딩!
	public boolean removeStudent(String studentName) {
		boolean check = false;
		for (int i = 0; i < stList.size(); i++) {
			Student tmp = stList.get(i);
			if (tmp.getStudentName().equals(studentName)) {
				stList.remove(i);
				check = true;
				break;
			}
		}
		return check;
	}
	
	//전체 학생을 출력하는 메서드를 만들자 - 1번 방식: 향상된 for문 .ver
	public void showAllStudent() {
		for (Student tmp : stList) { //향상된 for문
			System.out.println(tmp);
		}
		System.out.println();
	}
	
	//전체 학생을 출력하는 메서드를 만들자 - 2번 방식: 전통적인 .ver
//	public void showAllStudent() {
//		for (int i = 0; i < stList.size(); i++) {
//			Student tmp = stList.get(i);
//			System.out.println(tmp);
//		}
//	}
	
}

// 오늘 수업의 핵심은 어떤 정보를 조회하는 방법에서 반복문과 배열 등을 사용한다는 점을 숙지할 것!
