package com.yr.s6;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yr.board.BoardDTO;
import com.yr.board.notice.NoticeDTO;
import com.yr.board.notice.NoticeServiceImpl;
import com.yr.util.PageMaker;

@Controller
@RequestMapping("/notice/")
public class NoticeController {

	@Inject
	private NoticeServiceImpl noticeService;
	

	
	//wirte Form
	@RequestMapping(value="noticeWrite" ,method = RequestMethod.GET)
	public String setWrite(Model model) throws Exception {
		model.addAttribute("board", "notice");
		return "board/boardWrite";
	}
	
	//write insert
	@RequestMapping(value="noticeWrite" ,method = RequestMethod.POST)
	public String setWrite(NoticeDTO noticeDTO) throws Exception {
		int result =noticeService.setWrite(noticeDTO);
		return "redirect:./noticeList";
	}
	
	@RequestMapping(value="noticeList", method = RequestMethod.GET)
	public ModelAndView getList(PageMaker pageMaker) throws Exception {
		
		return null;
	}
	@RequestMapping(value= "noticeSelect", method=RequestMethod.GET)
	public ModelAndView getSelect(@RequestParam(defaultValue="0", required = false)int num, ModelAndView mav) throws Exception {
		BoardDTO boardDTO= noticeService.getSelect(num);
		mav.addObject("boardDTO", boardDTO);
		mav.addObject("board", "notice");
		mav.setViewName("board/boardSelect");
		return mav;
		
	}
	
	
}
