package Task;

import java.util.ArrayList;

public class NewFriendsList <T>{
     private final ArrayList friends = new ArrayList();

    public void addFriends(T o) {
        friends.add(o);
    }

    public void removeFriends(T o) {
        friends.remove(o);
    }

    public String getFriend(int index) {
        return friends.get(index).toString();
    }

    public String friendsList() {
        return friends.toString();
    }
}
