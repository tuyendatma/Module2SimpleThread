public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1 =new NumberGenerator();
        Thread t1 = new Thread(numberGenerator);
        Thread t2 = new Thread(numberGenerator1);
        t1.start();
        t2.start();
    }
}
