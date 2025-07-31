package com.example.issueTrackerOrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    
}
