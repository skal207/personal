import java.util.Scanner;
/*
 * 1~50까지의 정수를 10개 입력, 10의 자릿수로 끊어서 갯수를 별 로표현 (1차원 배열과 if~else if문을 이용)
 */
public class Histogram {

	public static void main(String[] args) {
		int count[];
		count = new int[10];
		String star[];
		star = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<count.length; i++) {
			System.out.print("1~50까지의 정수를 10개 입력해주세요>>");
			count[i] = sc.nextInt();
		}
        for(int i=0; i<5; i++) {
        	star[i] = (((i*10)+1)+"-"+((i+1)*10)+":");
        }
        for(int l=0; l<5; l++)
        	for(int i=0; i<count.length; i++)
        		if((l*10)+1<=count[i]&&count[i]<=(l+1)*10) {
        			star[l] +="★";
        		}
        for(int j=0; j<star.length; j++) {
        	System.out.println(star[j]);
        }
        sc.close();
	}
}
