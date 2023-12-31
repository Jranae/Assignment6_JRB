/**
 * N. Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree w/ root
		Node root=aTree.generatePracticeTree(5);
		DFS aSearch=new DFS();
		int branch=0;
		aSearch.DFS(root, branch);
		
		int height = aSearch.height;
		int treeHeight = height+1;
		
		System.out.println("Tree Height: " + treeHeight);
	}

}