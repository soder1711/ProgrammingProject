import java.util.LinkedList;
import java.util.Scanner;
public class OrientationTask1_4 {
    public static int idCounter = 1;
    public int id;
    public long startTime;
    public long endTime;

    public OrientationTask1_4() {
        this.id = idCounter++;
        startTime = System.currentTimeMillis();

    }
    public int getId() {
        return id;
    }
    public long getStartTime() {
        return startTime;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long calculateTime() {
        return (this.endTime - this.startTime) / 1000;
    }

    public static void main(String[] args) {
        OrientationTask1_4 customer1 = new OrientationTask1_4();
        OrientationTask1_4 customer2 = new OrientationTask1_4();

        LinkedList<OrientationTask1_4> Customers = new LinkedList<>();
        Customers.add(customer1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to queue a customer, dequeue them or quit? ");
            String prompt = scanner.nextLine();
            if (prompt.equals("queue")) {
                System.out.println("Name the customer");
                String customer = scanner.nextLine();
                if (customer.equals("customer1")) {
                    Customers.addFirst(customer1);
                }
                else if (customer.equals("customer2")) {
                    Customers.addFirst(customer2);
                }
            }
            else if (prompt.equals("dequeue")) {
                if (!Customers.isEmpty()) {
                    OrientationTask1_4 customer = Customers.getLast();
                    customer.setEndTime(System.currentTimeMillis());
                    System.out.println(customer.getId() + " " + customer.calculateTime() + "seconds");
                    Customers.removeLast();
                }
            }
            else if (prompt.equals("quit")) {
                break;
            }
        }
    }
}

