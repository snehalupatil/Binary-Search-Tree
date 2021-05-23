public class MyBinaryTree <k extends Comparable<k>> {

    private MyBinaryNode<k> root;

    public void add(k key){
        this.root = this.addRecursive(root,key);
    }

    private MyBinaryNode<k> addRecursive(MyBinaryNode current,k key){
        if(current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo((k) current.key);
        if(compareResult == 0) return current;
        if(compareResult < 0) {
            current.left = addRecursive(current.left, key);
        }else {
            current.right = addRecursive(current.right,key);
        }
        return current;
    }

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    public int getSizeRecursive(MyBinaryNode<k> current){
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }
}