package com.yr.board.notice;

import static org.junit.Assert.*;

import javax.inject.Inject;


import org.junit.Test;

import com.yr.s6.AbstractTest;

public class NoticeDAOTest extends AbstractTest{

	@Inject
	private NoticeDAOImpl noticeDAOImpl;
	
	
	// 각 테스트 메서드 를 하기 전 마다 실행
	//@Before
	public void t() {
		
	}
	
	// 전체 클래스를 시작하기 전 딱 한번만 실행 
	//@BeforeClass
	public static void t2() {}
	
	// 각 테스트 메서드를 실행한 후 한번 씩 실행
	//@After
	public void t3() {}
	
	// 전체 테스트 후 딱 한 번 실행
	//@AfterClass
	public static void t4() {}

		
	
	@Test
	public void test() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setWriter("mmm");
		noticeDTO.setTitle("ttt");
		noticeDTO.setContents("vccccc");
		int result = noticeDAOImpl.setWrite(noticeDTO);
		assertEquals(1, result);
	}
	 
}
