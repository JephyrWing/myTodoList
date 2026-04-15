package repository;

import state.TodoState;
import vo.Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TodoRepositoryImpl implements TodoRepository{
    private final TodoState state;

    public TodoRepositoryImpl(TodoState state) {
        this.state = state;
    }

    @Override
    public void add(String date, Todo todo) {
        state.getTodoMap().put(date, new ArrayList<>());
        state.getTodoMap().get(date).add(todo);
    }

    @Override
    public List<Todo> findByDate(String date) {
        return List.of();
    }

    @Override
    public Map<String, List<Todo>> findAll() {
        return Map.of();
    }

    @Override
    public void update(String date, int index, Todo todo) {

    }

    @Override
    public void delete(String date, int index) {

    }

    @Override
    public void complete(String date, int index) {

    }
}
