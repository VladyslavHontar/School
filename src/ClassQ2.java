class Pair {
    private int value1;
    private int value2;

    public Pair(int v1,int v2){
        this.value1=v1;
        this.value2=v2;
    }

    public void setValue1(int v){
        this.value1=v;
    }

    public void setValue2(int v){
        this.value2=v;
    }

    public int add(){
        int res=this.value1+this.value2;
        return res;
    }

    public int largest() {
        if (value1 > value2) {
            return value1;
        }
        return value2;
    }

    public  boolean  equal(){
        if (value1==value2){
            return true;
        }
        return false;
    }
}



//=======================================================

public class ClassQ2 {
    public static void main(String[] args){
        Pair   p = new  Pair(2,4);
        p.setValue1(4);
        int result1 = p.add();
        System.out.println("Sum = "+result1);
        boolean result2 = p.equal();
        System.out.println("Equal = "+result2);

        int result4= p.largest();
        System.out.println("Largest = "+result4);

        p.setValue2(6);
        result4= p.largest();
        System.out.println("Largest = "+result4);
    }
}

