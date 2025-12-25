package okhttp3.internal.concurrent;
public abstract class Task {
    public final String a;
    public final boolean b;
    public okhttp3.internal.concurrent.TaskQueue c;
    public long d;

    public Task(String p2, boolean p3)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        this.a = p2;
        this.b = p3;
        this.d = -1;
        return;
    }

    public abstract long a();

    public final String toString()
    {
        return this.a;
    }
}
