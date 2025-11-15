package ua.opnu;


public class GenericThreeTuple<T, V, S> {
    public final GenericTwoTuple<T, V> two; // композиція
    public final S third;


    public GenericThreeTuple(T first, V second, S third) {
        this.two = new GenericTwoTuple<>(first, second);
        this.third = third;
    }


    public T getFirst() { return two.first; }
    public V getSecond() { return two.second; }


    @Override
    public String toString() {
        return "(" + two.first + "," + two.second + "," + third + ")";
    }
}