package service;

import vo.Todo;

import java.util.List;
import java.util.Map;

public class TodoServiceImpl implements TodoService{
    @Override
    public void addTodo(String date, String time, String task) {

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

    }

    @Override
    public void deleteTodo(String date, int index) {

    }

    @Override
    public void completeTodo(String date, int index) {

    }
}
