import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DicApp extends JFrame{
	// [1] 컴포넌트 작성, 해시맵 생성
			JTextField eng = new JTextField(10);
			JTextField kor = new JTextField(10);
			JButton saveBtn = new JButton("저장");
			JButton searchBtn = new JButton("검색");
			JTextArea ta = new JTextArea(5, 30);
			JLabel countText = new JLabel("저장된 단어수 :");
			JLabel countLbl = new JLabel("0");
			
			HashMap<String, String> dic = new HashMap<String, String>();
	// [2] 생성자 ( 프레임과 관련된 기본값, 배치관리자, 리스너부착한 컴포넌트들 부착 )
			public DicApp() {
				super("영한 사전 만들기");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// 컨텐트팬 가져오기
				Container c = getContentPane();
				
				// 배치관리자 설정
				c.setLayout(new FlowLayout());
				
				// 컴포넌트 부착
				c.add( new JLabel("영어") );  // 영어 레이블 부착기
				c.add(eng);                  // 영어 텍스트필드 부착
				c.add( new JLabel("한글") );
				c.add(kor);
				c.add(saveBtn);
				c.add(searchBtn);
				c.add(countText);
				c.add(countLbl);
				c.add(new JScrollPane(ta));
				
				
				// saveBtn이 눌렸을 때, 리스너 구현
				saveBtn.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent e) {    //@override
						String eText = eng.getText();         // 영어단어 가져오기
						String kText = kor.getText();         // 한글단어 가져오기
						
						// 영어나 한글 텍스트를 입력하지 않은 경우
						if( eText.length()==0 || kText.length()==0 ) {
							ta.append("단어를 입력하지 않았습니다.\n");
							return;
						}
						if( dic.get( eText )==null ) {      // 영한사전에 없는 단어인 경우,
							ta.append("삽입 ("+eText+", "+kText+")\n");
							// 카운트라벨의 값을 정수형으로 형변환하여 가져오기
							int count = Integer.parseInt(countLbl.getText());
							count++;
							countLbl.setText( Integer.toString(count) );
						}
						else         // 영한 사전에 있는 경우 ==> 변경
							ta.append("변경 ("+eText+", "+kText+")\n");
						
						// 해시맵에 저장
						dic.put(eText, kText);
					}
				});
				
				// searchBtn이 눌렸을 때, 리스너 구현
				searchBtn.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String kText = dic.get( eng.getText() );   // 영어 텍스트필드 값으로 해시맵 검색하기
						if( kText==null )
							kText="단어 없음";
						kor.setText( kText );   // 해시맵에서 검색한 단어를 한글텍스트필드로 출력
					}
				});
				
				
				this.setSize(370, 250);
				this.setVisible(true);
				
				
				
			}

	public static void main(String[] args) {
				new DicApp();
	}

}
