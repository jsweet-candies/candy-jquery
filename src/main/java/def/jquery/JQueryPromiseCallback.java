package def.jquery;
/**
 * Interface for the JQuery promise/deferred callbacks
 */
public interface JQueryPromiseCallback<T> {
    public void apply(T value, Object... args);
    public void apply();
}

