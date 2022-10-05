package Behavior.com.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		CompressionContext ctx = new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		
		File file = new File("C:\\Users\\Joaquim\\Desktop\\dicas.txt");
		ctx.createArchive(file);
		
	}

}
