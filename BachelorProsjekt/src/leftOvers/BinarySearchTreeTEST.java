package leftOvers;


public class BinarySearchTreeTEST<AnyType extends Comparable< ? super Integer>> {
	public BinarySearchTreeTEST(){
		nullNode = new Node<AnyType>(null);
		nullNode.leftChild = nullNode.rightChild = nullNode;
		header = new Node<>( null );
		header.leftChild = header.rightChild = nullNode;
	}
	
	public void insert ( AnyType item){
		
	}
	
	private Node<AnyType> nullNode, header, current, parent, grand, great;
}
