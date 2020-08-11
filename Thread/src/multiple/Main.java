package multiple;

public class Main {
    public static void main(String[] args) {
        // Khai báo nhiều đối tượng của MyThread
//        TestThread thread1 = new TestThread();
//        thread1.setName("thread1");
//        TestThread thread2 = new TestThread();
//        thread2.setName("thread2");

        // Đều start() hết các đối tượng MyThread
        // để xem Thread nào sẽ được vào commonResource()
//        thread1.start();
//        thread2.start();

        String str2 = String.format("?activeId=%s&customer=%s&id=%s", 1236564,"Amar Singh",1236564); // String value
        System.out.println(str2);

    }
}
