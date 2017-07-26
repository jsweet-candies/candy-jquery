package def.jquery;
/**
 * The interface used to construct jQuery events (with $.Event). It is
 * defined separately instead of inline in JQueryStatic to allow
 * overriding the construction function with specific strings
 * returning specific event objects.
 */
@jsweet.lang.Interface
public abstract class JQueryEventConstructor extends def.js.Object {
    native public JQueryEventObject $apply(String name, Object eventProperties);
    native public JQueryEventObject $apply(String name);
}
