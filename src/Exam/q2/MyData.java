package Exam.q2;

public class MyData extends Data {

    private String s;
    public MyData(String s, int v) {
        super(v);
        this.s = s;
    }
    public String readName() {
        return s;
    }
    public void set(int n) {
        super.value = n;
    }
    public void reset() {
        super.value = 0;
    }
}
