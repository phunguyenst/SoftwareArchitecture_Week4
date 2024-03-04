package phu.se;

import java.io.IOException;
import java.io.PrintWriter;

import jdepend.xmlui.JDepend;



public class Sample_XML {
	public static void main(String[] args) throws IOException {
		JDepend db = new JDepend(new PrintWriter("report.xml"));
		db.addDirectory("T:\\nguyenvanPhu\\Library-Assistant");
		
		db.analyze();
		System.out.println("export success");
	}
}	
