package by.epam.agency.sychev.ticket;

public class Ticket {
	private int continuance;
	private String foodsType;
	private String transportsType;
	private double price;
	
	public Ticket(){}
	public Ticket(int continuance, String foodsType,String transports,double price){
		setContinuance(continuance);
		setFoodsType(foodsType);
		setTransportsType(transports);
		setPrice(price);
	}
	public void setPrice(double price){
		if (price <= 0){
			System.out.println("Price is negative!");
			return;
		}
		this.price = price;
	}
	public void setContinuance(int c){
		if (c <= 0){
			System.out.println("Continuance error!");
			return;
		}
		this.continuance = c;
	}
	public void setFoodsType(String s){
		if (null == s){
			System.out.println("Foods type error!");
			return;
		}
		this.foodsType = s;
	}
	public void setTransportsType(String s){
		if (null == s){
			System.out.println("Transports type error!");
			return;
		}
		this.transportsType = s;
	}
	
	public double getPrice(){
		return price;
	}
	public int getContinuance(){
		return continuance;
	}
	public String getFoodsType(){
		return foodsType;
	}
	public String getTransportsType(){
		return transportsType;
	}
	public String toString(){
		return "\nContinuance: "+continuance+"\nTransports Type: "+transportsType+
				"\nPrice: "+price+"\nFoods Type: "+foodsType;
	}
	public boolean equals(Ticket ticket){
		if (this.getContinuance() != 0){
			if (this.getContinuance() != ticket.getContinuance()){
				return false;
			}
		}
		if (this.getPrice() != 0){
			if (this.getPrice() != ticket.getPrice()){
				return false;
			}
		}
		if (null != this.getFoodsType()){
			if(!this.getFoodsType().equals(ticket.getFoodsType())){
				return false;
			}
		}
		if(null != this.getTransportsType()){
			if(!this.getTransportsType().equals(ticket.getTransportsType())){
				return false;
			}
		}
		return true;
	}
}
