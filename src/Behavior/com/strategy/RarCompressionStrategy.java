package Behavior.com.strategy;

import java.io.File;

/**
 * This strategy is used only for example. We don't have a implementation yet.
 * @author Joaquim
 *
 */
public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(File file) {
		
		
		System.out.println("rar strategy");
		
	}

}
