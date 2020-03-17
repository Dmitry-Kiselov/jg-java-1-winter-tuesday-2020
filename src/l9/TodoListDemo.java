package l9;

public class TodoListDemo {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();

        todoList.printTasks();

        todoList.addTask("Buy some milk");
        todoList.addTask("Buy some grechka");
        todoList.addTask("Do your Java homework");

        todoList.printTasks();

        todoList.completeTask("Buy some milk");
        todoList.completeTask("Buy some grechka");

        todoList.printTasks();

    }

}
