import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_5 {
    LinkedList<OrientationTask1_4> queue = new LinkedList<>();

    public void addToQueue(OrientationTask1_4 customer) {
        queue.addLast(customer);
    }

    public OrientationTask1_4 removeFromQueue() {
        if (!queue.isEmpty()) {
            OrientationTask1_4 customer = queue.removeFirst();
            return customer;
        }
        return null;
    }

    public void serve() {
        long avgServiceTime = 0;
        while (!queue.isEmpty()) {
            long serviceTime = (long) ((Math.random() * 10000) + 1000);
            OrientationTask1_4 customer = removeFromQueue();
            long startService = System.currentTimeMillis();
            customer.setEndTime(startService);
            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long endService = System.currentTimeMillis();
            customer.setEndTime(endService);

            long waitTime = startService - customer.getStartTime();
            System.out.println("customer " + customer.getId() + " service time: " + serviceTime / 1000 + " seconds");
            System.out.println("customer " + customer.getId() + " waiting time: " + waitTime / 1000 + " seconds");
        }
    }

    public void customerGenerator(int i) {
        for (i = 0; i < 6; i++) {
            OrientationTask1_4 customer = new OrientationTask1_4();
            addToQueue(customer);
        }
    }

    public static void main(String[] args) {
        OrientationTask1_5 idk = new OrientationTask1_5();
        idk.customerGenerator(6);
        idk.serve();
    }
}


