package ocp.material.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddData {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<?> result = service.submit(() -> 30 + 11);
      System.out.println(result.get());
    } finally {
      if (service != null) service.shutdown();
    }

    service.submit(
        () -> {
          Thread.sleep(1000);
          return null;
        });
    service.submit(
        () -> {
          // Thread.sleep(1000);
        });
  }
}
