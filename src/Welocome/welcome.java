package Welocome;

public class welcome {

	public static void main(String[] arrgs) {

		// 窗体
		// ImageView imageView = new ImageView();
		// imageView.Action();

		// 线程
		MyThread mt1 = new MyThread("线程A ");
		MyThread mt2 = new MyThread("线程BB ");
		mt1.start();
		mt2.start();
	}

}