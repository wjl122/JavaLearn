package Welocome;

import java.util.Observable;
import java.util.Observer;

/*
 * 观察者模式
 */
public class ObservableDemo extends Observable {
	private float price;

	public ObservableDemo(float price) {
		// TODO 自动生成的构造函数存根
		this.price = price;
	}
  
	public float getPrice(){
		return this.price;
	}
	
	public void setPrice(float price){
		super.setChanged();//设置变化点
		super.notifyObservers(price);//通知所有观察者价格改变
		this.price=price;
	}
	
	public String toString(){
		return "房子的价格为："+this.price;
	}
}

 class HousePriceObserver implements Observer{
	 private  String name;
	 public HousePriceObserver(String name){
		 this.name=name;
	 }
	@Override
	public void update(Observable o, Object arg) {
		// TODO 自动生成的方法存根
		
		if(arg instanceof Float){
			System.out.println(this.name+"观察者价格改为:"+((Float) arg).floatValue());
		}
	}
 }
