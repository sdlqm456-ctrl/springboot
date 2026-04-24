package com.example.demo.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.book.BookVO;

@Mapper
public interface BookMapper {
 List<BookVO> selectAll(BookVO bok);
 int insert(BookVO bok);
}
