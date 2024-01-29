

class Counter{
    private int value;

    public Counter(int v){
        value=v;}

    public int getValue(){
        return value;}

    public  void   increment(){
        value++;  }

    public void setValue(int a) {
        this.value = a;
    }
     public boolean decrement() {
        if (this.value <= 0) {
            return false;
        }
        this.value--;
        return true;
     }
}