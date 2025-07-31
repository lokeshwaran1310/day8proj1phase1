package com.example.issueTrackerOrm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bugs")
public class Bug {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bugid;
    private String title;
    private String description;
    private String status;
   
    @ManyToOne
    @JoinColumn(name="project_ID")
    private Project project;
     @ManyToOne
    @JoinColumn(name="assigned_to")
    private User assignedTo;


    public long getBugid() {
        return bugid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setBugid(long bugid) {
        this.bugid = bugid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Project getProject() {
        return project;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }
    

    
}
