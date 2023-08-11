import java.util.Scanner;

public class ScoreArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double score[][] = new double[4][2];
		double sum = 0;
		
		for(int year=0; year<score.length; year++) {
			for(int i=0; i<score[year].length; i++) {
				System.out.print( (year+1)+"학년 "+(i+1)+"학기 평점 = ");
				score[year][i] = sc.nextDouble();
				sum += score[year][i];
			}
		}
		System.out.println("4년 전체 평점 평균 = "+ sum/(score.length*score[0].length) );
		sc.close();
	}

}
