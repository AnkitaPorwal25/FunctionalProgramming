package L5CustomFunctionalInterfaces.Q29CustomTriFunction;
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
