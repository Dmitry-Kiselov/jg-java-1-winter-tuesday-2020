package l9;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void completeTask(String task) {
        tasks.remove(task);
    }

    public void printTasks() {
        System.out.println("Current tasks:");
        System.out.println(tasks);
    }

}
