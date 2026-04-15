package repository;

import vo.Todo;

import java.util.List;
import java.util.Map;

public class TodoRepositoryImpl implements TodoRepository{
    @Override
    public void add(String date, Todo todo) {

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
