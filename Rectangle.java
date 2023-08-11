import java.util.Scanner;

/*
 *  �簢���� ����, ����, ���θ� �Է¹޾� �簢���� ������ ����ϴ� ���α׷�
 *   - ��� ���� : int width, int height, String color
 *   - ��� �޼ҵ� : int getArea(), String getColor()
 */
public class Rectangle {
	// ��� ����
	int width;
	int height;
	String color;
	
	//�⺻������
	public Rectangle() {
		width=0;
		height=0;
		color="";
	}
	
	//������ - �Ű����� 3��
	public Rectangle(int w, int h, String c) {
		width = w;
		height = h;
		color = c;
	}
	
	// ��� �޼ҵ�
	public int getArea() {
		return width*height;
	}
	
	public String getColor() {
		return color;
	}

	public static void main(String[] args) {
		// ��ü ����
		Rectangle rect = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		//����, ���� �Է¹ޱ�
		System.out.print("���� �Է�>> ");
		rect.width = sc.nextInt();
		System.out.print("���� �Է�>> ");
		rect.height = sc.nextInt();
		System.out.print("���� �Է�>> ");
		rect.color = sc.next();
		
		Rectangle rect2 = new Rectangle(1, 1, "Black");    // �Ű����� 3���� ���� ������
		System.out.println("�⺻ "+rect2.getColor() +"�簢���� ���� = "+rect2.getArea());
		             //     �⺻ Black �簢���� ���� = 1
		
		// ������ ���� ���
		System.out.println(rect.getColor() + "�簢���� ���� = "+ rect.getArea());
		sc.close();
		}
}
