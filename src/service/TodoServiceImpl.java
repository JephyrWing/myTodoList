package service;

import repository.TodoRepository;
import vo.Todo;

import java.util.List;
import java.util.Map;

public class TodoServiceImpl implements TodoService{
    private final TodoRepository repository;

    public TodoServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addTodo(String date, String time, String task) {
        Todo temptodo = new Todo(time, task, false);
        repository.add(date, temptodo);
    }

    @Override
    public List<Todo> getTodosByDate(String date) {
        return List.of();
    }

    @Override
    public Map<String, List<Todo>> getAllTodos() {
        return Map.of();
    }

    @Override
    public void updateTodo(String date, int index, String time, String task) {
        Todo temptodo = new Todo(time, task, false);
        repository.update(date, index, temptodo);
    }

    @Override
    public void deleteTodo(String date, int index) {

    }

    @Override
    public void completeTodo(String date, int index) {

    }
}
