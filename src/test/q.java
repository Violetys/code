package test;

public class q {
	public static void main(String[] args) throws InterruptedException {
    synchronizedTest test = new synchronizedTest();
    Thread t1 = new Thread(test);
    Thread t2 = new Thread(test);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    test.show();
}
}
