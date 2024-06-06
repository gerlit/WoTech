import java.util.Scanner;

public class Main {

    public static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 to create a task");
            System.out.println("Press 2 to show the todo list");
            System.out.println("Press 3 to set a task as done");
            var userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                createTask();
            } else if (userInput.equals("2")) {
                showTodoList();
            } else if (userInput.equals("3")) {
                showTodoList();
                System.out.println("Enter the finished task name:");
                var taskName = scanner.nextLine();
                taskManager.setTaskAsDone(taskName);
            } else {
                scanner.close();
                break;
            }
        }

    }

    public static void createTask(){
        Scanner scanner = new Scanner(System.in);
        // Input the task name
        System.out.println("Please input the name of the task");
        var name = scanner.nextLine();
        // Input the task description
        System.out.println("Please input the description of the task");
        var description = scanner.nextLine();

        var task = new Task(name, description);
        taskManager.addTask(task);
    }

    public static void showTodoList(){
        var tasks = taskManager.getTasks();
        for(var task : tasks){
            System.out.println("This is a TASK");
            System.out.println(task.name);
            System.out.println(task.description);
            System.out.println(task.isDone);
        }
    }
}

import java.util.ArrayList;

public class TaskManager {
  private ArrayList<Task> tasks = new ArrayList<Task>();

  public void addTask(Task task) {
    tasks.add(task);
  }

  public ArrayList<Task> getTasks() {
    return tasks;
  }

  public void setTaskAsDone(String taskName){
    tasks.stream()
      .filter(x -> x.name.equals(taskName))
      .findFirst()
      .ifPresent(x -> x.isDone = true);
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
