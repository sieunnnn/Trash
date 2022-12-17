package src.multiCampus.library.util.collection.lambda.function;

@FunctionalInterface
public interface Function<T> {

    T apply(T t, T u);

}
