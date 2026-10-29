package deneme;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        Object o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}