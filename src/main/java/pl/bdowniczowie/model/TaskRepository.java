package pl.bdowniczowie.model;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
interface TaskRepository extends JpaRepository<Task, Integer> {

}
