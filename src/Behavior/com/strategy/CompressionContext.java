package Behavior.com.strategy;

import java.io.File;
import java.util.List;

public class CompressionContext {
	
	private CompressionStrategy strategy;
	
	public void setCompressionStrategy(CompressionStrategy strategy) {
		
		this.strategy = strategy;
	}
	
	public void createArchive(File file) {
		strategy.compressFiles(file);
	}
	
	public void createArchive(File file, CompressionStrategy cs) {
		cs.compressFiles(file);
	}

}
