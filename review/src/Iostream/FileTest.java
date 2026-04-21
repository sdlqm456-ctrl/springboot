package Iostream;

import java.io.File;
import java.util.Calendar;

public class FileTest {
 public static void main(String[] args) {
	 // printDirList();
	 // deleteFile();
	 // printFileAttr();
	 
	 // 년도 계산
	 Calendar cal = Calendar.getInstance();
	 cal.set(1998, 04, 15);
	 Long today = System.currentTimeMillis() - cal.getTimeInMillis();
	 System.out.println(today/1000/60/60/24 + "년"); // 1970년을 기준으로 계산 
  }
 
 // 파일삭제 
 private static void deleteFile() {
	File file = new File("d:/upload", "DepMapperTest.java");
	file.delete();
}

// 파일속성출력 
// private static void printFileAttr() {
//	 File file = new File("d:/upload", "6-2.과제_프로그램.pdf");
//	 System.out.println("파일크기: " + );
//	 System.out.println("파일수정일자: " + );
// }
 
 
 // 파일 목록 조회 
 private static void printDirList() {
	 File dir = new File("d:/upload");
	 if(dir.isDirectory()) {
		 File[] list = dir.listFiles();
		 for(File f :list) {
			 System.out.println(f.getName()); // name 속성으로 바꾸면 파일명 출력 가능
		 }
		 
	 	}
	 
 	}
}
