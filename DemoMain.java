import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zyf
 * @date 2020-03-14 15:03
 * @describe : 这个类是平时方便跟源码的main方法
 */
public class DemoMain {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
