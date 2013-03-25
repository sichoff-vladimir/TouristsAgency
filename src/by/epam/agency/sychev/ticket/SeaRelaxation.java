package by.epam.agency.sychev.ticket;

public class SeaRelaxation extends Relaxation{
	private int starHotel;
	
	public SeaRelaxation(){}
	public SeaRelaxation(int continuance, String foodsType,String transports,double price,String city,int star){
		super(continuance, foodsType, transports, price, city);
		setStarHotel(star);
	}
	public void setStarHotel(int s){
		if (s <= 0 || s >5){
			System.out.println("Count of stars can't be negative or more than 5!");
			return;
		}
	}
	public int getStarHotel(){
		return starHotel;
	}
	public String toString(){
		return "\nContinuance: "+this.getContinuance()+"\nTransports Type: "+this.getTransportsType()+
				"\nPrice: "+this.getPrice()+"\nFoods Type: "+this.getFoodsType()+
				"\nCity: "+this.getCity()+"\nStar Hotel: "+this.getStarHotel();
	}
}