package create;

public class Main {

    public static void main(String[] args) {
        /* Tạo thread bằng cách Kế Thừa Từ Lớp Thread*/
        CountDownThread2 countDownThread2 = new CountDownThread2();
        Thread thread1 = new Thread(countDownThread2);
        Thread thread2 = new Thread(countDownThread2);

        thread1.setPriority(1);
        thread2.setPriority(5);

        thread1.setName("thread-duongnm");
        thread2.setName("thread-duongnm2");

        thread1.start();

        thread2.start();

        /* Tạo Anonymous Thread */
//
//        Thread countDownThread3 = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("Bắt đầu run thread " + Thread.currentThread().getName());
//                int count = 10;
//                for (int i = count; i > 0; i--) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println("Hết giờ");
//            }
//        };
//        countDownThread3.setName("Thread3");
//        countDownThread3.start();

//        new Thread() {
//            @Override
//            public void run() {
//                System.out.println("Bắt đầu run thread " + Thread.currentThread().getName());
//                int count = 10;
//                for (int i = count; i > 0; i--) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println("Hết giờ");
//            }
//        }.start();

    }
}
