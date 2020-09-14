package com.duo.ranking.uni.mapper;

import java.util.List;

import com.duo.ranking.uni.domain.UniVO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UniMapper {
    
    List<UniVO> selectUni();
}