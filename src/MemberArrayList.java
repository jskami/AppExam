import java.util.*; // 최상위 자바 클래스 내에 유틸이라는 패키티 안에 있는 어레이리스트를 쓰겠다!
public class MemberArrayList {
	ArrayList<Member> arrayList; //멤버변수, 선언만
	
	public MemberArrayList() {  //생성자
		arrayList = new ArrayList<Member>(); //Member객체를 저장할 수 있는 리스트 생성, 아직 멤버가 들어간건 아니고 공간만 생성
	}
	//ArrayList에 회원을 추가하는 메서드를 만들자.
	public void addMember(Member member) {
		arrayList.add(member); // 지역변수 member를 그대로 대입해서 add하면 된다.
	} 
	
	// 되는가 안되는가를 판단하기 위해 boolean타입을 쓴다. 목적은 삭제가 되는 기능을 추가 하기 위함이다.
	public boolean removeMember(int memberId) {  //삭제가 성공하면 true 반환 / (Member member)처럼 객체 자체를 주고 찾아내는 것은 문제가 된다. 좀더 자세하게 찾고, 힌트를 이용한다는 느낌으로 객체 내의 정보를 통해 찾는 것이 효과적이다.
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);  //get을 이용하여 임시변수의 반환을 받는다. 전체 arrayList에서 get으로 번호를 지정하여 받는다. 이때, arrayList에는 멤버변수가 있다는게 보장되어서 따로 캐스팅 할 필요가 없다.
			int tempId = member.getMemberId(); //임시로 저장하기 위해 tempId라고 하겠다.(임시변수)
			if (tempId == memberId) {  //이게 성립되면 찾아서 제거해야 한다.
				arrayList.remove(i);   //객체 제거
				//System.out.println(memberId + "의 회원님 정보 제거에 성공했습니다."); //여기서 출력하면 지저분하니까 여기서 쓰지말자 여기는 원본이고 원본에서는 출력하지말고 리턴하는 용도로 쓰자.
				return true;  //제거 성공, 14ln을 탈출하기 위해 확실한 방법으로 트루값을 반환하여 반복문을 끝낸다! 물론 break;를 해도 좋지만 이 방법이 더 확실하다.
			}
		}
		//System.out.println(memberId + "의 회원님 정보가 존재하지 않습니다.");// 굳이 출력할 필요는 없지만 못 찾았다는 출력을 해보자면 이렇다. //여기서 출력하면 지저분하니까 여기서 쓰지말자 여기는 원본이고 원본에서는 출력하지말고 리턴하는 용도로 쓰자.
		return false;
	}
	// 스스로해보자! : id가 아닌 이름을 오버로딩 하여 제거해보자!
	//선생님의 방식
	public boolean removeMember(String memberName) {
		boolean chk = false;  //일단 실패라고 가정
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberName().equals(memberName) == true) {  // == true 생략 가능하다.
				arrayList.remove(i);
				chk = true; //삭제 성공
				break;  // ->위에서 못찾을거라고 가정해놓아도 if문에서 조건에 부합하면 true로 바뀐다. 그게 아니라면 원래false를 리턴한다.
//내가 한 방식
//		for (int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			String tempname = member.getMemberName();
//			if (tempname.equals(memberName)) {
//				arrayList.remove(i);
//				return true;
			}
		}
		return chk;  //성공일 경우 true, 실패일 경우 false
	}
	
	
	
	
	
	//전체회원을 출력하는 메서드를 만들어보자!
	public void showAllMember() {
		for (Member member : arrayList) {  //향상된 for문
			//System.out.println(member.toString()); //toString()메서드와 동일한 결과
			System.out.println(member);
		}
		System.out.println(); //단순한 줄바꿈 출력일 뿐이야.
	}
	
	
	
}