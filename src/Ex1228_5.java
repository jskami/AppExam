import java.io.*;
public class Ex1228_5 {

	public static void main(String[] args) {
		//������ �غ���! 
		//����Ʈ ó�� Ŭ����(FileInputStream) ���
		//������ ���� �Ǵ� Ư������(Ű���峻�� �ִ�..��, �ƽ�Ű�ڵ带 ���ϴ� ��)�� ������ ������ �о� ȭ�鿡 ���
		//System.out.println() ����ؼ� ���
		//���ϸ� test.txt
		//������ ������ �ּ� 3���� �̻�
		//Ex1228_5 Ŭ���� �ۼ�
		
			FileInputStream fr = null;
			try {
				fr = new FileInputStream("test.txt");
			int i;
			while ((i = fr.read()) != -1) {  // -1�� �ǹ� ->
				System.out.print((char)i);
			}
				
		} catch (Exception e) {
			System.out.print(e);  //"1:" + 
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception ex) {
					System.out.print(ex);  //"2:" + 
				}
			}
		}
			
	}

}
