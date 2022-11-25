package com.kjy.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kjy.domain.BoardVO;

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
}

