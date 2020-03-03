package src.lesson.lesson22;

public interface Mapper<T,E> {
    void mapAToB(T t, E e);
    void mapBToA(T t, E e);
}