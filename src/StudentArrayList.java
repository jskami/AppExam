import java.util.*;
public class StudentArrayList {
	ArrayList<Student> stList; //선언만 한 상태, 이름은 자유선택 
	
	public StudentArrayList() { // 이 클래스의 생성자를 만든거? 딩동!
		stList = new ArrayList<Student>(); //비어있는 리스트 생성
	}
	// 위에서 만든 ArrayList에 학생을 추가하는 메서드..? 핑퐁!
	public void addStudent(Student student) {
		stList.add(student);
	}
	
	// 학생 Id를 삭제하는 메서드, 오버로딩!
	public boolean removeStudent(int studentId) {
		for (int i = 0; i < stList.size(); i++) {
			Student student = stList.get(i);
			int stId = student.getStudentId();
			if (stId == studentId) {
				stList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	// 학생 이름을 삭제하는 메서드(위와 다른 선생님 방식으로), 오버로딩!
	public boolean removeStudent(String studentName) {
		boolean check = false;
		for (int i = 0; i < stList.size(); i++) {
			Student student = stList.get(i);
			if (student.getStudentName().equals(studentName) == true) {
				stList.remove(i);
				check = true;
				break;
			}
		}
		return check;
	}
	
	//전체 학생을 출력하는 메서드를 만들자
	public void showAllStudent() {
		for (Student student : stList) {
			System.out.println(student);
		}
		System.out.println();
	}
	
}

// 오늘 수업의 핵심은 어떤 정보를 조회하는 방법에서 반복문과 배열 등을 사용한다는 점을 숙지할 것!
