package def.jquery;
import def.dom.XMLHttpRequest;
import def.js.Array;
/**
 * Interface for the jqXHR object
 */
@jsweet.lang.Interface
@jsweet.lang.Extends({JQueryPromise.class})
public abstract class JQueryXHR extends XMLHttpRequest {
    /**
     * The .overrideMimeType() method may be used in the beforeSend() callback function, for example, to modify the response content-type header. As of jQuery 1.5.1, the jqXHR object also contains the overrideMimeType() method (it was available in jQuery 1.4.x, as well, but was temporarily removed in jQuery 1.5). 
     */
    native public void overrideMimeType(String mimeType);
    /**
     * Cancel the request. 
     *
     * @param statusText A string passed as the textStatus parameter for the done callback. Default value: "canceled"
     */
    native public void abort(String statusText);
    /**
     * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
     */
    @jsweet.lang.Name("then")
    native public <R> JQueryPromise<R> thenDoneCallbackTriFunction(jsweet.util.function.TriFunction<Object,String,JQueryXHR,R> doneCallback, jsweet.util.function.TriConsumer<JQueryXHR,String,Object> failCallback);
    /**
     * Property containing the parsed response if the response Content-Type is json
     */
    @jsweet.lang.Optional
    public Object responseJSON;
    /**
     * A function to be called if the request fails.
     */
    native public void error(JQueryXHR xhr, String textStatus, String errorThrown);
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
    native public JQueryPromise<?> always(JQueryPromiseCallback<?> alwaysCallback1, ArrayJQueryPromiseCallbackAny... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?> doneCallback1, ArrayJQueryPromiseCallbackAny... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?> failCallback1, ArrayJQueryPromiseCallbackAny... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?> progressCallback1, ArrayJQueryPromiseCallbackAny... progressCallbackN);
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter, java.util.function.Function<Object,Object> failFilter, java.util.function.Function<Object,Object> progressFilter);
    /**
     * Return a Deferred's Promise object.
     * 
     * @param target Object onto which the promise methods have to be attached
     */
    native public JQueryPromise<?> promise(Object target);
    /**
     * Cancel the request. 
     *
     * @param statusText A string passed as the textStatus parameter for the done callback. Default value: "canceled"
     */
    native public void abort();
    /**
     * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
     */
    @jsweet.lang.Name("then")
    native public <R> JQueryPromise<R> thenDoneCallbackTriFunction(jsweet.util.function.TriFunction<Object,String,JQueryXHR,R> doneCallback);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always();
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done();
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail();
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress();
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter, java.util.function.Function<Object,Object> failFilter);
    native public JQueryPromise<?> pipe(java.util.function.Function<Object,Object> doneFilter);
    native public JQueryPromise<?> pipe();
    /**
     * Return a Deferred's Promise object.
     * 
     * @param target Object onto which the promise methods have to be attached
     */
    native public JQueryPromise<?> promise();
    /**
     * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
     */
    @jsweet.lang.Name("then")
    native public <R> JQueryPromise<R> thenDoneCallbackJQueryPromiseTriFunction(jsweet.util.function.TriFunction<Object,String,JQueryXHR,JQueryPromise<R>> doneCallback, jsweet.util.function.TriConsumer<JQueryXHR,String,Object> failCallback);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always(JQueryPromiseCallback<?>[] alwaysCallback1, ArrayJQueryPromiseCallbackAny... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always(JQueryPromiseCallback<?> alwaysCallback1, ArrayJQueryPromiseCallbackAnys... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always(JQueryPromiseCallback<?>[] alwaysCallback1, ArrayJQueryPromiseCallbackAnys... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?> doneCallback1, ArrayJQueryPromiseCallbackAnys... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?>[] doneCallback1, ArrayJQueryPromiseCallbackAnys... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?>[] doneCallback1, ArrayJQueryPromiseCallbackAny... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?> failCallback1, ArrayJQueryPromiseCallbackAnys... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?>[] failCallback1, ArrayJQueryPromiseCallbackAnys... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?>[] failCallback1, ArrayJQueryPromiseCallbackAny... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?>[] progressCallback1, ArrayJQueryPromiseCallbackAnys... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?>[] progressCallback1, ArrayJQueryPromiseCallbackAny... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?> progressCallback1, ArrayJQueryPromiseCallbackAnys... progressCallbackN);
    /**
     * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
     */
    @jsweet.lang.Name("then")
    native public <R> JQueryPromise<R> thenDoneCallbackJQueryPromiseTriFunction(jsweet.util.function.TriFunction<Object,String,JQueryXHR,JQueryPromise<R>> doneCallback);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always(JQueryPromiseCallback<?> alwaysCallback1, JQueryPromiseCallback<?>... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?> doneCallback1, JQueryPromiseCallback<?>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?> failCallback1, JQueryPromiseCallback<?>... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?> progressCallback1, JQueryPromiseCallback<?>... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always(JQueryPromiseCallback<?>[] alwaysCallback1, JQueryPromiseCallback<?>... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always(JQueryPromiseCallback<?> alwaysCallback1, JQueryPromiseCallback<?>[]... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is either resolved or rejected.
     * 
     * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
     * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
     */
    native public JQueryPromise<?> always(JQueryPromiseCallback<?>[] alwaysCallback1, JQueryPromiseCallback<?>[]... alwaysCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?> doneCallback1, JQueryPromiseCallback<?>[]... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?>[] doneCallback1, JQueryPromiseCallback<?>[]... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is resolved.
     * 
     * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
     * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
     */
    native public JQueryPromise<?> done(JQueryPromiseCallback<?>[] doneCallback1, JQueryPromiseCallback<?>... doneCallbackN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?> failCallback1, JQueryPromiseCallback<?>[]... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?>[] failCallback1, JQueryPromiseCallback<?>[]... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object is rejected.
     * 
     * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
     * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
     */
    native public JQueryPromise<?> fail(JQueryPromiseCallback<?>[] failCallback1, JQueryPromiseCallback<?>... failCallbacksN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?>[] progressCallback1, JQueryPromiseCallback<?>[]... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?>[] progressCallback1, JQueryPromiseCallback<?>... progressCallbackN);
    /**
     * Add handlers to be called when the Deferred object generates progress notifications.
     * 
     * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
     */
    native public JQueryPromise<?> progress(JQueryPromiseCallback<?> progressCallback1, JQueryPromiseCallback<?>[]... progressCallbackN);
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
}

