import java.util.Scanner;

class StringStack implements Stack {
	private String arr[];
	private int top;
	public StringStack(int n) {
		arr = new String[n];
		top = 0;
	}
	public int length() {
		return top;
	}
	public int capacity() {
		return arr.length;
	}
	public String pop() {
		String str = arr[top-1];
		top--;
		return str;
			
	}
	public boolean push(String val) {
		if(top == arr.length)
		    return false;
		else {
			arr[top] = val;
			top++;
			return true;
		}
	}
}

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է�>> ");
		int n = sc.nextInt();
		StringStack ss = new StringStack(n);
		while(true) {
			System.out.print("���ڿ� �Է�>> ");
			String str = sc.next();
			if(str.equals("�׸�"))
				break;
			boolean res = ss.push(str);
			if(res == false)
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		}
		System.out.print("������ ����� ��� ���ڿ� �� : ");
		int len = ss.length();
		for(int i=0; i<len; i++) {
			System.out.print(ss.pop() + " ");
		}
        sc.close();
	}

}
