package by.epam.agency.sychev.ticket;

import java.util.ArrayList;

public class Relaxation extends Ticket{
	private String city;	//place of relaxation
	
	public Relaxation(){}
	public Relaxation(int continuance, String foodsType,String transports,double price,String city){
		super(continuance,foodsType,transports,price);
		setCity(city);
	}
	public void setCity(String city){
		if (null == city){
			System.out.println("City is incorrect!");
			return;
		}
		if (city.isEmpty()){
			System.out.println("City is empty!");
			return;
		}
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public String toString(){
		return "\nContinuance: "+this.getContinuance()+"\nTransports Type: "+this.getTransportsType()+
				"\nPrice: "+this.getPrice()+"\nFoods Type: "+this.getFoodsType()+
				"\nCity: "+this.getCity();
	}
}
