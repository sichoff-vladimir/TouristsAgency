package by.epam.agency.sychev.management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import by.epam.agency.sychev.ticket.HealthCentre;
import by.epam.agency.sychev.ticket.SeaRelaxation;
import by.epam.agency.sychev.ticket.SportsRelaxation;
import by.epam.agency.sychev.ticket.Ticket;

public class Manager {
	private ArrayList<Ticket> listOfTickets = new ArrayList<Ticket>();
	
	public Manager(){
		loadListOfTicket();
	}
	public void setListOfTickets(ArrayList list){
		if (null == list || list.isEmpty()){
			System.out.println("List of tickets is incorrect or empty!");
			return;
		}
		listOfTickets.addAll(list);
	}
	public void addToListOfTickets(Ticket ticket){
		if (null == ticket){
			System.out.println("Ticket is incorrect or empty!");
			return;
		}
		listOfTickets.add(ticket);
	}
	public ArrayList<Ticket> getListOfTickets(){
		return listOfTickets;
	}
	public Ticket getListOfTickets(int index){
		if (index <= 0 || index > listOfTickets.size()){
			System.out.println("Index of ticket is incorrect or empty!");
			return new Ticket();
		}
		return listOfTickets.get(index);
	}
	public void loadListOfTicket(){
		ArrayList<String> procedures = new ArrayList<String>();
		// hardcode =\\
		procedures.add("Massage");
		procedures.add("Swimming pool");
		listOfTickets.add(new SeaRelaxation(5,"Three times a day","Auto",500,"Cyprus",3));
		listOfTickets.add(new SeaRelaxation(14,"Two times a day","Auto",1200,"Sunny Beach",4));
		listOfTickets.add(new SportsRelaxation(7,"Two times a day","Auto",400,"Bukovel","SnowBoarding",true));
		listOfTickets.add(new SportsRelaxation(10,"Three times a day","Plane",500,"Varna","Wather polo",false));
		listOfTickets.add(new HealthCentre(21,"Fife times a day","Train",250,"Moscow",procedures));
		procedures.add("circular shower");
		listOfTickets.add(new HealthCentre(24,"Five times a day","Train",500,"St.Petersburg",procedures));
	}
	public void showListOfTickets(){
		for (int numberOfTicket = 0; numberOfTicket<listOfTickets.size(); numberOfTicket++){
			System.out.println((numberOfTicket+1)+" "+listOfTickets.get(numberOfTicket));
		}
	}
	public void sortedListOfTicketsByPrice(){
		Collections.sort(listOfTickets,new Comparator<Ticket>() {

			@Override
			public int compare(Ticket arg0, Ticket arg1) {
				// TODO Auto-generated method stub
				return (int)(arg0.getPrice()-arg1.getPrice());
			}
			
		});
	}
	public void sortedListOfTicketsByContinuance(){
		Collections.sort(listOfTickets,new Comparator<Ticket>() {

			@Override
			public int compare(Ticket arg0, Ticket arg1) {
				// TODO Auto-generated method stub
				return arg0.getContinuance()-arg1.getContinuance();
			}
			
		});
	}
	public void sortedListOfTicketsByTransportsType(){
		Collections.sort(listOfTickets,new Comparator<Ticket>() {

			@Override
			public int compare(Ticket arg0, Ticket arg1) {
				// TODO Auto-generated method stub
				return arg0.getTransportsType().compareTo(arg1.getTransportsType());
			}
			
		});
	}
	public void sortedListOfTicketsByFoodsType(){
		Collections.sort(listOfTickets,new Comparator<Ticket>() {

			@Override
			public int compare(Ticket arg0, Ticket arg1) {
				// TODO Auto-generated method stub
				return arg0.getFoodsType().compareTo(arg1.getFoodsType());
			}
			
		});
	}
	public ArrayList<Ticket> findTicketByOrder(Ticket order){
		ArrayList<Ticket> foundedTickets = new ArrayList<Ticket>();
		for (Ticket ticket: listOfTickets){
			if (order.equals(ticket)){
				foundedTickets.add(ticket);
			}
		}
		return foundedTickets;
	}
}
