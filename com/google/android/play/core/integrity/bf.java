package com.google.android.play.core.integrity;
final class bf extends com.google.android.play.core.integrity.bm {
    final synthetic long a;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource b;
    final synthetic com.google.android.play.core.integrity.bn c;

    public bf(com.google.android.play.core.integrity.bn p1, com.google.android.gms.tasks.TaskCompletionSource p2, int p3, long p4, com.google.android.gms.tasks.TaskCompletionSource p6)
    {
        this.c = p1;
        this.a = p4;
        this.b = p6;
        super(p1, p2);
        return;
    }

    public final void b()
    {
        if (com.google.android.play.core.integrity.bn.k(this.c)) {
            this.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, 0));
            return;
        } else {
            try {
                android.os.RemoteException v0_1 = this.c;
                com.google.android.gms.tasks.TaskCompletionSource v1_2 = ((k4.p) v0_1.a.n);
                android.os.RemoteException v0_2 = com.google.android.play.core.integrity.bn.b(v0_1, this.a, 0);
                com.google.android.play.core.integrity.StandardIntegrityException v2_2 = new com.google.android.play.core.integrity.bl(this.c, this.b);
                com.google.android.gms.tasks.TaskCompletionSource v1_3 = ((k4.n) v1_2);
                v1_3.getClass();
                int v3_1 = android.os.Parcel.obtain();
                v3_1.writeInterfaceToken(v1_3.b);
                v3_1.writeInt(1);
                v0_2.writeToParcel(v3_1, 0);
                v3_1.writeStrongBinder(v2_2);
                v1_3.d(2, v3_1);
                return;
            } catch (android.os.RemoteException v0_5) {
                com.google.android.play.core.integrity.bn.i(this.c).a(v0_5, "warmUpIntegrityToken(%s)", new Object[] {Long.valueOf(this.a)}));
                this.b.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, v0_5));
                return;
            }
        }
    }
}
