package cloneCoding.todoList.repository;

import cloneCoding.todoList.domain.TodoDataBase;
import org.springframework.data.jpa.repository.JpaRepository;

// entity 를 이용하여 입력, 수정, 삭제를 도와주는 interface 이다.
public interface TodoRepository extends JpaRepository<TodoDataBase, Long> {

}
