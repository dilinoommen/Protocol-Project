public class RelNode extends Node{
	@Override
	public int eval(){
		OpNode op=(OpNode) children().get(1);
		int zero=children().get(0).eval();
		int two=children().get(2).eval();

	if(op.equals("<")){
		if(zero<two){
			return 1;
		}
		else{
			return 0;
		}
		}else if(op.equals(">")){
			if(zero>two){
				return 1;
			}
			else{
				return 0;
		}
		}else if(op.equals(">=")){
			if(zero>=two){
				return 1;
			}
			else{
				return 0;
		}
		}else if(op.equals("<=")){
			if(zero<=two){
				return 1;
			}
			else{
				return 0;
		}
		}else if(op.equals("==")){
			if(zero==two){
				return 1;
			}
			else{
				return 0;
		}
		}else if(op.equals("!=")){
			if(zero != two){
				return 1;
			}
			else{
				return 0;
		}
		}else{
			return 0;
		}
	}
}
	


