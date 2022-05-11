package com.berkexam.issuemanagement.service;

import com.berkexam.issuemanagement.dto.IssueDto;
import com.berkexam.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);

}
