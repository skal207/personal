import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEX extends JFrame{
	private static final long serialVersionUID = 1L;

	public ContentPaneEX() {
		// (1) Ÿ��Ʋ
		setTitle("ContentPane ����");
		
		// (2) ����Ʈ�� ������
		Container cp = getContentPane();
		
		// (3) ������ ��ġ������ ����
		cp.setBackground(Color.orange);
		cp.setLayout(new FlowLayout());  // ���ʿ��� ���������� ������Ʈ ����
		
		// (4) ��ư ������ �����ϱ�
		JButton btn1 = new JButton("OK");
		cp.add(btn1);
		
		//cp.add( new JButton("OK") );
		cp.add( new JButton("Cancel") );
		cp.add( new JButton("Ignore") );
		
		// (5) ������ ũ��� �����ֱ� ����
		setSize(300,200);
		setVisible(true);
		// ������ �����찡 ���� �� ���� ���α׷��� �Բ� ����ǵ��� �ۼ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ContentPaneEX();

	}

}
