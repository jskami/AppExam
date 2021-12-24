
public class StudentArrayListTest {

	public static void main(String[] args) {
		StudentArrayList stList = new StudentArrayList();
		Student st1 = new Student(1, "허아라");
		Student st2 = new Student(2, "이슬아");
		Student st3 = new Student(3, "고유비");
		Student st4 = new Student(4, "문찬호");
		Student st5 = new Student(5, "박종수");
		stList.addStudent(st1);
		stList.addStudent(st2);
		stList.addStudent(st3);
		stList.addStudent(st4);
		stList.addStudent(st5);
		stList.showAllStudent();

		// 학생 정보 삭제 : ID
		if (stList.removeStudent(5) == true) {
			System.out.println("학생 id정보 삭제 성공");
		} else {
			System.out.println("학생 id정보 삭제 실패");
		}
		stList.showAllStudent();
		
		// 학생 정보 삭제 : NAME
		if (stList.removeStudent("문찬호") == true) {
			System.out.println("학생 name정보 삭제 성공");
		} else {
			System.out.println("학생 name정보 삭제 실패");
		}
		stList.showAllStudent();
		
		System.out.println(st5); //.toString()이 숨겨진 상태이다.
		System.out.println(st5.toString());
		//위의 두 출력문은 동일하다.
	}

}
