package Resturaunt;

import java.util.Scanner;

public class ResturantApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		hotelNmae h=new hotelNmae();
		h.hotelName();
		DetailsOfCustomer d= new DetailsOfCustomer();
		  d.details();
		int choice1;
		 System.out.println("enter your choice");
		 System.out.println();
		   System.out.println("1.MENU DETAILS\n2.ORDER FOOD\n3.ORDER DETAILS\n4.BILL");
		   choice1=sc.nextInt();
		   switch (choice1) {
		   case 1:
			   d.menuDetails();
		   case 2:
			   d.addDetails();
			   try {Thread.sleep(1000);}catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
			   d.foodPrepare();
			   try {Thread.sleep(2700);}catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
                d.foodReady();
 			   try {Thread.sleep(3500);}catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
		   case 3:
			   d.showOrderDetails();
		   case 4:
			   d.bill();
			 default:
				 break;
		   }
			
	}

}
