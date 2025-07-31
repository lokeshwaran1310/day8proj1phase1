package com.example.issueTrackerOrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    
}
