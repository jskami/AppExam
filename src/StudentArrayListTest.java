
public class StudentArrayListTest {

	public static void main(String[] args) {
		StudentArrayList stList = new StudentArrayList();
		Student st1 = new Student(1, "��ƶ�");
		Student st2 = new Student(2, "�̽���");
		Student st3 = new Student(3, "������");
		Student st4 = new Student(4, "����ȣ");
		Student st5 = new Student(5, "������");
		stList.addStudent(st1);
		stList.addStudent(st2);
		stList.addStudent(st3);
		stList.addStudent(st4);
		stList.addStudent(st5);
		stList.showAllStudent();

		// �л� ���� ���� : ID
		if (stList.removeStudent(5) == true) {
			System.out.println("�л� id���� ���� ����");
		} else {
			System.out.println("�л� id���� ���� ����");
		}
		stList.showAllStudent();
		
		// �л� ���� ���� : NAME
		if (stList.removeStudent("����ȣ") == true) {
			System.out.println("�л� name���� ���� ����");
		} else {
			System.out.println("�л� name���� ���� ����");
		}
		stList.showAllStudent();
		
		System.out.println(st5); //.toString()�� ������ �����̴�.
		System.out.println(st5.toString());
		//���� �� ��¹��� �����ϴ�.
	}

}
