package src.multiCampus.library.util.collection.lambda.function;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

}