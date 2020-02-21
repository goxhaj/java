package ocp.material.generics;

import java.util.PriorityQueue;
import java.util.Queue;

class Request {}

class RequestCollector {
  Queue container = new PriorityQueue();

  public synchronized void addRequest(Request r) {
    container.add(r);
  }

  public synchronized Request getRequestToProcess() {
    return container.poll();
  }
}
