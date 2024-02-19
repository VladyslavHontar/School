  import java.util.*;


  public class ArrayList2
  {

    static int max(ArrayList<Integer> list)
    	{
    	   
    	   return 0;
    	 }


    public static void main( String[] args )
     {
				    ArrayList<Integer> list = new ArrayList();
				    Collections.addAll(list , 3,4,9,5,3,2,3,1,3,8);
				    int res1=max(list);
				    System.out.println("Maximum number in list = "+res1);
    }
  }