package inher;


public class TicketTest{
	public static void main(String [] args)
	{
		DiscountTicket dc=new DiscountTicket(48,"D23","Declan Nerny",5);
                dc.setPrice(50);
                int res1=dc.readPrice();
                System.out.println("Price= "+res1);
                dc.setDiscount(10);
                int res2=dc.netPrice() ;
                System.out.println("Net Price= "+res2);


	}

	}