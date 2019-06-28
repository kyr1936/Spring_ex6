package com.yr.board.notice;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.yr.board.BoardDAO;
import com.yr.board.BoardDTO;
import com.yr.util.PageMaker;


@Repository
public class NoticeDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	private String mapper="NoticeMapper.";
	
	@Override
	public int setDelete(int num) throws Exception {
		return sqlSession.delete(mapper+"noticeDelete", num); 
		
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(mapper+"noticeUpdate"+ boardDTO);
	}

	@Override
	public int setWrite(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.insert(mapper+"noticeWrite", boardDTO);
	}

	@Override
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception {
		
		return sqlSession.selectList(mapper+"noticeList", pageMaker);
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {

		return sqlSession.selectOne(mapper+"noticeSelect", num);
	}

	@Override
	public int getTotalCount(PageMaker pageMaker) throws Exception {
		
		return sqlSession.selectOne(mapper+"totalCount", pageMaker);
	}
	
	

}

