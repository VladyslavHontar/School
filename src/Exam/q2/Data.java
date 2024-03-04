package Exam.q2;

public class Data {
	protected int value;
	
    public Data(int v) {
    	value=v;
    }

    public int readValue()
    {
    	return value;
    }

    public void increment()
    {
    	value++;
    }
    public void decrement()
    {
    	value--;
    }

}
