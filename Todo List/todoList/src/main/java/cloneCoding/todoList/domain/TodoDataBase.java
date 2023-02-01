package cloneCoding.todoList.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "TodoDB") //device info entity
@Table(name = "todoList") //device info
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TodoDataBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String todo;
}
