package interfaces;

public class Wood {
    public static void main(String[] args) {
        Tree chrismasTree = new BirchTree();

        System.out.println(chrismasTree.countLeaves());
        System.out.println(chrismasTree.isSmellGood());
    }
}
