package com.example.demo.book.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.book.BookVO;

@Mapper
public interface BookService {
  List<BookVO>selectAll(BookVO bok, int pageNum);
  int insert(BookVO bok);
}
