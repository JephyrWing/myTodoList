import repository.TodoRepository;
import repository.TodoRepositoryImpl;
import service.TodoService;
import service.TodoServiceImpl;
import state.TodoState;
import view.TodoView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoState state = new TodoState();
        TodoRepository todoRepository = new TodoRepositoryImpl(state);
        TodoService todoService = new TodoServiceImpl(todoRepository);
        TodoView todoView = new TodoView(sc, todoService);

        todoView.start();
    }
}
