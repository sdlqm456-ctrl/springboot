package com.example.demo.book.service.Impl;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.book.BookVO;
import com.example.demo.book.mapper.BookMapper;
import com.example.demo.book.service.BookService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class BookServiceImpI  implements BookService {
	
	private final BookMapper bookMapper;

	@Override
	public List<BookVO> selectAll(BookVO boa, int pageNum) {

		return bookMapper.selectAll(boa);
	}
	@Override
	public int insert(BookVO boa) {
		return bookMapper.insert(boa);
	}
	
	
 
}
