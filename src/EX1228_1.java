
public class EX1228_1 {

	public static void main(String[] args) {
		// ����ó�� try ~ catch / ���� 491p
		int[]arr = new int[5];
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� ���� �ڸ�
			// ������ ������踦 ��Ȯ�� �����ؾ��Ѵ�!
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {  //Exception�� �ֻ��� Ŭ������ ���ϰ� e�� Exception�� �� ���ڸ� ���� ��(�� �ǹ� ����)
			// ���ܰ� �߻����� ��� ó���� ���� �ڸ�(������Ƶ� ����)
			System.out.println(e.toString()); //�̰� ���ܸ� ó���� ���� ���Ѱ��� �����ڰ� �� �� �����ϱ� e.tostring�Ἥ ��¹����� ǥ���Ѵ�. .toString�� ���� �����ϴ�. 
		}
		
	}

}
