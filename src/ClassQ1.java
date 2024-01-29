import java.util.Scanner;

class Stepper{
    private int value;

    public Stepper(int v){
        this.value=v;
    }

    public void stepUp(){
        this.value++;
    }

    public void stepDown(){
        this.value--;
    }

    public void resetZero(){
        this.value = 0;
    }

    public void resetValue(int v){
        this.value = v;
    }

    public int   readValue(){
        return value;
    }
}


//=======================================================


public class ClassQ1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stepper s1 = new Stepper(4);
        Stepper s2 = new Stepper(2);

        s1.stepUp();
        s1.stepUp();
        int result = s1.readValue();
        System.out.println("Init Value="+result);

        s1.resetZero();
        System.out.println("Reset Zero Result="+s1.readValue());

        System.out.print("\nEnter New Vaule: ");
        int newValue = in.nextInt();
        s1.resetValue(newValue);
        System.out.println("Reset Value Result="+s1.readValue());


    }
}
