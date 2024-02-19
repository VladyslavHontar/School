package inher;

class Ticket{

       protected int price;
       private String seat;
       private String event;
       

       public Ticket(int p,String s,String e){ this.price=p;
                                              seat=s;
                                              event=e;}
       public  int    readPrice()
                           { return price;
                          } 
       public  void setPrice(int p)
                         {
            			price=p;
                         }
}

//=======================================================

class DiscountTicket  extends Ticket{

     private int discount;


    public DiscountTicket(int p, String s, String e, int d) {
        super(p, s, e);
        discount=d;
    }

    public void setDiscount(int d){
        discount=d;
    }
    public int netPrice(){
        int net=price-discount;
        return net;
    }
}