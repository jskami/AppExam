
public class Student {
	private int studentId;
	String studentName;
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public int getStudentId() {  //�б�
		return studentId;
	}
	public void setStudentId(int studentId) {  //����
		this.studentId = studentId;  //��������� ����
	}
	
	public String getStudentName() {  
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
		
	// �������̵� �ҷ�!!
//	@Override
//	public boolean equals(Object obj) {
//		Student std = (Student)obj; // Student ��ü�� �����ؾ� �ϱ� ������ ĳ���� �ʿ�
//		if(this.studentId == std.studentId && studentName.equals(std.studentName)) {	
//			return true;             // ���ڿ� ���� �� studentName == std.studentName ���� �� ��!
//		} else {
//			return false;
//		}
//	}
	
	//�ʿ信 ���� toString�޼��带 ����� ����϶�. ���ص� ����� ����.
	@Override
	public String toString() {
		return studentId + ":" + studentName;
	}
	
}
