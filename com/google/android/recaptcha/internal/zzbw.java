package com.google.android.recaptcha.internal;
public final class zzbw implements d8.i0 {
    private final synthetic d8.t zza;

    public zzbw(d8.t p1)
    {
        this.zza = p1;
        return;
    }

    public final d8.q attachChild(d8.s p2)
    {
        return this.zza.attachChild(p2);
    }

    public final Object await(l7.c p2)
    {
        return ((d8.u) this.zza).h(p2);
    }

    public final synthetic void cancel()
    {
        ((d8.r1) this.zza).cancel(0);
        return;
    }

    public final void cancel(java.util.concurrent.CancellationException p2)
    {
        this.zza.cancel(p2);
        return;
    }

    public final synthetic boolean cancel(Throwable p4)
    {
        int v4_1;
        d8.r1 v0_1 = ((d8.r1) this.zza);
        v0_1.getClass();
        if (p4 == 0) {
            v4_1 = new d8.f1(v0_1.l(), 0, v0_1);
        } else {
            v4_1 = d8.r1.L(v0_1, p4);
        }
        v0_1.j(v4_1);
        return 1;
    }

    public final Object fold(Object p3, u7.p p4)
    {
        d8.r1 v0_1 = ((d8.r1) this.zza);
        v0_1.getClass();
        kotlin.jvm.internal.j.e(p4, "operation");
        return p4.invoke(p3, v0_1);
    }

    public final l7.f get(l7.g p2)
    {
        d8.r1 v0_1 = ((d8.r1) this.zza);
        v0_1.getClass();
        return q4.b.r(v0_1, p2);
    }

    public final java.util.concurrent.CancellationException getCancellationException()
    {
        return this.zza.getCancellationException();
    }

    public final a8.f getChildren()
    {
        return this.zza.getChildren();
    }

    public final Object getCompleted()
    {
        return ((d8.u) this.zza).q();
    }

    public final Throwable getCompletionExceptionOrNull()
    {
        return ((d8.r1) this.zza).getCompletionExceptionOrNull();
    }

    public final l7.g getKey()
    {
        return this.zza.getKey();
    }

    public final l8.b getOnAwait()
    {
        d8.u v0_1 = ((d8.u) this.zza);
        v0_1.getClass();
        kotlin.jvm.internal.u.a(3, d8.o1.a);
        kotlin.jvm.internal.u.a(3, d8.p1.a);
        return new k4.i(v0_1, 1);
    }

    public final l8.a getOnJoin()
    {
        ((d8.r1) this.zza).getClass();
        kotlin.jvm.internal.u.a(3, d8.q1.a);
        return new v3.f();
    }

    public final d8.e1 getParent()
    {
        int v0_2;
        int v0_1 = ((d8.r1) this.zza);
        v0_1.getClass();
        int v0_4 = ((d8.q) d8.r1.b.get(v0_1));
        if (v0_4 == 0) {
            v0_2 = 0;
        } else {
            v0_2 = v0_4.getParent();
        }
        return v0_2;
    }

    public final d8.p0 invokeOnCompletion(u7.l p2)
    {
        return this.zza.invokeOnCompletion(p2);
    }

    public final d8.p0 invokeOnCompletion(boolean p2, boolean p3, u7.l p4)
    {
        return ((d8.r1) this.zza).invokeOnCompletion(p2, p3, p4);
    }

    public final boolean isActive()
    {
        return this.zza.isActive();
    }

    public final boolean isCancelled()
    {
        return this.zza.isCancelled();
    }

    public final boolean isCompleted()
    {
        return this.zza.isCompleted();
    }

    public final Object join(l7.c p2)
    {
        return this.zza.join(p2);
    }

    public final l7.h minusKey(l7.g p2)
    {
        return this.zza.minusKey(p2);
    }

    public final d8.e1 plus(d8.e1 p2)
    {
        this.zza.getClass();
        return p2;
    }

    public final l7.h plus(l7.h p2)
    {
        return this.zza.plus(p2);
    }

    public final boolean start()
    {
        return this.zza.start();
    }
}
