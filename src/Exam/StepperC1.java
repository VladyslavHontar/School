package Exam;

class Stepper {
    private String name;
    protected int value;

    public Stepper(int v,String n) {
        value = v;
        name = n;
    }

    public void addValue(int v) {
        value=value+v;
    }
    public void subValue(int v) {
        value=value-v;
    }

    public int readValue() {
        return value;
    }
    public String readName() {
        return name;
    }
    public void printDetails() {
        System.out.println("Stepper Details");
        System.out.println("===============");
        System.out.println("Value: " + value);
        System.out.println("Name: " + name);
    }
}