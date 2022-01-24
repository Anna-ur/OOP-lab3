import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Work {
    private List workerList = new ArrayList();
    public void doWork(List taskInfo) {
        taskInfo.forEach(new Consumer<Task>() {
            @Override
            public void accept(Task t) {
                t.getWorker().doJob(t.getPrice());
                if(!workerList.contains(t.getWorker())) workerList.add(t.getWorker());
                System.out.println("Задание "+t.getTaskID()+": оплата: "+ t.getPrice()
                        +", выполнивший работник: "+t.getWorker().getID());
            }
        });
        workerList.sort(Comparator.comparing(Worker::getID));
        workerList.forEach(new Consumer<Worker>() {
            @Override
            public void accept(Worker w) {
                System.out.println("Работник "+w.getID()+": "+w.getEarnedMoney());
            }
        });
        workerList.sort(Comparator.comparing(Worker::getEarnedMoney));
        Worker worker = (Worker) workerList.get(workerList.size()-1);
        System.out.println("Самый высокооплачиваемый: "+worker.getID());
        worker = (Worker) workerList.get(0);
        System.out.println("Самый низкооплачиваемый: "+ worker.getID());
    }
}
