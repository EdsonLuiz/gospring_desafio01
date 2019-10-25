package gostack.desafio01.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Project
 */

public class Project {
    private Integer id;
    private String title;
    List<String> tasks = new ArrayList<>();

    public Project() {
    }

    public Project(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

}