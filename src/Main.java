import java.util.ArrayList;

 class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T getContent() {
        return t;
    }

    public static void main(String[] args) {
        Box<ArrayList<Integer>> arrayListBox = new Box<>(new ArrayList<>());
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(10);
        newArrayList.add(20);
        arrayListBox.set(newArrayList);
        System.out.println(arrayListBox.getContent().size());
    }
}