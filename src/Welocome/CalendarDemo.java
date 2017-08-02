package Welocome;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.crypto.Data;

public class CalendarDemo {
	public void LearnCalendar() {
		Calendar calendar = new GregorianCalendar();
		System.out.println("Calendar");
		System.out.println("��ݣ�" + calendar.get(Calendar.YEAR));
		System.out.println("�·ݣ�" + calendar.get(Calendar.MONTH) + 1);
		System.out.println("�գ�" + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ��" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�" + calendar.get(Calendar.MINUTE));
		System.out.println("�룺" + calendar.get(Calendar.SECOND));
		System.out.println("���룺" + calendar.get(Calendar.MILLISECOND));

		System.out.println("DateFormat");
		// dateformat
		DateFormat df1 = DateFormat.getDateInstance();
		DateFormat df2 = DateFormat.getDateTimeInstance();
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));

		df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh", "CN"));

		df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD, DateFormat.ERA_FIELD, new Locale("ZH", "CN"));
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));

		// simpledateformat
		String Strdate = "2017-8-1 8:13:30.345";
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";
		String pat2 = "yyyy��MM��dd�� HHʱmm��ss��SSS����";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date dd = null;
		try {
			dd = sdf1.parse(Strdate);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		String d = sdf2.format(dd);
		System.out.println(dd);
		System.out.println(d);

	}
}
