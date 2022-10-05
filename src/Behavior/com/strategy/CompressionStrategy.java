package Behavior.com.strategy;

import java.io.File;
import java.util.List;

@FunctionalInterface
public interface CompressionStrategy {
	void compressFiles(File file);	
}
