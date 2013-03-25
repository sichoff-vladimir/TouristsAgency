package by.epam.agency.sychev.ticket;

public class SportsRelaxation extends Relaxation{
	private String kind;
	private boolean needForInventory;
	
	public SportsRelaxation(){}
	public SportsRelaxation(int continuance, String foodsType,String transports,double price,
							String city,String kind, boolean needForInventory){
		super(continuance, foodsType, transports, price, city);
		setKind(kind);
		setNeedForInventory(needForInventory);
	}
	public void setKind(String kind){
		if (null == kind){
			System.out.println("Kinds error!");
			return;
		}
		this.kind = kind;
	}
	public void setNeedForInventory(boolean bool){
		this.needForInventory = bool;
	}
	public String getKind(){
		return kind;
	}
	public boolean isNeedForInventary(){
		return this.needForInventory;
	}
	public String toString(){
		return "\nContinuance: "+this.getContinuance()+"\nTransports Type: "+this.getTransportsType()+
				"\nPrice: "+this.getPrice()+"\nFoods Type: "+this.getFoodsType()+
				"\nCity: "+this.getCity()+"\nKind of sport: "+
				this.getKind()+"\nNeen for inventory: "+this.isNeedForInventary();
	}
}
