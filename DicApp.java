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
	// [1] ������Ʈ �ۼ�, �ؽø� ����
			JTextField eng = new JTextField(10);
			JTextField kor = new JTextField(10);
			JButton saveBtn = new JButton("����");
			JButton searchBtn = new JButton("�˻�");
			JTextArea ta = new JTextArea(5, 30);
			JLabel countText = new JLabel("����� �ܾ�� :");
			JLabel countLbl = new JLabel("0");
			
			HashMap<String, String> dic = new HashMap<String, String>();
	// [2] ������ ( �����Ӱ� ���õ� �⺻��, ��ġ������, �����ʺ����� ������Ʈ�� ���� )
			public DicApp() {
				super("���� ���� �����");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// ����Ʈ�� ��������
				Container c = getContentPane();
				
				// ��ġ������ ����
				c.setLayout(new FlowLayout());
				
				// ������Ʈ ����
				c.add( new JLabel("����") );  // ���� ���̺� ������
				c.add(eng);                  // ���� �ؽ�Ʈ�ʵ� ����
				c.add( new JLabel("�ѱ�") );
				c.add(kor);
				c.add(saveBtn);
				c.add(searchBtn);
				c.add(countText);
				c.add(countLbl);
				c.add(new JScrollPane(ta));
				
				
				// saveBtn�� ������ ��, ������ ����
				saveBtn.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent e) {    //@override
						String eText = eng.getText();         // ����ܾ� ��������
						String kText = kor.getText();         // �ѱ۴ܾ� ��������
						
						// ��� �ѱ� �ؽ�Ʈ�� �Է����� ���� ���
						if( eText.length()==0 || kText.length()==0 ) {
							ta.append("�ܾ �Է����� �ʾҽ��ϴ�.\n");
							return;
						}
						if( dic.get( eText )==null ) {      // ���ѻ����� ���� �ܾ��� ���,
							ta.append("���� ("+eText+", "+kText+")\n");
							// ī��Ʈ���� ���� ���������� ����ȯ�Ͽ� ��������
							int count = Integer.parseInt(countLbl.getText());
							count++;
							countLbl.setText( Integer.toString(count) );
						}
						else         // ���� ������ �ִ� ��� ==> ����
							ta.append("���� ("+eText+", "+kText+")\n");
						
						// �ؽøʿ� ����
						dic.put(eText, kText);
					}
				});
				
				// searchBtn�� ������ ��, ������ ����
				searchBtn.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String kText = dic.get( eng.getText() );   // ���� �ؽ�Ʈ�ʵ� ������ �ؽø� �˻��ϱ�
						if( kText==null )
							kText="�ܾ� ����";
						kor.setText( kText );   // �ؽøʿ��� �˻��� �ܾ �ѱ��ؽ�Ʈ�ʵ�� ���
					}
				});
				
				
				this.setSize(370, 250);
				this.setVisible(true);
				
				
				
			}

	public static void main(String[] args) {
				new DicApp();
	}

}
