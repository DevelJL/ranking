package com.duo.ranking.paging.service;

import java.util.List;

import com.duo.ranking.common.Pagination;
import com.duo.ranking.paging.domain.PagingVO;
import com.duo.ranking.paging.mapper.PagingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagingService {
    
    @Autowired
    private PagingMapper mapper;

    public List<PagingVO> pagingGo(Pagination page) {
        return mapper.selectPaging(page);
    }
	public int totlaPaging(){
        return mapper.totalPaging();
    }
}
