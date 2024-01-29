import java.util.Scanner;


public class TestCounterQ3{

    public static void main(String args[]) {

        Counter c=new Counter(0);
        int choice=1;
        Scanner sc = new Scanner(System.in);
        while (choice !=0){
            System.out.println("\nMenu");
            System.out.println("=============");
            System.out.println("1: setValue");
            System.out.println("2: getValue");
            System.out.println("3: increment");
            System.out.println("4: decrement");
            System.out.println("0: Exit");
            System.out.print("Please enter a value-->");
            choice =sc.nextInt();
            if (choice==1){	 System.out.print("Please enter amount-->");
                int amt =sc.nextInt();
                c.setValue(amt);
            }

            if (choice==2){	 int res=c.getValue();
                System.out.println("Amount="+res);}

            if (choice==3){	 c.increment();
                int res=c.getValue();
                System.out.println("Amount="+res);}

            if (choice==4){
                boolean res= true;
                res = c.decrement();
                if (res==false)System.out.println("Already 0");
                else { int res1=c.getValue();
                    System.out.println("Amount="+res1);}

            }
        }
    }
}