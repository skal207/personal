import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		
		add(new JButton("Open"));
		add(new JButton("Save"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		JLabel la = new JLabel("20181525 조중권");
		
		la.setLocation(100, 50);
		la.setSize(150, 20);
		add(la);
	}
}

public class Homework extends JFrame{
	public Homework() {
		setTitle("8장 오픈챌린지 과제");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NorthPanel np = new NorthPanel();
		CenterPanel cp = new CenterPanel();
		
		add(np, BorderLayout.NORTH);
		add(cp, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Homework();

	}

}
