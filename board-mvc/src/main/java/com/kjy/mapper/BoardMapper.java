package com.kjy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kjy.domain.BoardVO;

public interface BoardMapper {
	
	
	public List<BoardVO> getList();
	
	

}
