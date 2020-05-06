package interfaces;

public class Street {
    public static void main(String[] args) {
        Walkable alex = new Men();
        Walkable tuzik = new Dog();

//        alex.walk();
//        tuzik.walk();

        Walkable[] walkables = new Walkable[2];
        walkables[0] = alex;
        walkables[1] = tuzik;

        printWalkables(walkables);
    }
    
    public static  void printWalkables(Walkable[] walkables) {
        for (Walkable walkable: walkables) {
            walkable.walk();
        }
    }
}
