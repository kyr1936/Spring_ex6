package com.yr.board.qna;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yr.board.BoardDAO;
import com.yr.board.BoardDTO;
import com.yr.util.PageMaker;

@Repository
public class QnaDAOImpl implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
	private String mapper = "QnaMapper.";
	
	@Override
	public int setDelete(int num) throws Exception {
		return sqlSession.delete(mapper+"qnaDelete", num);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
	
		return sqlSession.update(mapper+"qnaUpdate", boardDTO);
	}

	@Override
	public int setWrite(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(mapper+"qnaWrite", boardDTO);
		
	}

	@Override
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception {
		
		return sqlSession.selectList(mapper+"qnaList");
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		
		return sqlSession.selectOne(mapper+"qnaSelect", num);
	}
	
}
