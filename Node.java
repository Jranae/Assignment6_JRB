/**
 * Jaleah Beason
 * N. Johnson, Bellarmine University
 */
public class Node {
	private int data;
	private Node kChild;
	private Node sChild;
	
	public Node(int data)
	{
		kChild=null;
		sChild=null;
		this.data=data;
	}
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the kChild
	 */
	public Node getkChild() {
		return kChild;
	}
	/**
	 * @param  the kChild to set
	 */
	public void setkChild(Node lChild) {
		this.kChild = lChild;
	}
	/**
	 * @return the sChild
	 */
	public Node getsChild() {
		return sChild;
	}
	/**
	 * @param sChild the sChild to set
	 */
	public void setrChild(Node sChild) {
		this.sChild = sChild;
	}
}