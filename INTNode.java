public class INTNode extends Node {


private int variableINT;
	public INTNode(String integers) {
		variableINT = Integer.parseInt(integers);

	}
	@Override
	public int eval(){

		return variableINT;
	}
}

