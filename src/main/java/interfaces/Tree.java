package interfaces;

public abstract class Tree {
    private boolean smellGood = true;

    public abstract int countLeaves();

    public boolean isSmellGood() {
        return smellGood;
    }

    @Override
    public String toString() {
        return "I'm a tree not ant!";
    }
}
