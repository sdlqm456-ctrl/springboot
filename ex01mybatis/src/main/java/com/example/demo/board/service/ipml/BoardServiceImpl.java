package com.example.demo.board.service.ipml;

import org.springframework.stereotype.Service;

import com.example.demo.board.BoardVO;
import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class BoardServiceImpl implements BoardService {

	private final BoardMapper boardMapper;

	@Override
	public PageInfo<Object> selectAll(BoardVO boa, int pageNum) {
		PageInfo<Object> page = PageHelper.startPage(pageNum, 5).doSelectPageInfo(() -> boardMapper.selectAll(boa));
		log.info("TotalCount : {}, CurrentPage : {}, PageSize : {}, TotalPage : {}", page.getTotal(), page.getPageNum(),
				page.getPageSize(), page.getPages());
		System.out.println(page.getList());

		return page;
	}

	@Override
	public BoardVO selectOne(Integer boardno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BoardVO boa) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BoardVO boa) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer bno) {
		// TODO Auto-generated method stub

	}

}
