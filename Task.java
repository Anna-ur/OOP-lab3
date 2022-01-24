public class Task implements Information {
    private int taskID;
    private int price;
    private Worker worker;
    public Task(int taskID, int price, Worker worker){
        this.taskID =taskID;
        this.price =price;
        this.worker =worker;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getPrice() {
        return price;
    }

    public int getTaskID() {
        return taskID;
    }
    public String getInfo(){
        return ("Задание №" + taskID + " цена: " + price + ", работник: " + worker.getID());
    }
}
