package com.berkexam.issuemanagement.dto;

import com.berkexam.issuemanagement.entity.IssueStatus;
import com.berkexam.issuemanagement.entity.Project;
import com.berkexam.issuemanagement.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto asignee;
    private ProjectDto project;


}
