package def.jquery;
import def.dom.Event;
import def.dom.Element;
/**
 * Interface of the JQuery extension of the W3C event object
 */
@jsweet.lang.Interface
public abstract class BaseJQueryEventObject extends Event {
    public Element currentTarget;
    public Object data;
    public Element delegateTarget;
    native public Boolean isDefaultPrevented();
    native public Boolean isImmediatePropagationStopped();
    native public Boolean isPropagationStopped();
    public String namespace;
    public Event originalEvent;
    native public void preventDefault();
    public Element relatedTarget;
    public Object result;
    native public void stopImmediatePropagation();
    native public void stopPropagation();
    public Element target;
    public double pageX;
    public double pageY;
    public double which;
    public Boolean metaKey;
}

