import java.io.*;
public class Ex1228_4 {

	public static void main(String[] args) {
		// ��Ʈ�� Ŭ���� Ȱ��(���� �б�) / ���� 534~5p
		FileReader fr = null;
		try {
			fr = new FileReader("reader.txt"); // AppExam���� �� bin(����)������ ����� ���� ����
			//ó�� ����, ���ڿ��� �޾Ƴ��⸸ �ϸ� �Ǵµ�, ���ڿ��� �󸶳� �ִ����� �𸣴� ����
			int i;  // ���� ����Ʈ ���� ������ ����
			while ((i = fr.read()) != -1) {  // �����͸� ������ ��� ����, �� �о����� -1�� ��ȯ-> �ݺ��� Ż��!
				//System.out.println(i);  // �̷��� i�� ����Ʈ�������� ��µǱ� ������ �ȵ�!
					System.out.println((char)i);  //����Ʈ�� ���ڷ� ���! 
			}
			// �������.. but �����Ұž�, �޸��忡 �ִ� '�ȳ��ϼ���'�� ���ڿ��̱� ��������, �ѱ��� ���� ����Ʈ�� ���յ� ���ڿ��̱� �����̾�. ???????�� ��µɰž�. ���� �����ڷ� �ٲ㺸��. ����� �� �ɰž�------------------
			
		} catch (Exception e) {
			System.out.println("1:" + e);
		} finally {
			if (fr != null) {  // reader.txt������ �����ϴϱ� ������ �����ߴٸ�
				try {
					fr.close();  // �ݾƾ���! �ݴ� ������ ������.
				} catch (Exception ex) {
					System.out.println("2:" + ex);
				}
			}
		}

	}

}
