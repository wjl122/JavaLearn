package Welocome;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.Point;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JframeDeemo {
	/*
	 * TODO��ʵ����
	 */
	public JframeDeemo() {

	}

	/*
	 * TODO:չʾ����
	 */

	public void ShowFrame() {
		JFrame frame = new JFrame("��ʼѧϰFrame");
		JLabel label = new JLabel("�鿴", Label.LEFT);

		//String fontName = GetFontNameRandom();
		Font font = new Font("����", Font.ITALIC + Font.BOLD, 28);
		label.setFont(font);
		label.setForeground(Color.red);
		// ���� 
		Container container = frame.getContentPane();
		container.add(label);
		// ���ø߶�����
		Dimension d = new Dimension();
		d.setSize(600, 600);
		frame.setSize(d);
		// ����λ��
		Point p = new Point();
		p.setLocation(200, 100);
		frame.setLocation(p);

		frame.setBackground(Color.gray);
		frame.setVisible(true);
	}

	/*
	 * TODO�� �����ȡϵͳ�е�����
	 */
	public String GetFontNameRandom() {
		GraphicsEnvironment gc = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = gc.getAvailableFontFamilyNames();
		int a = fontNames.length;
		int i = (int)(a * Math.random());		
		String name = fontNames[i];		
		System.out.println(name);
		return name;
	}
}
