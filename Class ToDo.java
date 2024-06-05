import java.util.Scanner;

public class Main {

    public static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        createTask();
        showToDoList();
    }

    public static void createTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the name of the task");
        var name = scanner.nextLine();

        System.out.println("Please input the description of the task");
        var description = scanner.nextLine();

        var task = new Task(name, description);
        taskManager.addTask(task);

        scanner.close();
    }

    public static void showToDoList() {
        var tasks = taskManager.getTasks();
        for (var task : tasks) {
            System.out.println(task.name);
            System.out.println(task.description);
            System.out.println(task.isDone);
        }
    }
}

public class Task{
  public String name;
  public String description;
  public boolean isDone;

  public Task(String name, String description){
    this.name = name;
    this.description = description;
  }
}

import java.util.ArrayList;

public class TaskManager{
  private ArrayList<Task> tasks = new ArrayList<Task>();
  
  public void addTask(Task task){
    tasks.add(task);
  }

  public ArrayList<Task> getTasks(){
    return tasks;
  }
  
}
