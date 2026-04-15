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
        if (state.getTodoMap().get(date) == null){
            state.getTodoMap().put(date, new ArrayList<>());
        }
        state.getTodoMap().get(date).add(todo);
    }

    @Override
    public List<Todo> findByDate(String date) {
        List<Todo> result = new ArrayList<>();
        for (String s : state.getTodoMap().keySet()){
            if (s.equals(date)) {
                result = state.getTodoMap().get(s);
            }
        }
        return result;
    }

    @Override
    public Map<String, List<Todo>> findAll() {
        return state.getTodoMap();
    }

    @Override
    public void update(String date, int index, Todo todo) {
        state.getTodoMap().get(date).set(index, todo);
    }

    @Override
    public void delete(String date, int index) {
        state.getTodoMap().get(date).remove(index);
    }

    @Override
    public void complete(String date, int index) {
        state.getTodoMap().get(date).get(index).isCompleted();
    }
}
