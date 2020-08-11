package multiple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainBigTask {
    public static void main(String[] args) {
        /*Tạo ra ThreadPoolExecutor để xử lý 1000 request tới dồn dập.*/

        // Khai báo một Thread Pool thông qua newFixedThreadPool(1) của Executors.
        // Thread Pool này cho phép thực thi cùng một lúc 1 Thread
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Khai báo 100 requestHandler, và "quăng" chúng vào Thread Pool vừa khai báo
        long start = System.nanoTime();
        for (int i = 1; i <= 10; i++) {
            executorService.execute(new RequestHandler("RequestHandler " + i));
        }
        // Phương thức này để đóng thread pool sau khi chạy xong
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long time = System.nanoTime() - start;
        System.out.printf("Tasks took %.3f ms to run%n", time/1e6);
    }
}
