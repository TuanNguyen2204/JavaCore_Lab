
public class Main {

    public static void main(String[] args) {
        int a[] = {8, 6, 9, 2, 7, 1, 3, 5, 4};
        BSTree b = new BSTree();
        b.insertMany(a);
        System.out.println("1.Breadth-first traversals");
        b.breadth(b.root);
        System.out.println("\n2. PreOrder traversals");
        b.preOrder(b.root);
        System.out.println("\n3. InOrder traversals");
        b.inOrder(b.root);
        System.out.println("\n4. PostOrder traversals");
        b.postOrder(b.root);
        System.out.println("\n5. Delete by copy");
        b.deleteByCopy(6);
        b.breadth(b.root);
        System.out.println();
        System.out.println("\n6. Test rotate right");
        b.root = b.rotateRight(b.root);
        b.breadth(b.root);
        System.out.println();
    }
}
