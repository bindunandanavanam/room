package com.cg.room.dao;

import java.util.HashMap;
import java.util.Map;
import com.cg.room.beans.Customer;
import com.cg.room.beans.Room;

public class CustomerDaoImpl implements ICustomerDao {
	 int count = 1000;
	Room room = new Room();
	Customer customer = new Customer();

	Map<Integer, Room> RoomEntry;
	Map<Integer, Customer> CustomerEntry;

	public CustomerDaoImpl() {

		RoomEntry = new HashMap<Integer, Room>();
		CustomerEntry = new HashMap<Integer, Customer>();

		RoomEntry.put(101, new Room("AC_SINGLE", "NOT_BOOKED"));
		RoomEntry.put(102, new Room("AC_SINGLE", "NOT_BOOKED"));
		RoomEntry.put(103, new Room("AC_DOUBLE", "NOT_BOOKED"));
		RoomEntry.put(201, new Room("NONAC_SINGLE", "NOT_BOOKED"));
		RoomEntry.put(202, new Room("NONAC_SINGLE", "NOT_BOOKED"));
		RoomEntry.put(203, new Room("NONAC_DOUBLE", "NOT_BOOKED"));

	}

	public int getCustomerDetails(Customer customer) {
				int c = 0;
		for (Map.Entry m : RoomEntry.entrySet()) {
			if (m.getKey().equals(customer.getRoom_no())) {
				room = RoomEntry.get(customer.getRoom_no());

				if (room.getRoom_type().equals(customer.getRoom_type())) {
					if (room.getStatus().equals("NOT_BOOKED")) {
						count++;
						CustomerEntry.put(count,
								new Customer(customer.getName(), customer.getMobile(), customer.getAddress(),
										customer.getEmail(), customer.getRoom_type(), customer.getRoom_no()));
						
						// customer = (Customer) m.getValue();
						c++;
						break;
					}
				}
			}
		}
		if (c == 0) {
			return 0;
		} else {
			room.setStatus("Booked");
		//	System.out.println(room.getStatus());
			return count;
		}

	}

	public Customer validateCustomer(int custid) {
		int c = 0;
		for (Map.Entry m : CustomerEntry.entrySet()) {
			if (m.getKey().equals(custid)) {
				System.out.println("exists");
				customer = (Customer) m.getValue();
				c++;
				break;
			}
		}
		if (c == 0) {
			return null;
		} else {
			return customer;
		}

	}
}
