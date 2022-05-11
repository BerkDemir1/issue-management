package com.berkexam.issuemanagement.service;

import com.berkexam.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IssueHistoryService {
    IssueHistory save(IssueHistory issueHistory);

    Optional<IssueHistory> getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);
}
