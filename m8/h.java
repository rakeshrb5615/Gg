package m8;
public abstract class h {
    public static final int a;
    public static final d4.l b;
    public static final d4.l c;
    public static final d4.l d;
    public static final d4.l e;
    public static final int f;

    static h()
    {
        m8.h.a = i8.a.j(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
        m8.h.b = new d4.l("PERMIT", 4, 0);
        m8.h.c = new d4.l("TAKEN", 4, 0);
        m8.h.d = new d4.l("BROKEN", 4, 0);
        m8.h.e = new d4.l("CANCELLED", 4, 0);
        m8.h.f = i8.a.j(16, 12, "kotlinx.coroutines.semaphore.segmentSize");
        return;
    }
}
