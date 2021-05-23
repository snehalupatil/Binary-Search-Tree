import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {

    @Test
    public void givenNumberWhenAddedBinaryTreeShouldReturnSizeThree(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        int size =myBinaryTree.getSize();
        Assertions.assertEquals(3,size);
    }
}