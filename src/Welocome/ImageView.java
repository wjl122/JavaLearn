package Welocome;

import java.awt.EventQueue;
import java.awt.Label;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageView {
	public ImageView() {

	}

	public void Action() {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				JFrame frame = new ImageFrame();
				frame.setTitle("图片");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class ImageFrame extends JFrame {
	private JLabel label;
	private JFileChooser chooser;
	private static final int Width = 300;
	public static final int Height = 400;

	public ImageFrame() {
		setSize(Width, Height);
		label = new JLabel();
		add(label);

		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("File");
		menuBar.add(menu);

		JMenuItem openItem = new JMenuItem("open");
		menu.add(openItem);

		openItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO 自动生成的方法存根
				int result = chooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});

		JMenuItem exItem = new JMenuItem("exit");
		menu.add(exItem);
		exItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
		});

	}

}