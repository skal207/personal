import java.util.Scanner;

/*
 *        Circle Ŭ���� �����
 *       - ������� : int radius, String name
 *       - ����޼ҵ� : double getArea()
 */
public class Circle {
	// �������
	int radius;
	String name;
	
	//����޼ҵ�
    public double getArea() {
    	return 3.14*radius*radius;
    }
    
    
	public static void main(String[] args) {
		// ��ü�� �����Ͽ� ó��
		Circle pizza = new Circle();        // Circle ��ü pizza �ϳ� ����
		pizza.radius = 10;                  // pizza�� ������ 10
		pizza.name = "��������";             // pizza�� �̸� "��������"
		
		double result = pizza.getArea();    //������ ���� ����ϱ�
		System.out.println(pizza.name +" ������ ������ "+ result);
		
		Circle donut = new Circle();        // Circle ��ü donut �ϳ� ����
		System.out.print("������ ������ �Է� : ");
		Scanner sc = new Scanner(System.in);
		donut.radius = sc.nextInt();
		System.out.print("��ð� ���� ���ڴ�?>> ");
		donut.name = sc.next();
		
		System.out.println(donut.name+" ������ ������ "+ donut.getArea());
		
		sc.close();
		

	}

}
