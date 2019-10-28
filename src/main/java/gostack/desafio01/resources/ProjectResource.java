package gostack.desafio01.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gostack.desafio01.domain.Project;
import gostack.desafio01.repository.ProjectRepository;

/**
 * ProjectResource
 */
@RestController
// @RequestMapping("/projects")
public class ProjectResource {
    private List<Project> tempProjectStore = new ArrayList<>();

    @Autowired
    private ProjectRepository projectRepo;

    @GetMapping("/projects")
    public List<Project> show() {
        return projectRepo.show();
    }

    @PostMapping("/projects")
    public Project store(@RequestBody Project project) {
        return projectRepo.store(project);
    }

    @PutMapping("/projects/{id}")
    public Project update(@RequestBody Project project, @PathVariable Integer id) {
        return projectRepo.update(project, id);
    }

    @DeleteMapping("/projects/{id}")
    public void delete(@PathVariable Integer id) {
        projectRepo.delete(id);
    }

    @PostMapping("/projects/{id}/tasks")
    public Project storeTask(@RequestBody Map<String, String> body, @PathVariable Integer id) {
        // how to get key, value from body whitout object mapping
        // https://medium.com/better-programming/building-a-spring-boot-rest-api-part-ii-7ff1e4384b0b
        // projectFound.setTasks(body.get("title"));
        return projectRepo.storeTask(body.get("title"), id);
    }

}