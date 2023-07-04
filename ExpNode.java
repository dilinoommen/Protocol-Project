public class ExpNode extends Node{
	@Override
	public int eval(){
	{
		int result=getChild(0).eval();
		for( int i=1; i<children().size(); i+=2){
			OpNode op=(OpNode)children().get(i);
			Node oprNode=children().get(i+1);
			int Value=oprNode.eval();
		switch(op.getName()){
			case "+":
				result += Value;
				break;
			case "-":
                        	result -= Value;
                        	break;
			case "*":
                        	result *= Value;
                        	break;
			case "/":
                        	result /= Value;
				break;
			default:
				throw new RuntimeException("Unknown operator :" +op.getName());
			}
		}
		return result;
	}
}

}
