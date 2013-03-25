package by.epam.agency.sychev.ticket;

import java.util.ArrayList;

public class HealthCentre extends Relaxation{
	private ArrayList listOfProcedure = new ArrayList();
	
	private void addToListOfProcedure(String procedure){
		if (null == procedure){
			System.out.println("Procedure is incorrect or empty!");
			return;
		}
		listOfProcedure.add(procedure);
	}
	public HealthCentre(){}
	public HealthCentre(int continuance, String foodsType,String transports,double price,
			String city, ArrayList listOfProcedure){
		super(continuance, foodsType, transports, price, city);
		setListOfProcedure(listOfProcedure);
	}
	public void setListOfProcedure(ArrayList list){
		if (null == list){
			System.out.println("List is empty!");
			return;
		}
		if (list.isEmpty()){
			System.out.println("List is empty!");
			return;
		}
		listOfProcedure.addAll(list);
	}
	public void setListOfProcedure(int index, String str){
		if (null == str){
			System.out.println("Procedures name is incorrect or empty!");
			return;
		}
		if (index <= 0 || index > this.listOfProcedure.size()){
			System.out.println("index of procedure is incorrect or negative!");
			return;
		}
		listOfProcedure.set(index, str);
	}
	public ArrayList getListOfProcedure(){
		return listOfProcedure;
	}
	public String getListOfProcedure(int index){
		if (index <= 0 || index > this.listOfProcedure.size()){
			System.out.println("index of procedure is incorrect or negative!");
			return "Error";
		}
		return listOfProcedure.get(index).toString();
	}
	public String toString(){
		StringBuffer procedures = new StringBuffer();
		for (int index = 0; index < listOfProcedure.size(); index++){
			procedures.append("\n\t"+listOfProcedure.get(index));
		}
		return "\nContinuance: "+this.getContinuance()+"\nTransports Type: "+this.getTransportsType()+
				"\nPrice: "+this.getPrice()+"\nFoods Type: "+this.getFoodsType()+
				"\nCity: "+this.getCity()+"\nProcedures:\n"+procedures;
	}
}
