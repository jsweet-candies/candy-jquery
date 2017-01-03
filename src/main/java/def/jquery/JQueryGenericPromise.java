package def.jquery;
/**
 * Allows jQuery Promises to interop with non-jQuery promises
 */
@jsweet.lang.Interface
public abstract class JQueryGenericPromise<T> extends def.js.Object {
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    @jsweet.lang.Name("then")
    native public <U> JQueryPromise<U> thenDoneFilterBiFunction(java.util.function.BiFunction<T,Object,U> doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public JQueryPromise<Void> then(java.util.function.BiConsumer<T,Object> doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    @jsweet.lang.Name("then")
    native public <U> JQueryPromise<U> thenDoneFilterBiFunction(java.util.function.BiFunction<T,Object,U> doneFilter, java.util.function.Function<Object,Object> failFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    @jsweet.lang.Name("then")
    native public <U> JQueryPromise<U> thenDoneFilterBiFunction(java.util.function.BiFunction<T,Object,U> doneFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public JQueryPromise<Void> then(java.util.function.BiConsumer<T,Object> doneFilter, java.util.function.Function<Object,Object> failFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public JQueryPromise<Void> then(java.util.function.BiConsumer<T,Object> doneFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public <U> JQueryPromise<U> then(java.util.function.Supplier<U> doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public JQueryPromise<Void> then(java.lang.Runnable doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public <U> JQueryPromise<U> then(java.util.function.Supplier<U> doneFilter, java.util.function.Function<Object,Object> failFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public <U> JQueryPromise<U> then(java.util.function.Supplier<U> doneFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public JQueryPromise<Void> then(java.lang.Runnable doneFilter, java.util.function.Function<Object,Object> failFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    native public JQueryPromise<Void> then(java.lang.Runnable doneFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    @jsweet.lang.Name("then")
    native public <U> JQueryPromise<U> thenDoneFilterJQueryPromiseBiFunction(java.util.function.BiFunction<T,Object,JQueryPromise<U>> doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    @jsweet.lang.Name("then")
    native public <U> JQueryPromise<U> thenDoneFilterJQueryPromiseBiFunction(java.util.function.BiFunction<T,Object,JQueryPromise<U>> doneFilter, java.util.function.Function<Object,Object> failFilter);
    /**
     * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
     * 
     * @param doneFilter A function that is called when the Deferred is resolved.
     * @param failFilter An optional function that is called when the Deferred is rejected.
     */
    @jsweet.lang.Name("then")
    native public <U> JQueryPromise<U> thenDoneFilterJQueryPromiseBiFunction(java.util.function.BiFunction<T,Object,JQueryPromise<U>> doneFilter);
}

