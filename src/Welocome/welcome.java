package Welocome;

public class welcome {

	public static void main(String[] arrgs) {

		// ����
		// ImageView imageView = new ImageView();
		// imageView.Action();

		// �߳�
		MyThread mt1 = new MyThread("�߳�A ");
		MyThread mt2 = new MyThread("�߳�BB ");
		mt1.start();
		mt2.start();
	}

}