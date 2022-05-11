package com.berkexam.issuemanagement.repository;

import com.berkexam.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long> {

}
