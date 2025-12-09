public class Counter {

    static int count = 0;

    public Counter() {
        count++; 
        System.out.println("Object created. Total count = " + count);
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}
