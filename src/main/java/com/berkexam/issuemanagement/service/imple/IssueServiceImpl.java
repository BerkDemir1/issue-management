package com.berkexam.issuemanagement.service.imple;

import com.berkexam.issuemanagement.dto.IssueDto;
import com.berkexam.issuemanagement.entity.Issue;
import com.berkexam.issuemanagement.repository.IssueRepository;
import com.berkexam.issuemanagement.service.IssueService;
import com.berkexam.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper){
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {

        if (issue.getDate()==null)
            throw new IllegalArgumentException("Issue Date cannot be null");

        Issue issueDb = modelMapper.map(issue,Issue.class);

        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
