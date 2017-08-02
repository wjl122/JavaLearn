package Welocome;

import java.util.Observable;
import java.util.Observer;

/*
 * �۲���ģʽ
 */
public class ObservableDemo extends Observable {
	private float price;

	public ObservableDemo(float price) {
		// TODO �Զ����ɵĹ��캯�����
		this.price = price;
	}
  
	public float getPrice(){
		return this.price;
	}
	
	public void setPrice(float price){
		super.setChanged();//���ñ仯��
		super.notifyObservers(price);//֪ͨ���й۲��߼۸�ı�
		this.price=price;
	}
	
	public String toString(){
		return "���ӵļ۸�Ϊ��"+this.price;
	}
}

 class HousePriceObserver implements Observer{
	 private  String name;
	 public HousePriceObserver(String name){
		 this.name=name;
	 }
	@Override
	public void update(Observable o, Object arg) {
		// TODO �Զ����ɵķ������
		
		if(arg instanceof Float){
			System.out.println(this.name+"�۲��߼۸��Ϊ:"+((Float) arg).floatValue());
		}
	}
 }
