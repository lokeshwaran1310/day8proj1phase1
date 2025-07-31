package com.example.issueTrackerOrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.issueTrackerOrm.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
    
}
