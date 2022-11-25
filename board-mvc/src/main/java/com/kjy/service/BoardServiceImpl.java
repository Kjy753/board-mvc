package com.kjy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kjy.domain.BoardVO;
import com.kjy.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
@ToString
public class BoardServiceImpl implements BoardService{

	private final BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		
		log.info("----등록 작업----" + board);
		mapper.insertSelectKey(board);
		
	}

	@Override
	public BoardVO get(Long bno) {
		
		log.info("----조회 작업----" + bno);
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		
		return false;
	}

	@Override
	public boolean remove(Long bno) {
		
		return false;
	}

	@Override
	public List<BoardVO> getList() {
		
		log.info("----목록 작업----");
		return mapper.getList();
	}
	
	
}
