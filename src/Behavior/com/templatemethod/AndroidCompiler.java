package Behavior.com.templatemethod;

public class AndroidCompiler extends CrossCompiler {

	@Override
	protected void compileToTarget() {
		System.out.println("Android compilation");
	}

	@Override
	protected void collectSources() {
		System.out.println("Collect android specific sources");
	}

}
