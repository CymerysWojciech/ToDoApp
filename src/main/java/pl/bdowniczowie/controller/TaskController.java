package pl.bdowniczowie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bdowniczowie.model.TaskRepository;


@RepositoryRestController
public class TaskController {
    private Logger logger = (Logger) LoggerFactory.getLogger(TaskController.class);
    private final TaskRepository repository;

    TaskController(final TaskRepository repository) {
        this.repository = repository;
    }
    @GetMapping( path = "/task")
    ResponseEntity<?> readAllTask(){
        logger.warn("Exposing all the task!");
        return ResponseEntity.ok(repository.findAll());
    }
}
