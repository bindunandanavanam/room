package com.cg.room;

import java.util.Scanner;
import com.cg.room.exception.*;

import com.cg.room.beans.Customer;
import com.cg.room.beans.Room;
import com.cg.room.service.CustomerServiceImpl;
import com.cg.room.service.ICustomerService;

public class App 
{
    public static void main( String[] args )
    {
       Customer customer=new Customer();
       ICustomerService customerService=new CustomerServiceImpl();
       Room room=new Room();
       int res=0;
       Scanner sc=new Scanner(System.in);
       do {
       System.out.println("1.Booking Room \n 2.View Booking Status \n 3.Exit ");
       int ch=sc.nextInt();
      
    	 switch(ch) {
    	  case 1:
       System.out.println("enter customer name");
       customer.setName(sc.next());
       System.out.println("enter email");
       customer.setEmail(sc.next());
       System.out.println("enter address");
       customer.setAddress(sc.next());
       System.out.println("enter mobile  number");
       customer.setMobile(sc.next());
       System.out.println("enter room type");
       customer.setRoom_type(sc.next());
       System.out.println("enter room no");
       customer.setRoom_no(sc.nextInt());
       
         res=customerService.getCustomerDetails(customer);
         System.out.println("Your Cust Id is "+res);
       
    
       break;
    	  case 2:
    		  if(res!=0) {
    			  System.out.println("Enter cust ID");
    			  int custid=sc.nextInt();
    		customer= customerService.validateCustomer(custid);
    			  if(customer!=null) {
    		  System.out.println("Name "+customer.getName());
    		  System.out.println("Room No "+customer.getRoom_no());
    		  System.out.println("Room Type "+customer.getRoom_type());
    		  System.out.println("Status "+"BOOKED");
    			  }
    			  else {
    				 try {
						throw new InValidCustIDException();
					} catch (InValidCustIDException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			  }
    		  }
    		  else {
    			 try {
					throw new RoomNotAvailableException();
				} catch (RoomNotAvailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		  }
    		  break;
    	  case 3:
    		  System.exit(0);
    		  break;
    	 }
       }while(true);

    }
    
}
