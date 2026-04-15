package state;

import vo.Todo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoState {
    private Map<String, List<Todo>> todoMap = new HashMap<>();

    //Getter
    public Map<String, List<Todo>> getTodoMap() {
        return todoMap;
    }
}
