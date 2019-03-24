package interfaces.interfaceprocessor;

public abstract class StringProcessor implements Processor {

	@Override
	public String getProcessorName() {
		return getClass().getSimpleName();
	}

	@Override
	public abstract Object process(Object input);

}
