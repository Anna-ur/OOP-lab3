import java.util.ArrayList;
import java.util.List;

public class Input {
    public List<Task> input(){
        int workerID = 0, taskID = 1;
        List<Task> tasksList = new ArrayList<>();
        Worker worker0 = new Loader(0);
        Worker worker1 = new Loader(1);
        Worker worker2 = new Loader(2);
        Worker worker3 = new Loader(3);
        Task task1 = new Task(1, 4500, worker0);
        tasksList.add(task1);
        Task task2 = new Task(2, 17400, worker3);
        tasksList.add(task2);
        Task task3 = new Task(3, 1380, worker1);
        tasksList.add(task3);
        Task task4 = new Task(4, 1600, worker2);
        tasksList.add(task4);
        Task task5 = new Task(5, 2500, worker2);
        tasksList.add(task5);
        Task task6 = new Task(6, 13300, worker0);
        tasksList.add(task6);
        return tasksList;
    }
}
