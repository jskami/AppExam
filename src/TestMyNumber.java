
public class TestMyNumber { // ���ٽ� / ���� 463p

	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y; 
		// ()�ȿ� �μ�(argument)�� �־��ְ� ->�̷��� ġȯ�ϰڴ�!-�� �ǹ̸� ���ش�.
		// �������̽��� �޼��带 ������ ���̴�.
		System.out.println(max.getMax(100, 200));
	
	
	// StringConcat�������̽��� ���� �׽�Ʈclass�� ���� ������ ���� �׳� ���⼭ ����	
		String s1 = "�ڹ�";
		String s2 = "���α׷���";
		StringConcat concat = (x, y) -> System.out.println(x+y);
		concat.makeString(s1, s2);
	}

}

