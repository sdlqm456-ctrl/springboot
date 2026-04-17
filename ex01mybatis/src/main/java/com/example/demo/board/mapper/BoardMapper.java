package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.board.BoardVO;

@Mapper
public interface BoardMapper {
  List<BoardVO> selectAll(BoardVO boa);
  BoardVO selectOne(Integer boardno);
  int insert(BoardVO boa);
  int update(BoardVO boa);
  void delete(Integer bno);
}
