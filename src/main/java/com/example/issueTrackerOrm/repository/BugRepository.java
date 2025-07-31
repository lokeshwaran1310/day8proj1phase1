package com.example.issueTrackerOrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.issueTrackerOrm.domain.Bug;

public interface BugRepository extends JpaRepository<Bug, Long>{
    
    
}
