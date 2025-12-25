package com.google.android.play.core.integrity;
final class ag extends k4.a0 {
    final synthetic android.os.Bundle a;
    final synthetic android.app.Activity b;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource c;
    final synthetic int d;
    final synthetic com.google.android.play.core.integrity.aj e;

    public ag(com.google.android.play.core.integrity.aj p1, com.google.android.gms.tasks.TaskCompletionSource p2, android.os.Bundle p3, android.app.Activity p4, com.google.android.gms.tasks.TaskCompletionSource p5, int p6)
    {
        this.e = p1;
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
        super(p2);
        return;
    }

    public final void b()
    {
        try {
            android.os.RemoteException v0_0 = this.e;
            com.google.android.gms.tasks.TaskCompletionSource v1_4 = ((k4.u) v0_0.a.n);
            com.google.android.play.core.integrity.IntegrityServiceException v2_4 = this.a;
            android.os.RemoteException v0_1 = com.google.android.play.core.integrity.aj.e(v0_0).a(this.b, this.c, v0_0.a);
            com.google.android.gms.tasks.TaskCompletionSource v1_1 = ((k4.s) v1_4);
            v1_1.getClass();
            int v3_0 = android.os.Parcel.obtain();
            v3_0.writeInterfaceToken(v1_1.b);
            v3_0.writeInt(1);
            v2_4.writeToParcel(v3_0, 0);
            v3_0.writeStrongBinder(v0_1);
            v1_1.d(3, v3_0);
            return;
        } catch (android.os.RemoteException v0_3) {
            com.google.android.play.core.integrity.aj.f(this.e).a(v0_3, "requestAndShowDialog(%s)", new Object[] {Integer.valueOf(this.d)}));
            this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, v0_3));
            return;
        }
    }
}
