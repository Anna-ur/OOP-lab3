import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        List<Task> inputList = input.input();
        Work work = new Work();
        work.doWork(inputList);
        List<Worker> staffList = new ArrayList<>();
        inputList.forEach(new Consumer<Task>() {
            @Override
            public void accept(Task task) {
                staffList.add(task.getWorker());
            }
        });
        Worker brig1 = new Brigadier("Наталья");
        Worker brig2 = new Brigadier("Евстигней");
        Worker brig3 = new Brigadier("R2D2");
        staffList.add(brig1);
        staffList.add(brig2);
        staffList.add(brig3);
        ArrayList<Information> infoList = new ArrayList<>();
        infoList.addAll(staffList);
        infoList.addAll(inputList);
        infoList.forEach(new Consumer<Information>() {
            @Override
            public void accept(Information information) {
               System.out.println(information.getInfo());
            }
        });
        try {
            DataProcessor<Task> dataProcessor = new DataProcessor<>(500, 10000, 2);
            dataProcessor.searching(inputList);
            dataProcessor.finding(1337, inputList);
        } catch (OwnException e){
            System.out.println(e.getMessage());
        }
    }

}
