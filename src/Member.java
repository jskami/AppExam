
public class Member {
	private int memberId; // ��������κ��� ���� ���ϰ� ����!
	private String memberName;
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;  // ������ ����
	}
	public int getMemberId() {  // get�� �о�� ���̰�, �д´ٴ� ���� ��ȯ �� �� �ִٴ� �ǹ̶�°� ����? Ÿ�� �ۼ��� get���� �ۼ���
		return memberId;		
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {  // get�� �о�� ���̰�, �д´ٴ� ���� ��ȯ �� �� �ִٴ� �ǹ̶�°� ����? Ÿ�� �ۼ��� get���� �ۼ���
		return memberName;		
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// �������̵� �Ұž�
	@Override
	public String toString() {  // ��������� ��ȯ�� �� �����ϱ� ��ȯ Ÿ�Կ� ���缭 �������. string�̳�!, ��ü������ �� �޼��� ȣ�� ����
		return memberId + ":" + memberName;
	} //�ٵ� �̰� �ֻ��� Ŭ�������� �������̵��� �� �������� �𸣴ϱ� Ȯ���ϰ� �˷������ �׷��� @Override��� �ۼ��ϴ°ž�!
	// ����� �̰� ��� ������ �츮�� ����� �˾ƺ��� ���� �н����̴ϱ� �ۼ��غ���.

}
