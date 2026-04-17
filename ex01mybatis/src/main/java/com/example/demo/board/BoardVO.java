package com.example.demo.board;

import java.util.Date;
import lombok.Data;

@Data
public class BoardVO {
	 Integer bno;
	 String title;
	 String content;
	 String writer;
	 Date regdate;
}
