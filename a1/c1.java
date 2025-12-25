package a1;
public final class c1 extends android.os.FileObserver {
    public static final Object b;
    public static final java.util.LinkedHashMap c;
    public final java.util.concurrent.CopyOnWriteArrayList a;

    static c1()
    {
        a1.c1.b = new Object();
        a1.c1.c = new java.util.LinkedHashMap();
        return;
    }

    public c1(String p2)
    {
        super(p2, 128);
        super.a = new java.util.concurrent.CopyOnWriteArrayList();
        return;
    }

    public final void onEvent(int p2, String p3)
    {
        java.util.Iterator v2_1 = this.a.iterator();
        while (v2_1.hasNext()) {
            ((u7.l) v2_1.next()).invoke(p3);
        }
        return;
    }
}
