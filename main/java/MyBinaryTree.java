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

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    public int getSizeRecursive(MyBinaryNode<k> current){
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }

    public Boolean search(k key) {
        MyBinaryNode current =  searchRecursive(root,key);
        if(key.equals(current.key))
            return true;
        else
            return false;
    }

    private MyBinaryNode<k> searchRecursive(MyBinaryNode current, k key) {

        while (current.key != key) {
            int compareResult = key.compareTo((k) current.key);
            if (compareResult == 0)
                return current;
            else if (compareResult < 0)
                current = current.left;
            else
                current = current.right;
        }
        return current;
    }

}