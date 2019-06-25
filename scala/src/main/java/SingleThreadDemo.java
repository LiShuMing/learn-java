import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author shuming.lsm
 * @version 2018/07/04
 */
public class SingleThreadDemo {
    public static void main(String[] args) {}

    String threadName = "thread1";
    ThreadFactory threadFactory = new ThreadFactoryBuilder().setDaemon(true).setNameFormat(threadName).build();
    ThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1, threadFactory);

    public ThreadPoolExecutor getExecutor() {
        return executor;
    }

    // By default, a cancelled task is not automatically removed from the work queue until its delay
  // elapses. We have to enable it manually.

  private static final ExecutorService EXECUTOR =
      Executors.newSingleThreadExecutor(new ThreadFactoryBuilder()
          .setDaemon(true).build());
}
