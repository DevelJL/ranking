package com.duo.ranking.uni.service;

import java.util.List;

import com.duo.ranking.uni.domain.UniVO;
import com.duo.ranking.uni.mapper.UniMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniService {
	
	@Autowired
	private UniMapper mapper;

	public List<UniVO> selectUni(){
		return mapper.selectUni();
	}
}
