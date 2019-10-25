package gostack.desafio01.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gostack.desafio01.domain.Project;

/**
 * ProjectResource
 */
@RestController
@RequestMapping("/projects")
public class ProjectResource {

    @GetMapping()
    public List<Project> show() {
        Project p1 = new Project(1, "Projeto01");
        Project p2 = new Project(1, "Projeto02");
        List<Project> projects = new ArrayList<>();
        projects.add(p1);
        projects.add(p2);
        return projects;
    }

}