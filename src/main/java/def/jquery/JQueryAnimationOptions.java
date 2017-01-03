package def.jquery;
import def.js.Function;
@jsweet.lang.Interface
public abstract class JQueryAnimationOptions extends def.js.Object {
    /**
     * A string or number determining how long the animation will run.
     */
    @jsweet.lang.Optional
    public Object duration;
    /**
     * A string indicating which easing function to use for the transition.
     */
    @jsweet.lang.Optional
    public String easing;
    /**
     * A function to call once the animation is complete.
     */
    @jsweet.lang.Optional
    public Function complete;
    /**
     * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Double,Object,Object> step;
    /**
     * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties. (version added: 1.8)
     */
    @jsweet.lang.Optional
    public jsweet.util.function.TriFunction<JQueryPromise<?>,Double,Double,Object> progress;
    /**
     * A function to call when the animation begins. (version added: 1.8)
     */
    @jsweet.lang.Optional
    public java.util.function.Function<JQueryPromise<?>,Object> start;
    /**
     * A function to be called when the animation completes (its Promise object is resolved). (version added: 1.8)
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<JQueryPromise<?>,Boolean,Object> done;
    /**
     * A function to be called when the animation fails to complete (its Promise object is rejected). (version added: 1.8)
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<JQueryPromise<?>,Boolean,Object> fail;
    /**
     * A function to be called when the animation completes or stops without completing (its Promise object is either resolved or rejected). (version added: 1.8)
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<JQueryPromise<?>,Boolean,Object> always;
    /**
     * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
     */
    @jsweet.lang.Optional
    public Object queue;
    /**
     * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions. (version added: 1.4)
     */
    @jsweet.lang.Optional
    public Object specialEasing;
    native public java.lang.Object complete(java.lang.Object... args);
}

