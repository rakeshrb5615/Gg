package j6;
public final synthetic class i implements com.google.android.gms.tasks.Continuation {
    public final synthetic android.content.Context a;
    public final synthetic android.content.Intent b;
    public final synthetic boolean c;

    public synthetic i(android.content.Context p1, android.content.Intent p2, boolean p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object then(com.google.android.gms.tasks.Task p4)
    {
        if ((com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) && (((Integer) p4.getResult()).intValue() == 402)) {
            p4 = j6.j.a(this.a, this.b, this.c).continueWith(new x1.d(), new a5.t(20));
        }
        return p4;
    }
}
