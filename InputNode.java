import java.util.Scanner;

public class InputNode extends Node{
	
	private Scanner scan;

	public InputNode(){
		scan = new Scanner(System.in);

	}
	@Override
	public int eval(){
		Node child = getChild(0);

		String name = child.getName();

		int value = scan.nextInt();

		IDNode.ram.put(name, value);

		return 0;
	}
}
