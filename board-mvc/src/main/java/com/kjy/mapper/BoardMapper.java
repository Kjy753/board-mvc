package com.kjy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kjy.domain.BoardVO;
import com.kjy.domain.Criteria;

public interface BoardMapper {
	
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	//실제 모든 게시물의 수
	public int getTotalCount(Criteria cri);

}
