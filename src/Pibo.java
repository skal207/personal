import java.util.Scanner;

/*  [����] �Ǻ���ġ ������ �Է¹��� ������ŭ 0���� ����Ͻÿ�.
 *        ����ϰ��� �ϴ� �Ǻ���ġ ������ ������ �Է��ϼ��� >> 8
 *        : 0 1 1 2 3 5 8 13
 */
public class Pibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����ϰ��� �ϴ� �Ǻ���ġ ������ ���� �Է�>> ");
		int cnt = sc.nextInt();
		
		int num1=0;
		int num2=1;
		int next=0;
		
		System.out.print(num1 + "\t"+num2+"\t");
		for(int i=3; i<=cnt; i++) {
			next = num1+num2;
			System.out.print(next+"\t");
			
			num1 = num2;
			num2 = next;
			
			sc.close();
		}
	}

}
