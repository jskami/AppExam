
public class StudentArrayListTest {

	public static void main(String[] args) {
		// 인라인방식으로, 객체변수는 하나만 생성하면 된다.
		StudentArrayList stList = new StudentArrayList();
		//객체를 생성하지 않은 문법으로도 가능하다는걸 알 수 있다.
		stList.addStudent(new Student(100, "홍길동"));
		stList.addStudent(new Student(200, "강감찬"));
		stList.addStudent(new Student(300, "김삿갓"));
		stList.addStudent(new Student(400, "을지문덕"));
		stList.addStudent(new Student(500, "이소룡"));
		stList.showAllStudent();
		//stList.removeStudent(300); 문법에러 없음, 이렇게 해도 가능
		
		if (stList.removeStudent(300)) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
		stList.showAllStudent();
		
		//내가 한 방식
//		Student st1 = new Student(1, "허아라");
//		Student st2 = new Student(2, "이슬아");
//		Student st3 = new Student(3, "고유비");
//		Student st4 = new Student(4, "문찬호");
//		Student st5 = new Student(5, "박종수");
//		stList.addStudent(st1);
//		stList.addStudent(st2);
//		stList.addStudent(st3);
//		stList.addStudent(st4);
//		stList.addStudent(st5);
//		stList.showAllStudent();

		// 학생 정보 삭제 : ID
		/*if (stList.removeStudent(5) == true) {
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
		System.out.println(st5.toString()); */
		//위의 두 출력문은 동일하다.
	}

}
