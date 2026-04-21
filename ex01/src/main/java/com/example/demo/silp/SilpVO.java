package com.example.demo.silp;
import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SilpVO {
  private Integer silpno;
  private int silpamount;
  private Date silpdt;
  private Date seldt;
  private int bankacct;
}
