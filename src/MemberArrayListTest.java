
public class MemberArrayListTest {

	public static void main(String[] args) {  // ���� 411p / �׷��� �츮�� �������� ������� ������
		MemberArrayList memList = new MemberArrayList();
		Member m1 = new Member(100, "ȫ�浿"); //memList�� ���� ��������� ������ �Ѵ�.
		Member m2 = new Member(200, "���"); //memList�� ���� ��������� ������ �Ѵ�.
		Member m3 = new Member(300, "�̵���"); //memList�� ���� ��������� ������ �Ѵ�.
		Member m4 = new Member(400, "�̼���"); //memList�� ���� ��������� ������ �Ѵ�.
		Member m5 = new Member(500, "������"); //memList�� ���� ��������� ������ �Ѵ�. -> ���ο� ȸ�� �ν��Ͻ� ����
		memList.addMember(m1);
		memList.addMember(m2);
		memList.addMember(m3);
		memList.addMember(m4);
		memList.addMember(m5); // ���ο� �ν��Ͻ����� �߰��ߴ�.
		memList.showAllMember(); // ��� ȸ���� ���
		
		//���� ���� �� ���� ��������!
		//memList.removeMember(300); //remove�� �� ��ȯ���� �־�� �Ѵ�. Id�� 300���� ����� ����!
		//memList.showAllMember();
		
		if (memList.removeMember(300) == true) { //��ȯ���� �ʿ��ϴϱ�! �̷��� �ۼ��غ���
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		memList.showAllMember();
		
		// �������غ���! : id�� �ƴ� �̸��� �����ε� �Ͽ� �����غ���!
		if (memList.removeMember("ȫ�浿") == true) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		memList.showAllMember();
		
	}

}
