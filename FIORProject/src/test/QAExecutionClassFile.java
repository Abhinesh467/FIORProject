package test;

public class QAExecutionClassFile extends QAFiori{

	public static void main(String[] args) throws Exception {
		invokeBrowser();
		validateGraphData();
		closeInstance();
	}
}
