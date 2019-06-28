package com.yr.util;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;


import org.junit.Test;

import com.yr.board.BoardDTO;
import com.yr.board.notice.NoticeDAOImpl;
import com.yr.board.notice.NoticeDTO;
import com.yr.board.qna.QnaDAOImpl;
import com.yr.board.qna.QnaDTO;
import com.yr.s6.AbstractTest;

public class MapperTest extends AbstractTest{
	
	@Inject
	private NoticeDAOImpl noticeDAO;

	//@Test
	public void setDelete() throws Exception{
		int result = noticeDAO.setDelete(5);
		assertEquals(1, result);
	}
	
	@Test
	public void selectList() throws Exception {
		
		List<BoardDTO> ar  = noticeDAO.getList();
		assertEquals(10, ar.size());
	}
	//@Test
	public void Test() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("update");
		boardDTO.setWriter("update");
		boardDTO.setContents("update");
		boardDTO.setNum(7);
		int result = noticeDAO.setUpdate(boardDTO);
		assertEquals(1, result);
	}
	//@Test
	public void insertTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("title1");
		noticeDTO.setWriter("writer1");
		noticeDTO.setContents("contents1");
		int result = noticeDAO.setWrite(noticeDTO);
		assertEquals(1, result);
	}
	
}
