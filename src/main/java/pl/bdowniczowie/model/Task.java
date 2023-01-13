package pl.bdowniczowie.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_task")
    private Integer idTask;

    @Column(name = "description")
    @NotBlank(message = "Opis musi być")
    private String description;

    @Column(name = "done")
    @NotNull(message = "Czy wykonane musi być")
    private boolean done;


    public Task() {
    }

    public Task(String description, boolean done) {
        this.description = description;
        this.done = done;
    }

    public Integer getIdTask() {
        return idTask;
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    @Override
    public String toString() {
        return "Task{" +
                "idTask=" + idTask +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
