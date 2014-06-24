package net.therap.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/24/14
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "supervisor")
public class Supervisor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "designation")
    private String designation;

    @ManyToMany (targetEntity = Project.class, fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable (name = "supervisor_project",
            joinColumns = @JoinColumn (name = "supervisor_id"),
            inverseJoinColumns = @JoinColumn (name = "project_id"))
    private List<Project> projectList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {

        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "id=" + id +
                '}';
    }
}