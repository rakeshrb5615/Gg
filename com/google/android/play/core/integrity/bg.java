package com.google.android.play.core.integrity;
final class bg extends com.google.android.play.core.integrity.bm {
    final synthetic String a;
    final synthetic long b;
    final synthetic long c;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource d;
    final synthetic com.google.android.play.core.integrity.bn e;

    public bg(com.google.android.play.core.integrity.bn p1, com.google.android.gms.tasks.TaskCompletionSource p2, int p3, String p4, long p5, long p7, com.google.android.gms.tasks.TaskCompletionSource p9)
    {
        this.e = p1;
        this.a = p4;
        this.b = p5;
        this.c = p7;
        this.d = p9;
        super(p1, p2);
        return;
    }

    public final void b()
    {
        if (com.google.android.play.core.integrity.bn.k(this.e)) {
            this.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, 0));
            return;
        } else {
            try {
                com.google.android.gms.tasks.TaskCompletionSource v1_0 = this.e;
                android.os.RemoteException v0_3 = ((k4.p) v1_0.a.n);
                com.google.android.gms.tasks.TaskCompletionSource v1_1 = com.google.android.play.core.integrity.bn.a(v1_0, this.a, this.b, this.c, 0);
                com.google.android.play.core.integrity.StandardIntegrityException v2_2 = new com.google.android.play.core.integrity.bk(this.e, this.d, this.b);
                android.os.RemoteException v0_5 = ((k4.n) v0_3);
                v0_5.getClass();
                int v3_2 = android.os.Parcel.obtain();
                v3_2.writeInterfaceToken(v0_5.b);
                v3_2.writeInt(1);
                v1_1.writeToParcel(v3_2, 0);
                v3_2.writeStrongBinder(v2_2);
                v0_5.d(3, v3_2);
                return;
            } catch (android.os.RemoteException v0_7) {
                com.google.android.play.core.integrity.bn.i(this.e).a(v0_7, "requestExpressIntegrityToken(%s, %s)", new Object[] {this.a, Long.valueOf(this.b)}));
                this.d.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, v0_7));
                return;
            }
        }
    }
}
