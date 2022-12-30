package com.kjy.service;

import java.util.List;

import com.kjy.domain.BoardVO;
import com.kjy.domain.Criteria;

public interface BoardService {
	 
	/* 등록 작업 */
	public void register(BoardVO board);
	
	/* 조회 작업 */
	public BoardVO get(Long bno);
	
	/* 수정 작업 */
	public boolean modify(BoardVO board);
	
	/* 삭제 작업 */
	public boolean remove(Long bno);
	
	/* 목록 출력 작업 */
	//public List<BoardVO> getList();

	/* 페이징 목록 출력 작업 */
	public List<BoardVO> getList(Criteria cri);
	
	//전체 데이터 조회
	public int getTotal(Criteria cri);
}
