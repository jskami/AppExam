
public class EqualsTest2 {

	public static void main(String[] args) {
		Student st1 = new Student(100, "ȫ�浿"); // int�� string �Ӽ����� ��ü�� ����ž�
		Student st2 = new Student(100, "ȫ�浿"); 
		//System.out.println("������ �� : " + (st1 == st2));  // hashcode(�ּ�(�޸�)) ��, (�޸𸮰� �ٸ��� false�� ���´�.)
		//System.out.println("�޼��� �� : " + st1.equals(st2));  // hashcode(�ּ�) ��
		
		Student st3 = st1; //��ü ����, st1�� st3�� �����Ŵϱ� true�� ���´�.
		System.out.println("������ �� : " + (st1 == st3));
		System.out.println("�޼��� �� : " + st1.equals(st3));
		
		String s1 = new String("ȣ����"); // ���ڿ� ��ü�ϱ�! ����?
		String s2 = new String("ȣ����");  //���� �Ʒ��� ���ڿ��� ���� �ٸ� ��Ȳ�̾�! ����?
		System.out.println("������ �� : " + (s1 == s2));  // hashcode(�ּ�) ��
		System.out.println("�޼��� �� : " + s1.equals(s2));  // ���ڿ����� ��
		//���� ���ڿ��� ���� ��Ȳ�̶��? ������ �񱳴� �ּҺ񱳸� �Ͽ� �ٸ��� ������ 
		//�޼��� �񱳴� ���ڿ� ������ ���ϱ� ������ ���� ���ðž�
		
		String s3 = s1;  // ���ڿ�����
		System.out.println("������ �� : " + (s1 == s3));  // hashcode(�ּ�) ��
		System.out.println("�޼��� �� : " + s1.equals(s3));  // ���ڿ����� ��
		// �̷��� ��쿡�� s3�� s1�� �ٸ� ���� ����.
		// ���� �񱳸� �ϰ� ������ �޼��� �񱳸� ����! ��, equals �޼��带 ��� equals�޼���� ��ü �񱳸� ������ 
		// �Ϲ������� ���� ���� ���� ����. ����, ���������� �̷��� ���� ����� �ִٴ� �� ������ �˾Ƶθ� ����.
		
		// String class ���� 369p
		String s4 = "�̼���"; //��ü ����(���Ǯ�� ����), new�� �Ⱦ��� ��ü��������� ������ ��!
		String s5 = "�̼���"; //��ü ����
		System.out.println("������ �� : " + (s4 == s5));  // �ּҺ�
		System.out.println("�޼��� �� : " + s4.equals(s5));  // ���ڿ����� �� 
		
		// wrapper class ���� 375p
		// 
		String svalue = "100";  // ���ڿ�, ���� �Ұ���
		
		//Integer ivalue = new Integer(svalue); // �̷��� new�����ڸ� �̿��� ������δ� �������� �ʴ´�.
		//int ivalue = (int)svalue;  // �̷��� ĳ������ ���� ����(�� ��ȯ �Ұ�)
		int ivalue = Integer.parseInt(svalue);  // �Ű������� ���������� ���ڿ�
		System.out.println(ivalue + 1); // ��������, ������ �ȴٸ� 101�� ��Ÿ������?
		
		double dvalue = Double.parseDouble("3.14");  // �������� �ְ� ���ڿ� ���� ������ �� ��� �ɸ��� ����! �׷��� �̷��� �����Ѵ�.
		// 3.14 ���ڿ��� double�� �� ��ȯ �Ѱž�!
		System.out.println(dvalue + 10);  // �Ǽ�����

	
	}

}
