package def.jquery;
import def.js.Function;
/**
 * Interface for the JQuery callback
 */
@jsweet.lang.Interface
public abstract class JQueryCallback extends def.js.Object {
    /**
     * Add a callback or a collection of callbacks to a callback list.
     * 
     * @param callbacks A function, or array of functions, that are to be added to the callback list.
     */
    native public JQueryCallback add(Function callbacks);
    /**
     * Add a callback or a collection of callbacks to a callback list.
     * 
     * @param callbacks A function, or array of functions, that are to be added to the callback list.
     */
    native public JQueryCallback add(Function[] callbacks);
    /**
     * Disable a callback list from doing anything more.
     */
    native public JQueryCallback disable();
    /**
     * Determine if the callbacks list has been disabled.
     */
    native public Boolean disabled();
    /**
     * Remove all of the callbacks from a list.
     */
    native public JQueryCallback empty();
    /**
     * Call all of the callbacks with the given arguments
     * 
     * @param arguments The argument or list of arguments to pass back to the callback list.
     */
    native public JQueryCallback fire(Object... arguments);
    /**
     * Determine if the callbacks have already been called at least once.
     */
    native public Boolean fired();
    /**
     * Call all callbacks in a list with the given context and arguments.
     * 
     * @param context A reference to the context in which the callbacks in the list should be fired.
     * @param arguments An argument, or array of arguments, to pass to the callbacks in the list.
     */
    native public JQueryCallback fireWith(Object context, Object[] args);
    /**
     * Determine whether a supplied callback is in a list
     * 
     * @param callback The callback to search for.
     */
    native public Boolean has(Function callback);
    /**
     * Lock a callback list in its current state.
     */
    native public JQueryCallback lock();
    /**
     * Determine if the callbacks list has been locked.
     */
    native public Boolean locked();
    /**
     * Remove a callback or a collection of callbacks from a callback list.
     * 
     * @param callbacks A function, or array of functions, that are to be removed from the callback list.
     */
    native public JQueryCallback remove(Function callbacks);
    /**
     * Remove a callback or a collection of callbacks from a callback list.
     * 
     * @param callbacks A function, or array of functions, that are to be removed from the callback list.
     */
    native public JQueryCallback remove(Function[] callbacks);
    /**
     * Call all callbacks in a list with the given context and arguments.
     * 
     * @param context A reference to the context in which the callbacks in the list should be fired.
     * @param arguments An argument, or array of arguments, to pass to the callbacks in the list.
     */
    native public JQueryCallback fireWith(Object context);
    /**
     * Call all callbacks in a list with the given context and arguments.
     * 
     * @param context A reference to the context in which the callbacks in the list should be fired.
     * @param arguments An argument, or array of arguments, to pass to the callbacks in the list.
     */
    native public JQueryCallback fireWith();
}

