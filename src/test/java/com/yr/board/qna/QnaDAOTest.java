package com.yr.board.qna;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.yr.board.BoardDTO;
import com.yr.s6.AbstractTest;

public class QnaDAOTest extends AbstractTest{

	@Inject
	private QnaDAOImpl qnaDAOImpl;
	
	
	//@Test
	public void setDelete() throws Exception{
		int result = qnaDAOImpl.setDelete(16);
		assertEquals(1, result);
	}
	@Test
	public void insertTest() throws Exception {
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("title1");
		qnaDTO.setWriter("writer1");
		qnaDTO.setContents("contents1");
		int result = qnaDAOImpl.setWrite(qnaDTO);
		assertEquals(1, result);
	}
	//@Test
	public void updateTest() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("update");
		boardDTO.setWriter("update");
		boardDTO.setContents("update");
		boardDTO.setNum(5);
		int result = qnaDAOImpl.setUpdate(boardDTO);
		assertEquals(1, result);
	}
	/*
	//@Test
	public void selectTest() throws Exception {
		List<BoardDTO> ar  = qnaDAOImpl.getList();
		assertNotEquals(0, ar.size());
	} */
}
