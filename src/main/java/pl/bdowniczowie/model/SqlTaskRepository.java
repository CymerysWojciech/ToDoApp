package pl.bdowniczowie.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
 interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> {
}
