public class Member {
	private int memberId; // 멤버변수로부터 접근 못하게 하자!
	private String memberName;
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;  // 생성자 구현
	}
	public int getMemberId() {  // get은 읽어내는 것이고, 읽는다는 것은 반환 할 게 있다는 의미라는거 알지? 타입 작성후 get변수 작성해
		return memberId;		
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {  // get은 읽어내는 것이고, 읽는다는 것은 반환 할 게 있다는 의미라는거 알지? 타입 작성후 get변수 작성해
		return memberName;		
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// 오버라이딩 할거야
	@Override
	public String toString() {  // 멤버변수를 반환할 게 있으니까 반환 타입에 맞춰서 적어두자. string이네!, 객체명으로 이 메서드 호출 가능
		return memberId + ":" + memberName;
	} //근데 이게 최상위 클래스에서 오버라이딩을 한 것인지는 모르니까 확실하게 알려줘야해 그래서 @Override라고 작성하는거야!
	// 현재는 이게 없어도 되지만 우리는 기능을 알아보기 위한 학습용이니까 작성해보자.

}