package Behavior.com.templatemethod;

// All steps are the same for both examples

public abstract class CrossCompiler {
	
	public final void compile() {
		
		collectSources();
		reserveRam();
		compileToTarget();
		afterCompileHook();
		compilationStatusNotification();
		
		
	}

	private void compilationStatusNotification() {
		System.out.println("Compilation is successful");
	}

	private void afterCompileHook() {
	}


	private void reserveRam() {
		System.out.println("Ram is reserved for compilation process");
	}

	protected abstract void compileToTarget();

	protected abstract void collectSources();

	

}
