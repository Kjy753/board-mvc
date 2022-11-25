package com.kjy.service;

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
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testPrint() {
		
		log.info(service);
	}
	
	
	@Test
	public void testRegister() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("new content");
		board.setWriter("newbie");
		
		service.register(board);
		
		log.info("생성된 게시물의 번호 : " + board.getBno());
	}
	
	@Test
	public void testGet() {
		
		log.info(service.get(3L));
		
	}
	
	@Test
	public void testGetList() {
		
		service.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board = service.get(3L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("title 수정");
		log.info("수정된 결과 : " + service.modify(board));
	}
	
	@Test
	public void testDelete() {
		
		log.info("삭제된 결과 : " + service.remove(7L));
	}
}
