package com.example.issueTrackerOrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.issueTrackerOrm.domain.Bug;
import com.example.issueTrackerOrm.repository.BugRepository;

@Service
public class BugService {

    @Autowired
    private BugRepository bugRepository;

    public List<Bug> getAllBugs(){
        return bugRepository.findAll();
    }

    public List<Bug> findByStatus(String status){
        return bugRepository.findByStatus(status);
    }

    // public List<Bug> findByPriorityOrder(String priority){
    //     return bugRepository.findByPriorityOrder(priority);
    // }
    public List<Bug> findByProjectId(long  project_id){
        return bugRepository.findByProjectId(project_id);
    }
    public List<Bug> findByAssignedToId(int userid){
        return bugRepository.findByAssignedToId(userid);
    }

    //  public List<Bug> findByPriorityOrderByCreatedDateDesc(String priority){
    //     return bugRepository.findByPriorityOrderByCreatedDateDesc(priority);
    //  }
     public List<Bug> findUnresolvedBugsByUserId(@Param("userid") Long userid){
        return bugRepository.findUnresolvedBugsByUserId(userid);
     }
     public Long countBugsByProjectId(Long projectId){
        return bugRepository.countBugsByProjectId(projectId);
     }
    
}
