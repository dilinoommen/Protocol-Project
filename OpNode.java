public class OpNode extends Node {

	private String op;

	public OpNode(String image) {
		op = image;
	}

	@Override
	public String getName() {
		return op;
	}

	@Override
	public int eval() {
		throw new UnsupportedOperationException("Can't eval op.");
	}
}
