package def.jquery;
import def.js.Array;
public interface JQueryPromiseOperator<T,U> {
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T> callback1, ArrayJQueryPromiseCallbackAny... callbacksN);
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T>[] callback1, ArrayJQueryPromiseCallbackAny... callbacksN);
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T>[] callback1, ArrayJQueryPromiseCallbackAnys... callbacksN);
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T> callback1, ArrayJQueryPromiseCallbackAnys... callbacksN);
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T> callback1, JQueryPromiseCallback<?>... callbacksN);
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T>[] callback1, JQueryPromiseCallback<?>... callbacksN);
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T>[] callback1, JQueryPromiseCallback<?>[]... callbacksN);
    public JQueryPromise<U> $apply(JQueryPromiseCallback<T> callback1, JQueryPromiseCallback<?>[]... callbacksN);
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackAny extends def.js.Object {
        public ArrayJQueryPromiseCallbackAny(Array<JQueryPromiseCallback<?>>... callbacksN){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackAnys extends def.js.Object {
        public ArrayJQueryPromiseCallbackAnys(Array<JQueryPromiseCallback<?>[]>... callbacksN){}
    }
}

