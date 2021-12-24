import java.util.*; // �ֻ��� �ڹ� Ŭ���� ���� ��ƿ�̶�� ��ŰƼ �ȿ� �ִ� ��̸���Ʈ�� ���ڴ�!
public class MemberArrayList {
	ArrayList<Member> arrayList; //�������, ����
	
	public MemberArrayList() {  //������
		arrayList = new ArrayList<Member>(); //Member��ü�� ������ �� �ִ� ����Ʈ ����, ���� ����� ���� �ƴϰ� ������ ����
	}
	//ArrayList�� ȸ���� �߰��ϴ� �޼��带 ������.
	public void addMember(Member member) {
		arrayList.add(member); // �������� member�� �״�� �����ؼ� add�ϸ� �ȴ�.
	} 
	
	// �Ǵ°� �ȵǴ°��� �Ǵ��ϱ� ���� booleanŸ���� ����. ������ ������ �Ǵ� ����� �߰� �ϱ� �����̴�.
	public boolean removeMember(int memberId) {  //������ �����ϸ� true ��ȯ / (Member member)ó�� ��ü ��ü�� �ְ� ã�Ƴ��� ���� ������ �ȴ�. ���� �ڼ��ϰ� ã��, ��Ʈ�� �̿��Ѵٴ� �������� ��ü ���� ������ ���� ã�� ���� ȿ�����̴�.
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);  //get�� �̿��Ͽ� �ӽú����� ��ȯ�� �޴´�. ��ü arrayList���� get���� ��ȣ�� �����Ͽ� �޴´�. �̶�, arrayList���� ��������� �ִٴ°� ����Ǿ ���� ĳ���� �� �ʿ䰡 ����.
			int tempId = member.getMemberId(); //�ӽ÷� �����ϱ� ���� tempId��� �ϰڴ�.(�ӽú���)
			if (tempId == memberId) {  //�̰� �����Ǹ� ã�Ƽ� �����ؾ� �Ѵ�.
				arrayList.remove(i);   //��ü ����
				//System.out.println(memberId + "�� ȸ���� ���� ���ſ� �����߽��ϴ�."); //���⼭ ����ϸ� �������ϴϱ� ���⼭ �������� ����� �����̰� ���������� ����������� �����ϴ� �뵵�� ����.
				return true;  //���� ����, 14ln�� Ż���ϱ� ���� Ȯ���� ������� Ʈ�簪�� ��ȯ�Ͽ� �ݺ����� ������! ���� break;�� �ص� ������ �� ����� �� Ȯ���ϴ�.
			}
		}
		//System.out.println(memberId + "�� ȸ���� ������ �������� �ʽ��ϴ�.");// ���� ����� �ʿ�� ������ �� ã�Ҵٴ� ����� �غ��ڸ� �̷���. //���⼭ ����ϸ� �������ϴϱ� ���⼭ �������� ����� �����̰� ���������� ����������� �����ϴ� �뵵�� ����.
		return false;
	}
	// �������غ���! : id�� �ƴ� �̸��� �����ε� �Ͽ� �����غ���!
	//�������� ���
	public boolean removeMember(String memberName) {
		boolean chk = false;  //�ϴ� ���ж�� ����
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberName().equals(memberName) == true) {  // == true ���� �����ϴ�.
				arrayList.remove(i);
				chk = true; //���� ����
				break;  // ->������ ��ã���Ŷ�� �����س��Ƶ� if������ ���ǿ� �����ϸ� true�� �ٲ��. �װ� �ƴ϶�� ����false�� �����Ѵ�.
//���� �� ���
//		for (int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			String tempname = member.getMemberName();
//			if (tempname.equals(memberName)) {
//				arrayList.remove(i);
//				return true;
			}
		}
		return chk;  //������ ��� true, ������ ��� false
	}
	
	
	
	
	
	//��üȸ���� ����ϴ� �޼��带 ������!
	public void showAllMember() {
		for (Member member : arrayList) {  //���� for��
			//System.out.println(member.toString()); //toString()�޼���� ������ ���
			System.out.println(member);
		}
		System.out.println(); //�ܼ��� �ٹٲ� ����� ���̾�.
	}
	
	
	
}
