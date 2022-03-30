public class MemberArrayListTest {

	public static void main(String[] args) {  // 교재 411p / 그러나 우리는 선생님의 방식으로 만들어보자
		MemberArrayList memList = new MemberArrayList();
		Member m1 = new Member(100, "홍길동"); //memList에 넣을 멤버변수를 만들어야 한다.
		Member m2 = new Member(200, "김삿갓"); //memList에 넣을 멤버변수를 만들어야 한다.
		Member m3 = new Member(300, "이도령"); //memList에 넣을 멤버변수를 만들어야 한다.
		Member m4 = new Member(400, "이순신"); //memList에 넣을 멤버변수를 만들어야 한다.
		Member m5 = new Member(500, "강감찬"); //memList에 넣을 멤버변수를 만들어야 한다. -> 새로운 회원 인스턴스 생성
		memList.addMember(m1);
		memList.addMember(m2);
		memList.addMember(m3);
		memList.addMember(m4);
		memList.addMember(m5); // 새로운 인스턴스들을 추가했다.
		memList.showAllMember(); // 모든 회원들 출력
		
		//이제 누구 한 명을 지워보자!
		//memList.removeMember(300); //remove할 때 반환값이 있어야 한다. Id가 300값인 멤버를 삭제!
		//memList.showAllMember();
		
		if (memList.removeMember(300) == true) { //반환값이 필요하니까! 이렇게 작성해보자
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		memList.showAllMember();
		
		// 스스로해보자! : id가 아닌 이름을 오버로딩 하여 제거해보자!
		if (memList.removeMember("홍길동") == true) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		memList.showAllMember();
		
	}

}