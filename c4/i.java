package c4;
public abstract class i extends d4.d implements d4.i {
    public final d4.l b;
    public final com.google.android.gms.tasks.TaskCompletionSource c;
    public final synthetic c4.l d;

    public i(c4.l p1, d4.l p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        this.d = p1;
        super(0);
        super.attachInterface(super, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        super.b = p2;
        super.c = p3;
        return;
    }

    public void a(android.os.Bundle p3)
    {
        this.d.a.c(this.c);
        Object[] v3_3 = new Object[0];
        this.b.h("onRequestInfo", v3_3);
        return;
    }

    public void zzb(android.os.Bundle p3)
    {
        this.d.a.c(this.c);
        Object[] v3_3 = new Object[0];
        this.b.h("onCompleteUpdate", v3_3);
        return;
    }
}
