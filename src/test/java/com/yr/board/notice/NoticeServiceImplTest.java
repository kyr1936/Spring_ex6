package com.yr.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.yr.board.BoardDTO;
import com.yr.s6.AbstractTest;
import com.yr.util.PageMaker;

public class NoticeServiceImplTest extends AbstractTest{

	@Inject
	private NoticeServiceImpl noticeService;
	
	@Test
	public void test() throws Exception{
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCurPage(1);
		
		List<BoardDTO> ar = noticeService.getList(pageMaker);
		assertEquals(3, ar.size());
		
	}

}
