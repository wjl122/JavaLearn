package Welocome;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

public class welcome {

	public static void main(String[] arrgs) throws Exception {

		// ����
		// ImageView imageView = new ImageView();
		// imageView.Action();

		// �߳�
		// MyThread mt1 = new MyThread("�߳�A ");
		// MyThread mt2 = new MyThread("�߳�BB ");
		// mt1.start();
		// mt2.start();

		// calendar
		// CalendarDemo calendarDemo=new CalendarDemo();
		// calendarDemo.LearnCalendar();

		// observable
		// ObservableDemo h = new ObservableDemo(100000);
		// HousePriceObserver h1 = new HousePriceObserver("A");
		// HousePriceObserver h2 = new HousePriceObserver("B");
		// HousePriceObserver h3 = new HousePriceObserver("C");
		// h.addObserver(h1);
		// h.addObserver(h2);
		// h.addObserver(h3);
		// System.out.println(h);
		// h.setPrice(44444);
		// System.out.println(h);

		// ����
		// Class<?> c1 = null;
		// try {
		// c1 = Class.forName("Welocome.CalendarDemo");
		// } catch (Exception e) {
		// // TODO: handle exception
		// e.printStackTrace();
		// }
		// /*
		// * CalendarDemo calendarDemo=null; try {
		// * calendarDemo=(CalendarDemo)c1.newInstance(); } catch
		// * (InstantiationException | IllegalAccessException e) { // TODO �Զ����ɵ�
		// * catch �� e.printStackTrace(); }
		// */
		// try {
		// Method method = c1.getMethod("LearnCalendar");
		// method.invoke(c1.newInstance());
		// } catch (Exception e) {
		// // TODO: handle exception
		// }
		// // calendarDemo.LearnCalendar();
		// System.out.println(c1.getName());

		/*
		 ConnectionDemo connectionDemo = new ConnectionDemo();
		connectionDemo.sql = "SELECT  * FROM z_menu;";
		ResultSet rSet = connectionDemo.ExecSql();
		while(rSet.next()){
			System.out.print(rSet.getString("name") + " "); 
		}
		connectionDemo.Close();*/
		
		//Show Frame
		JframeDeemo jf=new JframeDeemo();
		jf.ShowFrame();
	    System.gc();
		
	}

}