package com.kjy.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kjy.domain.BoardVO;
import com.kjy.domain.Criteria;
import com.kjy.domain.PageDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		
		log.info("--------------------");
		boardMapper.getList();
	}
	
	@Test
	public void testInster() {
		
		BoardVO board = new BoardVO();
		board.setTitle("test 테스트");
		board.setContent("Content 테스트");
		board.setWriter("tester");
		
		boardMapper.insert(board);
		log.info("=========================");
		log.info("after insert " + board.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("select 테스트");
		board.setContent("select 테스트");
		board.setWriter("tester");
		
		boardMapper.insertSelectKey(board);
		log.info("=========================");
		log.info("after insert selectKey" + board.getBno()); 
	}
	
	@Test
	public void testRead() {
		
		BoardVO board = boardMapper.read(5L);
		
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		
		int count = boardMapper.delete(1L);
		
		log.info("count : " + count);
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(2L);
		board.setTitle("update title");
		board.setContent("update content");
		board.setWriter("testert");
		
		log.info("count: " + boardMapper.update(board));
	}
	
	@Test
	public void testPaging() {
		
		Criteria cri = new Criteria();
		
		List<BoardVO> list = boardMapper.getListWithPaging(cri);
		
		list.forEach( b -> log.info(b));
	}
	
	@Test
	public void testPageDTO() {
		
		Criteria cri = new Criteria();
		cri.setPageNum(21);
		PageDTO pageDTO = new PageDTO(cri, 250);
		
		log.info(pageDTO);
		
	}
}

