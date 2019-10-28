package gostack.desafio01.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import gostack.desafio01.domain.Project;

/**
 * ProjectRepository
 */
@Component
public class ProjectRepository {

    private static List<Project> projects = new ArrayList<>();

    private Project findProject(Integer id) {
        Project projectFound = projects.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        return projectFound;
    }

    public List<Project> show() {
        return projects;
    }

    public Project store(Project project) {
        projects.add(project);
        return project;
    }

    public Project update(Project project, Integer id) {
        Project projectFound = this.findProject(id);
        projectFound.setTitle(project.getTitle());
        return projectFound;
    }

    public void delete(Integer id) {
        projects.removeIf(p -> p.getId() == id);
    }

    public Project storeTask(String title, Integer id) {
        Project projectFound = this.findProject(id);
        projectFound.setTasks(title);
        return projectFound;
    }
}