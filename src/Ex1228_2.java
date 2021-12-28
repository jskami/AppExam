import java.io.*;
public class Ex1228_2 {

	public static void main(String[] args) {
		//�����Ϸ��� ���� üũ�Ǵ� ����, try ~ catch ~ finally���� / ���� 495p
		FileInputStream fis = null;  // ��������� null���� �� ���̴�. ���⼭ null������ ���ָ� finally���� fis�� ���� ������ ���� ��ȣ�ϱ� ������ ������ �� �� �ִ�. 
		                             //�� �ۿ��� fis ��ü�� �����ؾ� try �� �ܺο����� �ν�(���)�ǵ��� �� ��
		try {
			fis = new FileInputStream("a.txt"); // ����ó���� �ݵ�� �ؾ��Ѵ�. but, a.txt�� ������ �����ϸ� catch�������� �������� �ʰ� ã�Ƴ���.
			
			//�� �κ��� ����ó���Ǵ� ����
			//���ҽ� ���� ó��
		} catch (Exception e) {
			System.out.println(e); // ĳġ�������� ó��
			// e.printStckTrace(); �ᵵ
			// ������ ���� ����
			// ���⵵ ���ҽ� ���� ó��
		} finally {
			// ���� ó���� ������ ���� �ۼ�
			// ����ó���� �ؾ��Ѵ�.
			if (fis != null) {  // fis�� null�� ���� �ʴٸ�(=��ü�� ���� �ִٸ�)
				try {
					fis.close();  // ���������ϱ� �ݾƾ���
				} catch (Exception ex) {
					//System.out.println(ex); //�簴ü�� ���� ����ص� �ǰ�, 
					ex.printStackTrace(); //�迹�ܰ��� �������� ����ص� �ȴ�.
				}
			}
		}
		System.out.println("�Ϸ�κ��Դϴ�.");
	}

}
