package com.example.demo.book;

import java.sql.Date;



import lombok.Data;

@Data
public class BookVO {
  private Integer bookNo;
  private String bookName;
  private String bookCovering;
  private Date bookDate;
  private int bookPrice;
  private String bookPublsher;
  private String bookInfo;
  
}
