package com.example.issueTrackerOrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.issueTrackerOrm.domain.Bug;
import com.example.issueTrackerOrm.service.BugService;

@RestController
@RequestMapping("/api/bugs")
public class BugController {
     @Autowired
     private BugService bugService;

     @GetMapping
     public List<Bug> getAllBugs(){
        return bugService.getAllBugs();
     }
     @GetMapping("/status/{status}")
     public List<Bug> findByStatus(@PathVariable String status){
        return bugService.findByStatus(status);
    }
    @GetMapping("/project/{project_id}")
    public List<Bug> findByProjectId(@PathVariable long project_id) {
        return bugService.findByProjectId(project_id);
    }
    @GetMapping("/assigned-to/{userid}")
    public List<Bug> findByAssignedToId(@PathVariable int userid) {
        return bugService.findByAssignedToId(userid);
    }
    @GetMapping("/unresolved/user/{userid}")
    public List<Bug> findUnresolvedBugsByUserId(@PathVariable Long userid) {
        return bugService.findUnresolvedBugsByUserId(userid);
    }
    @GetMapping("/count/project/{projectId}")
    public Long countBugsByProjectId(@PathVariable Long projectId) {
        return bugService.countBugsByProjectId(projectId);
    }
     

    
}
