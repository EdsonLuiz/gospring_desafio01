package gostack.desafio01.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gostack.desafio01.domain.Project;

/**
 * ProjectResource
 */
@RestController
@RequestMapping("/projects")
public class ProjectResource {
    private List<Project> tempProjectStore = new ArrayList<>();

    @GetMapping()
    public List<Project> show() {

        return tempProjectStore;
    }

    @PostMapping()
    public Project store(@RequestBody Project project) {
        tempProjectStore.add(project);
        return project;
    }

}