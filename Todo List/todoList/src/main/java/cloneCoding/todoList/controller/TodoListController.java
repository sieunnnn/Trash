package cloneCoding.todoList.controller;

import cloneCoding.todoList.domain.TodoDataBase;
import cloneCoding.todoList.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// Spring MVC : 브라우저와 서버가 통신을 하기 위한 기술
@Controller
@RequiredArgsConstructor
public class TodoListController {

    private final TodoRepository todoRepository;

    @GetMapping("/")
    // 받은 값을 넘겨줄때는 모델이라는 객체가 필요하다
    public String index(Model model) {
        List<TodoDataBase> todoDataBaseList = todoRepository.findAll();
        model.addAttribute("todo", todoDataBaseList);
        return "todo"; // todoo.html 을 리턴한다.
    }

    // post 형식이니까
    @PostMapping("/addTodo")
    public String addTodo(@RequestParam("todoList") String todo) {
        // database 에 저장한다.
        // entity 객체
        TodoDataBase todoData = new TodoDataBase();
        todoData.setTodo(todo); // 만든 인스턴스에 todoㅐ 에서 받은 값을 입력해준다.
        todoRepository.save(todoData); // toddrepository 에 저장
        return "redirect:/";
    }
}
