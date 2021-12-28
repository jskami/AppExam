import java.util.*;
public class StudentArrayList {
	ArrayList<Student> stList; //���� �� ����, �̸��� �������� 
	
	public StudentArrayList() { // �� Ŭ������ �����ڸ� �����? ����!
		stList = new ArrayList<Student>(); //����ִ� ����Ʈ ����, Student��ü���� stList�� ��� �� �� �ֵ��� �ؾ� �Ѵ�.
	}
	// ������ ���� ArrayList�� �л��� �߰��ϴ� �޼���..? ����!
	public void addStudent(Student student) {
		stList.add(student);
	}
	
	// �л� Id�� �����ϴ� �޼���, �����ε�!
	public boolean removeStudent(int studentId) { // �����ϴ� ��� boolean�� ���°� ������?�̴�. �ʼ��� �ƴϴ�!
		for (int i = 0; i < stList.size(); i++) {
			Student tmp = stList.get(i);  // ĳ������ �ʿ䰡 ����. �л��� ����Ʈ�� �ֱ� ����, ���� �������� �������� �л��� �ƴ� �ٸ� ��ü�鵵 �ִٸ� �����ؼ� ĳ������ �ʿ�����!
			if (tmp.getStudentId() == studentId) {
				stList.remove(i);  // ��ü����
				return true; // ��������
			}
		}
		return false; // ã���� ��� ������� �� ���� ����
	}
	
	// �л� �̸��� �����ϴ� �޼���(���� �ٸ� ������ �������), �����ε�!
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
	
	//��ü �л��� ����ϴ� �޼��带 ������ - 1�� ���: ���� for�� .ver
	public void showAllStudent() {
		for (Student tmp : stList) { //���� for��
			System.out.println(tmp);
		}
		System.out.println();
	}
	
	//��ü �л��� ����ϴ� �޼��带 ������ - 2�� ���: �������� .ver
//	public void showAllStudent() {
//		for (int i = 0; i < stList.size(); i++) {
//			Student tmp = stList.get(i);
//			System.out.println(tmp);
//		}
//	}
	
}

// ���� ������ �ٽ��� � ������ ��ȸ�ϴ� ������� �ݺ����� �迭 ���� ����Ѵٴ� ���� ������ ��!
