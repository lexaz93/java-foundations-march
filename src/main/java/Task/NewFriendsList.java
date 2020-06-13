package Task;

import java.util.ArrayList;

public class NewFriendsList {
     ArrayList friends = new ArrayList();

    public void addFriends(Person o) {
        friends.add(o);
    }

    public void removeFriends(Person o) {
        friends.remove(o);
    }

    public String getFriend(int index) {
        return friends.get(index).toString();
    }

    public String friendsList() {
        return friends.toString();
    }
}
