package ArrayList;

import java.util.*;


  public class ArrayList3
  {

    static int countEven(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public static void main( String[] args )
     {
				    ArrayList<Integer> list = new ArrayList();
				    Collections.addAll(list , 3,4,9,5,3,2,3,1,3,8);
				    int res1=countEven(list);
				    System.out.println("Even numbers in the list = "+res1);
    }
  }