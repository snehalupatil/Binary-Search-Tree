public class MyBinaryNode<k extends Comparable<k>> {
    k key;
    MyBinaryNode left;
    MyBinaryNode right;

    public MyBinaryNode(k key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

}