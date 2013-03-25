package by.epam.agency.sychev.ticket;

import by.epam.agency.sychev.management.Manager;

public class ClientClass {
	public static void main(String[] args){
		Manager manager = new Manager();
		Ticket order = new Ticket();
		order.setPrice(500);
		for (Ticket ticket: manager.findTicketByOrder(order)){
			System.out.println("\n"+ticket);
		}
	}
}
