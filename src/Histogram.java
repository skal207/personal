import java.util.Scanner;
/*
 * 1~50������ ������ 10�� �Է�, 10�� �ڸ����� ��� ������ �� ��ǥ�� (1���� �迭�� if~else if���� �̿�)
 */
public class Histogram {

	public static void main(String[] args) {
		int count[];
		count = new int[10];
		String star[];
		star = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<count.length; i++) {
			System.out.print("1~50������ ������ 10�� �Է����ּ���>>");
			count[i] = sc.nextInt();
		}
        for(int i=0; i<5; i++) {
        	star[i] = (((i*10)+1)+"-"+((i+1)*10)+":");
        }
        for(int l=0; l<5; l++)
        	for(int i=0; i<count.length; i++)
        		if((l*10)+1<=count[i]&&count[i]<=(l+1)*10) {
        			star[l] +="��";
        		}
        for(int j=0; j<star.length; j++) {
        	System.out.println(star[j]);
        }
        sc.close();
	}
}
