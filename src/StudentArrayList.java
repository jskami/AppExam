import java.util.*;
public class StudentArrayList {
	ArrayList<Student> stList; //���� �� ����, �̸��� �������� 
	
	public StudentArrayList() { // �� Ŭ������ �����ڸ� �����? ����!
		stList = new ArrayList<Student>(); //����ִ� ����Ʈ ����
	}
	// ������ ���� ArrayList�� �л��� �߰��ϴ� �޼���..? ����!
	public void addStudent(Student student) {
		stList.add(student);
	}
	
	// �л� Id�� �����ϴ� �޼���, �����ε�!
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
	
	// �л� �̸��� �����ϴ� �޼���(���� �ٸ� ������ �������), �����ε�!
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
	
	//��ü �л��� ����ϴ� �޼��带 ������
	public void showAllStudent() {
		for (Student student : stList) {
			System.out.println(student);
		}
		System.out.println();
	}
	
}

// ���� ������ �ٽ��� � ������ ��ȸ�ϴ� ������� �ݺ����� �迭 ���� ����Ѵٴ� ���� ������ ��!
