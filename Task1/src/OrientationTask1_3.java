public class OrientationTask1_3 {
    public static int idCounter = 1;
    public int id;
    public long startTime;
    public long endTime;

    public OrientationTask1_3() {
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
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        OrientationTask1_3 customer1 = new OrientationTask1_3();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        customer1.setEndTime(System.currentTimeMillis());


        OrientationTask1_3 customer2 = new OrientationTask1_3();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        customer2.setEndTime(System.currentTimeMillis());
        System.out.println(customer1.getId() + " " + customer1.calculateTime());
        System.out.println(customer2.getId() + " " + customer2.calculateTime());
    }
}

