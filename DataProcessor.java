import java.util.List;
import java.util.stream.Collectors;

public class DataProcessor<T extends Task> {
    private int max, min, lenght;
    public DataProcessor(int min, int max, int lenght) throws OwnException{
        if (min < 500 || max > 10000 || lenght != 2){
            throw new OwnException("exception here!");
        }
        this.max = max;
        this.min = min;
        this.lenght = lenght;
    }
    public List<T> searching(List<T> taskList){
        return taskList.stream().
            filter(i -> (i.getPrice() >= 500 && i.getPrice() <= 10000)).
                limit(lenght).collect(Collectors.toList());
    }
    public List<T> finding(int price, List<T> taskList){
        return taskList.stream().filter(i -> i.getPrice() == price).collect(Collectors.toList());
    }
}
