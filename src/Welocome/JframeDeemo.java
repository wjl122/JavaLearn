package Welocome;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JframeDeemo {
	/*
	 * TODO��ʵ����
	 */
	public JframeDeemo() {

	}

	/*
	 * TODO:չʾ����
	 */

	public void ShowFrame() throws IOException {
		JFrame frame = new JFrame("��ʼѧϰFrame");
		// ���ø߶�����
		Dimension d = new Dimension();
		d.setSize(600, 600);
		frame.setSize(d);
		// ����λ��
		Point p = new Point();
		p.setLocation(400, 50);
		frame.setLocation(p);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(1);
			}
		});
		frame.setBackground(Color.gray);
		// ����һ
		// ImageIcon icon = new ImageIcon("D:/Java/JavaLearn/images/title.jpg");
		// frame.setIconImage(icon.getImage());

		// ������
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL path = JframeDeemo.class.getResource("/title.jpg");
		Image image = kit.getImage(path);
		frame.setIconImage(image);
		// frame.setLayout(null);

		JLabel label = new JLabel("����");

		// String fontName = GetFontNameRandom();
		Font font = new Font("����", Font.BOLD, 18);
		label.setFont(font);
		// label.setForeground(Color.black);
		// label.setLocation(0, 0);
		// label.setSize(20, 10);
		label.setBounds(10, 10, 50, 30);
		
		JLabel label2=new JLabel();
		label2.setFont(font);
		label2.setBounds(30, 40, 100, 50);

		JTextField txtName = new JTextField();
		txtName.setColumns(80);
		txtName.setBounds(60, 10, 100, 30);

		JButton btn = new JButton("��ѯ");
		btn.setFont(font);
		// btn.setSize(50, 10);
		// btn.setLocation(100, 0);
		btn.setBounds(180, 10, 80, 30);
        btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO ��text��ֵ��ֵ��lable��
				label2.setText(txtName.getText());
				
			}
		});
		// frame.add(label);
		// frame.add(btn);
		// ������FlowOut
		// FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 10, 3);
		// frame.setLayout(new GridLayout(3, 3,3,3));
		// ����
		Container container = frame.getContentPane();
		container.setLayout(null);
		container.add(label);
		container.add(btn);
		container.add(txtName);
		container.add(label2);
		frame.setVisible(true);

	}

	/*
	 * TODO�� �����ȡϵͳ�е�����
	 */
	public String GetFontNameRandom() {
		GraphicsEnvironment gc = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = gc.getAvailableFontFamilyNames();
		int a = fontNames.length;
		int i = (int) (a * Math.random());
		String name = fontNames[i];
		System.out.println(name);
		return name;
	}
}
