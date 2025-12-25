package com.google.android.play.core.integrity;
final class af extends k4.a0 {
    final synthetic byte[] a;
    final synthetic Long b;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource c;
    final synthetic com.google.android.play.core.integrity.IntegrityTokenRequest d;
    final synthetic com.google.android.play.core.integrity.aj e;

    public af(com.google.android.play.core.integrity.aj p1, com.google.android.gms.tasks.TaskCompletionSource p2, byte[] p3, Long p4, android.os.Parcelable p5, com.google.android.gms.tasks.TaskCompletionSource p6, com.google.android.play.core.integrity.IntegrityTokenRequest p7)
    {
        this.e = p1;
        this.a = p3;
        this.b = p4;
        this.c = p6;
        this.d = p7;
        super(p2);
        return;
    }

    public final void a(Exception p3)
    {
        if (!(p3 instanceof k4.e)) {
            super.a(p3);
            return;
        } else {
            super.a(new com.google.android.play.core.integrity.IntegrityServiceException(-9, p3));
            return;
        }
    }

    public final void b()
    {
        try {
            android.os.RemoteException v0_0 = this.e;
            com.google.android.gms.tasks.TaskCompletionSource v1_4 = ((k4.u) v0_0.a.n);
            android.os.RemoteException v0_3 = com.google.android.play.core.integrity.aj.a(v0_0, this.a, this.b, 0);
            com.google.android.play.core.integrity.IntegrityServiceException v2_0 = new com.google.android.play.core.integrity.ai(this.e, this.c);
            com.google.android.gms.tasks.TaskCompletionSource v1_1 = ((k4.s) v1_4);
            v1_1.getClass();
            int v3_1 = android.os.Parcel.obtain();
            v3_1.writeInterfaceToken(v1_1.b);
            v3_1.writeInt(1);
            v0_3.writeToParcel(v3_1, 0);
            v3_1.writeStrongBinder(v2_0);
            v1_1.d(2, v3_1);
            return;
        } catch (android.os.RemoteException v0_2) {
            com.google.android.play.core.integrity.aj.f(this.e).a(v0_2, "requestIntegrityToken(%s)", new Object[] {this.d}));
            this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, v0_2));
            return;
        }
    }
}
