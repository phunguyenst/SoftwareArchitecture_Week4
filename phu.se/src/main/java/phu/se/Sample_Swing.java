package phu.se;

import java.io.IOException;

import jdepend.swingui.JDepend;

public class Sample_Swing {
	public static void main(String[] args) throws IOException {
		JDepend db = new JDepend();
		db.addDirectory("T:\\nguyenvanPhu\\Library-Assistant");
		
		db.analyze();
	}
}
