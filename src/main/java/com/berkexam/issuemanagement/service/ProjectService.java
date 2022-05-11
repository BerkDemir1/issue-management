package com.berkexam.issuemanagement.service;

import com.berkexam.issuemanagement.entity.Project;
import com.berkexam.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCoje);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable (Pageable pageable);

    Boolean delete(Project project);



}
