package okhttp3;
public interface Call implements java.lang.Cloneable {

    public abstract okhttp3.Request c();

    public abstract void cancel();

    public abstract void i();

    public abstract boolean isCanceled();
}
