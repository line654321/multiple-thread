package multiple;

public class TestThread extends Thread {
    @Override
    public void run() {
        DemoSynchronized.commonResource();
    }
}
