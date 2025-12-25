package com.google.android.play.core.integrity;
final class bh extends com.google.android.play.core.integrity.bm {
    final synthetic android.os.Bundle a;
    final synthetic android.app.Activity b;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource c;
    final synthetic int d;
    final synthetic com.google.android.play.core.integrity.bn e;

    public bh(com.google.android.play.core.integrity.bn p1, com.google.android.gms.tasks.TaskCompletionSource p2, android.os.Bundle p3, android.app.Activity p4, com.google.android.gms.tasks.TaskCompletionSource p5, int p6)
    {
        this.e = p1;
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
        super(p1, p2);
        return;
    }

    public final void b()
    {
        if (!com.google.android.play.core.integrity.bn.k(this.e)) {
            try {
                android.os.RemoteException v0_6 = this.e;
                com.google.android.gms.tasks.TaskCompletionSource v1_5 = v0_6.a;
                com.google.android.play.core.integrity.StandardIntegrityException v2_8 = ((k4.p) v1_5.n);
                int v3_2 = this.a;
                android.os.RemoteException v0_2 = com.google.android.play.core.integrity.bn.h(v0_6).a(this.b, this.c, v1_5);
                com.google.android.play.core.integrity.StandardIntegrityException v2_0 = ((k4.n) v2_8);
                v2_0.getClass();
                com.google.android.gms.tasks.TaskCompletionSource v1_0 = android.os.Parcel.obtain();
                v1_0.writeInterfaceToken(v2_0.b);
                v1_0.writeInt(1);
                v3_2.writeToParcel(v1_0, 0);
                v1_0.writeStrongBinder(v0_2);
                v2_0.d(6, v1_0);
                return;
            } catch (android.os.RemoteException v0_5) {
                com.google.android.play.core.integrity.bn.i(this.e).a(v0_5, "requestAndShowDialog(%s)", new Object[] {Integer.valueOf(this.d)}));
                this.c.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, v0_5));
                return;
            }
        } else {
            this.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, 0));
            return;
        }
    }
}
