import java.util.Scanner;

public class ScoreArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double score[][] = new double[4][2];
		double sum = 0;
		
		for(int year=0; year<score.length; year++) {
			for(int i=0; i<score[year].length; i++) {
				System.out.print( (year+1)+"�г� "+(i+1)+"�б� ���� = ");
				score[year][i] = sc.nextDouble();
				sum += score[year][i];
			}
		}
		System.out.println("4�� ��ü ���� ��� = "+ sum/(score.length*score[0].length) );
		sc.close();
	}

}
