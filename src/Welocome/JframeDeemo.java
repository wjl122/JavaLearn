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
	 * TODO：实例化
	 */
	public JframeDeemo() {

	}

	/*
	 * TODO:展示窗体
	 */

	public void ShowFrame() {
		JFrame frame = new JFrame("开始学习Frame");
		JLabel label = new JLabel("查看", Label.LEFT);

		//String fontName = GetFontNameRandom();
		Font font = new Font("宋体", Font.ITALIC + Font.BOLD, 28);
		label.setFont(font);
		label.setForeground(Color.red);
		// 容器 
		Container container = frame.getContentPane();
		container.add(label);
		// 设置高度与宽度
		Dimension d = new Dimension();
		d.setSize(600, 600);
		frame.setSize(d);
		// 设置位置
		Point p = new Point();
		p.setLocation(200, 100);
		frame.setLocation(p);

		frame.setBackground(Color.gray);
		frame.setVisible(true);
	}

	/*
	 * TODO： 随机获取系统中的字体
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
