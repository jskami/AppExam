import java.io.*;
public class Ex1228_3 {

	public static void main(String[] args) {
		// ��Ʈ�� Ŭ���� Ȱ��(���� �б�) / ���� 534~5p
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("reader.txt"); // AppExam���� �� bin(����)������ ����� ���� ����
			//ó�� ����, ���ڿ��� �޾Ƴ��⸸ �ϸ� �Ǵµ�, ���ڿ��� �󸶳� �ִ����� �𸣴� ����
			int i;  // ���� ����Ʈ ���� ������ ����
			while ((i = fis.read()) != -1) {  // �����͸� ������ ��� ����, �� �о����� -1�� ��ȯ-> �ݺ��� Ż��!
				 //System.out.println(i);  // �̷��� i�� ����Ʈ�������� ��µǱ� ������ �ȵ�!
				 System.out.println((char)i);  //����Ʈ�� ���ڷ� ���! 
			}
			// �������.. but �����Ұž�, �޸��忡 �ִ� '�ȳ��ϼ���'�� ���ڿ��̱� ��������, �ѱ��� ���� ����Ʈ�� ���յ� ���ڿ��̱� �����̾�. ???????�� ��µɰž�. ���� �����ڷ� �ٲ㺸��. ����� �� �ɰž�------------------
		
		} catch (Exception e) {
			System.out.println("1:" + e);
		} finally {
			if (fis != null) {  // reader.txt������ �����ϴϱ� ������ �����ߴٸ�
				try {
					fis.close();  // �ݾƾ���! �ݴ� ������ ������.
				} catch (Exception ex) {
					System.out.println("2:" + ex);
				}
			}
		}

	}

}
