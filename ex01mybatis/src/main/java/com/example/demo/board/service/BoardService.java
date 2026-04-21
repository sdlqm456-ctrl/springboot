package com.example.demo.board.service;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.board.BoardVO;
import com.github.pagehelper.PageInfo;

@Mapper
public interface BoardService {
  PageInfo<Object> selectAll(BoardVO boa, int pageNum);
  BoardVO selectOne(Integer boardno);
  int insert(BoardVO boa);
  int update(BoardVO boa);
  void delete(Integer bno);
}
