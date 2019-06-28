package com.yr.board.qna;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yr.board.BoardDTO;
import com.yr.board.BoardService;
import com.yr.util.PageMaker;

@Service
public class QnaServiceImpl implements BoardService{

	@Inject
	private QnaDAOImpl qnaDAOImpl;
	
	@Override
	public int setDelete(int num) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAOImpl.setDelete(num);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAOImpl.setUpdate(boardDTO);
	}

	@Override
	public int setWrite(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAOImpl.setWrite(boardDTO);
	}

	@Override
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAOImpl.getList(pageMaker);
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAOImpl.getSelect(num);
	}

	
}
