package Questions;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {

	public static void main(String[] args) {
	
		TreeMap<Integer, Integer> root1 = new TreeMap();
		root1.put(1, 4);
		root1.put(2, 2);
		root1.put(3, 7);
		root1.put(4, 1);
		root1.put(5, 3);
		root1.put(7, 6);
		root1.put(6, 9);
		
		Integer tr = root1.lowerKey(null);
		
	}

}