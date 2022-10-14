package Behavior.com.templatemethod;

public class IPhoneCompiler extends CrossCompiler {

	@Override
	protected void compileToTarget() {
		System.out.println("Iphone compilation");
	}

	@Override
	protected void collectSources() {
		System.out.println("Collect IPhone specific sources");
	}

}
