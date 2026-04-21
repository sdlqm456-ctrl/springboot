package Iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Instremtast {
  public static void main(String[] args) throws Exception {
	fileCopy();
	
	// 키보드 => 파일로 저장 
	saveFile();
	
 }
  
  private static void saveFile() throws Exception {
	  FileOutputStream target = new FileOutputStream(new File("d:/upload", "in.txt"));
	  int a;
	  while((a = System.in.read()) != -1) {
		  target.write(a);
	  }
}
  
  
  
  private static void fileCopy() throws Exception {
	  FileInputStream origin = new FileInputStream(new File("d:/upload", "mudo.jpg"));
	  FileOutputStream target = new FileOutputStream(new File("d:/upload", "mudocopy2.jpg"));
	  
	  byte [] f = new byte [1024];
	  int s;
	  
	  while((s =  origin.read(f)) != -1) {
		  target.write(f, 0, s);
	  }
 }
}
