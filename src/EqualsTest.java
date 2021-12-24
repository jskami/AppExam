
public class EqualsTest {  // ���� 357p Equal�� ��ü ���縦 �˾ƺ���!

	public static void main(String[] args) {
		Student st1 = new Student(100, "ȫ�浿");
		Student st2 = st1; // ��ü����, st1�� st2 ��ü�� ������ �ּҸ� ��Ÿ��
		System.out.println(st1);
		System.out.println(st2);
		Student st3 = new Student(100, "ȫ��"); // st3�� st1�� ������ ������ ��ü
		System.out.println(st3); //st1�� st3�� �ٸ� ��ü
		System.out.println("st1�� st2 �� : " + st1.equals(st2));
		System.out.println("st1�� st3 �� : " + st1.equals(st3));
		// equals() �޼����� ������ �ؽ��ڵ� ���̴�.
		
		// ���� ������ �Ϲݰ�ü�� ��� �������� ��ü�� �ٸ��� �ؽ��ڵ尡 �ٸ���.
		// ��, String�� ��� �����̴�. String�� ���ڿ��� ������ ��� ������ �޸𸮿� ����
		// ������ ȿ���� ���
		String a1 = new String("ȫ�浿");
		String a2 = new String("ȫ�浿");
		String a3 = new String("���");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a1 == a2);  // �� ���� ��� ����!
		System.out.println(a1.equals(a2));  // ���ڿ��� ���� ��(�� ����� ����϶�)
		
		
		
		
		
		
	}


}
