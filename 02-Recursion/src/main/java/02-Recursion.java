
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Tree, Graphs, Divide and Conquer, Greedy, Dynamic Programming
 */

/**
 * Recursive Case : Case where the function recur.
 * Base Case: Case where the functon does not recur.
 */

/**
 * Example
 *
 * SampleRecursion(parameter){
 *
 *     if(base case is satisfied){
 *         return some base case value
 *     }else{
 *         SampleRecursion(modified parameter)
 *     }
 *
 * }
 *
 *
 */


@Data
@AllArgsConstructor
class Node{
    private int data;

    private Node leftNode;
    private Node rightNode;

    public Node(int data) {
        this.data = data;
    }
}

class Demo{

    public static Node search(Node root,int data){

        if(root == null){
            return null;
        }

        if(root.getData() == data){
            return root;
        }

        if(root.getData() < data){

            search(root.getLeftNode(), data);
        }else{

            search(root.getRightNode(), data);
        }

        return null;
    }

    public static void main(String[] args) {
    }

}




















