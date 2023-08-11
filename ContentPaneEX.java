import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEX extends JFrame{
	private static final long serialVersionUID = 1L;

	public ContentPaneEX() {
		// (1) 타이틀
		setTitle("ContentPane 예제");
		
		// (2) 컨텐트팬 얻어오기
		Container cp = getContentPane();
		
		// (3) 배경색과 배치관리자 설정
		cp.setBackground(Color.orange);
		cp.setLayout(new FlowLayout());  // 왼쪽에서 오른쪽으로 컴포넌트 부착
		
		// (4) 버튼 생성후 부착하기
		JButton btn1 = new JButton("OK");
		cp.add(btn1);
		
		//cp.add( new JButton("OK") );
		cp.add( new JButton("Cancel") );
		cp.add( new JButton("Ignore") );
		
		// (5) 프레임 크기와 보여주기 설정
		setSize(300,200);
		setVisible(true);
		// 프레임 윈도우가 닫힐 때 스윙 프로그램도 함께 종료되도록 작성
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ContentPaneEX();

	}

}
