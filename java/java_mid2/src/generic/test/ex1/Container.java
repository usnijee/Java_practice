package generic.test.ex1;

public class Container<T> {

    private T value;

    public void setItem(T value) {
        this.value = value;
    }

    public T getItem() {
        return value;
    }

    public boolean isEmpty() {
//        if (value == null) {
//            return true;
//        }
//        return false;
//    }
        return value == null;
    }
}
