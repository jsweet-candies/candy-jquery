package def.jquery;
import def.js.Array;
/**
 * Interface for the JQuery deferred, part of callbacks
 */
@jsweet.lang.Interface
public abstract class JQueryDeferred<T> extends JQueryGenericPromise<T> {
    /**
     * Determine the current state of a Deferred object.
     */
    native public String state();
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?> alwaysCallback1, ArrayJQueryPromiseCallbackAny... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackT<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?> failCallback1, ArrayJQueryPromiseCallbackAny... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?> progressCallback1, ArrayJQueryPromiseCallbackAny... progressCallbackN);
    /**
     * Call the progressCallbacks on a Deferred object with the given args.
     * 
     * @param args Optional arguments that are passed to the progressCallbacks.
     */
    native public JQueryDeferred<T> notify(Object value, Object... args);
    /**
     * Call the progressCallbacks on a Deferred object with the given context and args.
     * 
     * @param context Context passed to the progressCallbacks as the this object.
     * @param args Optional arguments that are passed to the progressCallbacks.
     */
    native public JQueryDeferred<T> notifyWith(Object context, Object[] value);
    /**
     * Reject a Deferred object and call any failCallbacks with the given args.
     * 
     * @param args Optional arguments that are passed to the failCallbacks.
     */
    native public JQueryDeferred<T> reject(Object value, Object... args);
    /**
     * Reject a Deferred object and call any failCallbacks with the given context and args.
     * 
     * @param context Context passed to the failCallbacks as the this object.
     * @param args An optional array of arguments that are passed to the failCallbacks.
     */
    native public JQueryDeferred<T> rejectWith(Object context, Object[] value);
    /**
     * Resolve a Deferred object and call any doneCallbacks with the given args.
     * 
     * @param value First argument passed to doneCallbacks.
     * @param args Optional subsequent arguments that are passed to the doneCallbacks.
     */
    native public JQueryDeferred<T> resolve(T value, Object... args);
    /**
     * Resolve a Deferred object and call any doneCallbacks with the given context and args.
     * 
     * @param context Context passed to the doneCallbacks as the this object.
     * @param args An optional array of arguments that are passed to the doneCallbacks.
     */
    native public JQueryDeferred<T> resolveWith(Object context, T[] value);
    /**
     * Return a Deferred's Promise object.
     * 
     * @param target Object onto which the promise methods have to be attached
     */
    native public JQueryPromise<T> promise(Object target);
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always();
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done();
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail();
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress();
    /**
     * Call the progressCallbacks on a Deferred object with the given args.
     * 
     * @param args Optional arguments that are passed to the progressCallbacks.
     */
    @jsweet.lang.Name("notify")
    native public JQueryDeferred<T> Notify();
    /**
     * Call the progressCallbacks on a Deferred object with the given context and args.
     * 
     * @param context Context passed to the progressCallbacks as the this object.
     * @param args Optional arguments that are passed to the progressCallbacks.
     */
    native public JQueryDeferred<T> notifyWith(Object context);
    /**
     * Reject a Deferred object and call any failCallbacks with the given args.
     * 
     * @param args Optional arguments that are passed to the failCallbacks.
     */
    native public JQueryDeferred<T> reject();
    /**
     * Reject a Deferred object and call any failCallbacks with the given context and args.
     * 
     * @param context Context passed to the failCallbacks as the this object.
     * @param args An optional array of arguments that are passed to the failCallbacks.
     */
    native public JQueryDeferred<T> rejectWith(Object context);
    /**
     * Resolve a Deferred object and call any doneCallbacks with the given args.
     * 
     * @param value First argument passed to doneCallbacks.
     * @param args Optional subsequent arguments that are passed to the doneCallbacks.
     */
    native public JQueryDeferred<T> resolve();
    /**
     * Resolve a Deferred object and call any doneCallbacks with the given context and args.
     * 
     * @param context Context passed to the doneCallbacks as the this object.
     * @param args An optional array of arguments that are passed to the doneCallbacks.
     */
    native public JQueryDeferred<T> resolveWith(Object context);
    /**
     * Return a Deferred's Promise object.
     * 
     * @param target Object onto which the promise methods have to be attached
     */
    native public JQueryPromise<T> promise();
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter, java.util.function.Function<Object,Object> failFilter);
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter);
    native public JQueryPromise<?> pipe();
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, ArrayJQueryPromiseCallbackAnys... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, ArrayJQueryPromiseCallbackAny... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?> alwaysCallback1, ArrayJQueryPromiseCallbackAnys... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackTs<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackT<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackTs<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?>[] failCallback1, ArrayJQueryPromiseCallbackAnys... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?>[] failCallback1, ArrayJQueryPromiseCallbackAny... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?> failCallback1, ArrayJQueryPromiseCallbackAnys... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?> progressCallback1, ArrayJQueryPromiseCallbackAnys... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?>[] progressCallback1, ArrayJQueryPromiseCallbackAnys... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?>[] progressCallback1, ArrayJQueryPromiseCallbackAny... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?> alwaysCallback1, JQueryPromiseCallback<?>... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?> failCallback1, JQueryPromiseCallback<?>... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?> progressCallback1, JQueryPromiseCallback<?>... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, JQueryPromiseCallback<?>[]... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, JQueryPromiseCallback<?>... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryDeferred<T> always(JQueryPromiseCallback<?> alwaysCallback1, JQueryPromiseCallback<?>[]... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>[]... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryDeferred<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>[]... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?>[] failCallback1, JQueryPromiseCallback<?>[]... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?>[] failCallback1, JQueryPromiseCallback<?>... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryDeferred<T> fail(JQueryPromiseCallback<?> failCallback1, JQueryPromiseCallback<?>[]... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?> progressCallback1, JQueryPromiseCallback<?>[]... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?>[] progressCallback1, JQueryPromiseCallback<?>[]... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryDeferred<T> progress(JQueryPromiseCallback<?>[] progressCallback1, JQueryPromiseCallback<?>... progressCallbackN);
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackAny extends def.js.Object {
        public ArrayJQueryPromiseCallbackAny(Array<JQueryPromiseCallback<?>>... alwaysCallbacksN){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackAnys extends def.js.Object {
        public ArrayJQueryPromiseCallbackAnys(Array<JQueryPromiseCallback<?>[]>... alwaysCallbacksN){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackTs<T> extends def.js.Object {
        public ArrayJQueryPromiseCallbackTs(@SuppressWarnings("unchecked") Array<JQueryPromiseCallback<T>[]>... doneCallbackN){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackT<T> extends def.js.Object {
        public ArrayJQueryPromiseCallbackT(@SuppressWarnings("unchecked") Array<JQueryPromiseCallback<T>>... doneCallbackN){}
    }
}

