/* [예제 3-3] do~while문을 이용해서 'a'~'z'까지 출력
 * 
 */
public class DoWhile1 {

	public static void main(String[] args) {
	    char word = 'a';
	    do {
	    	System.out.print (word);   //a출력
	    	word = (char)(word+1);
	    }while(word<='z');

	}

}
