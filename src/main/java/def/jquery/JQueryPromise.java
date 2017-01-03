package def.jquery;
import def.js.Array;
/**
 * Interface for the JQuery promise, part of callbacks
 */
@jsweet.lang.Interface
public abstract class JQueryPromise<T> extends JQueryGenericPromise<T> {
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
    native public JQueryPromise<T> always(JQueryPromiseCallback<?> alwaysCallback1, ArrayJQueryPromiseCallbackAny... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackT<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?> failCallback1, ArrayJQueryPromiseCallbackAny... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?> progressCallback1, ArrayJQueryPromiseCallbackAny... progressCallbackN);
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Return a Deferred's Promise object.
     * 
     * @param target Object onto which the promise methods have to be attached
     */
    native public JQueryPromise<T> promise(Object target);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always();
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done();
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail();
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress();
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter, java.util.function.Function<Object,Object> failFilter);
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter);
    native public JQueryPromise<?> pipe();
    /**
     * Return a Deferred's Promise object.
     * 
     * @param target Object onto which the promise methods have to be attached
     */
    native public JQueryPromise<T> promise();
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always(JQueryPromiseCallback<?> alwaysCallback1, ArrayJQueryPromiseCallbackAnys... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, ArrayJQueryPromiseCallbackAny... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, ArrayJQueryPromiseCallbackAnys... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackTs<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackTs<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") ArrayJQueryPromiseCallbackT<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?> failCallback1, ArrayJQueryPromiseCallbackAnys... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?>[] failCallback1, ArrayJQueryPromiseCallbackAny... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?>[] failCallback1, ArrayJQueryPromiseCallbackAnys... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?>[] progressCallback1, ArrayJQueryPromiseCallbackAny... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?> progressCallback1, ArrayJQueryPromiseCallbackAnys... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?>[] progressCallback1, ArrayJQueryPromiseCallbackAnys... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always(JQueryPromiseCallback<?> alwaysCallback1, JQueryPromiseCallback<?>... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?> failCallback1, JQueryPromiseCallback<?>... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?> progressCallback1, JQueryPromiseCallback<?>... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always(JQueryPromiseCallback<?> alwaysCallback1, JQueryPromiseCallback<?>[]... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, JQueryPromiseCallback<?>... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<T> always(JQueryPromiseCallback<?>[] alwaysCallback1, JQueryPromiseCallback<?>[]... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>[]... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T> doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>[]... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<T> done(JQueryPromiseCallback<T>[] doneCallback1, @SuppressWarnings("unchecked") JQueryPromiseCallback<T>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?> failCallback1, JQueryPromiseCallback<?>[]... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?>[] failCallback1, JQueryPromiseCallback<?>... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<T> fail(JQueryPromiseCallback<?>[] failCallback1, JQueryPromiseCallback<?>[]... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?>[] progressCallback1, JQueryPromiseCallback<?>... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?> progressCallback1, JQueryPromiseCallback<?>[]... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<T> progress(JQueryPromiseCallback<?>[] progressCallback1, JQueryPromiseCallback<?>[]... progressCallbackN);
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackAnys extends def.js.Object {
        public ArrayJQueryPromiseCallbackAnys(Array<JQueryPromiseCallback<?>[]>... alwaysCallbacksN){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackAny extends def.js.Object {
        public ArrayJQueryPromiseCallbackAny(Array<JQueryPromiseCallback<?>>... alwaysCallbacksN){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackT<T> extends def.js.Object {
        public ArrayJQueryPromiseCallbackT(@SuppressWarnings("unchecked") Array<JQueryPromiseCallback<T>>... doneCallbackN){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ArrayJQueryPromiseCallbackTs<T> extends def.js.Object {
        public ArrayJQueryPromiseCallbackTs(@SuppressWarnings("unchecked") Array<JQueryPromiseCallback<T>[]>... doneCallbackN){}
    }
}

