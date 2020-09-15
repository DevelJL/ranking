package com.duo.ranking.paging.mapper;

import java.util.List;

import com.duo.ranking.common.Pagination;
import com.duo.ranking.paging.domain.PagingVO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PagingMapper {
    List<PagingVO> selectPaging(Pagination page);
    int totalPaging();
}