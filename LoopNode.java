public class LoopNode extends Node{
	@Override
	public int eval(){
		Node zero=children().get(0);
		Node one=children().get(1);
		while(zero.eval()==1){
			one.eval();
		}
	return 0;
	}
}

