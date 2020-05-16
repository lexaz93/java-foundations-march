package interfaces.extraHW;

import org.w3c.dom.ls.LSOutput;

public class Plant implements Eatable, Talkable {

    @Override
    public void eat() {
        System.out.println("Я питаюсь фотосинтезом!");
    }

    @Override
    public void talk() {
        System.out.println("Растения не разговаривают(");
    }
}
