package d4;
public final synthetic class n implements android.os.IBinder$DeathRecipient {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic n(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void binderDied()
    {
        switch (this.a) {
            case 0:
                Throwable v0_10 = ((d4.r) this.b);
                int v3_2 = 0;
                com.google.android.gms.tasks.TaskCompletionSource v4_7 = new Object[0];
                v0_10.b.h("reportBinderDeath", v4_7);
                if (v0_10.i.get() != null) {
                    throw new ClassCastException();
                } else {
                    v0_10.b.h("%s : Binder has died.", new Object[] {v0_10.c}));
                    Object v1_14 = v0_10.d;
                    int v2_10 = v1_14.size();
                    while (v3_2 < v2_10) {
                        com.google.android.gms.tasks.TaskCompletionSource v4_10 = v1_14.get(v3_2);
                        v3_2++;
                        com.google.android.gms.tasks.TaskCompletionSource v4_11 = ((d4.m) v4_10);
                        String v5_7 = new android.os.RemoteException(String.valueOf(v0_10.c).concat(" : Binder has died."));
                        com.google.android.gms.tasks.TaskCompletionSource v4_12 = v4_11.a;
                        if (v4_12 != null) {
                            v4_12.trySetException(v5_7);
                        }
                    }
                    v0_10.d.clear();
                    try {
                        v0_10.d();
                        return;
                    } catch (Throwable v0_13) {
                        throw v0_13;
                    }
                }
            case 1:
                Throwable v0_7 = ((i4.h) this.b);
                int v3_1 = 0;
                com.google.android.gms.tasks.TaskCompletionSource v4_9 = new Object[0];
                v0_7.b.g("reportBinderDeath", v4_9);
                if (v0_7.i.get() != null) {
                    throw new ClassCastException();
                } else {
                    v0_7.b.g("%s : Binder has died.", new Object[] {v0_7.c}));
                    Object v1_7 = v0_7.d;
                    int v2_5 = v1_7.size();
                    while (v3_1 < v2_5) {
                        com.google.android.gms.tasks.TaskCompletionSource v4_4 = v1_7.get(v3_1);
                        v3_1++;
                        com.google.android.gms.tasks.TaskCompletionSource v4_5 = ((i4.e) v4_4);
                        android.os.RemoteException v7_3 = new android.os.RemoteException(String.valueOf(v0_7.c).concat(" : Binder has died."));
                        com.google.android.gms.tasks.TaskCompletionSource v4_6 = v4_5.a;
                        if (v4_6 != null) {
                            v4_6.trySetException(v7_3);
                        }
                    }
                    v0_7.d.clear();
                    try {
                        v0_7.c();
                        return;
                    } catch (Throwable v0_8) {
                        throw v0_8;
                    }
                }
            default:
                Throwable v0_15 = ((k4.d) this.b);
                int v3_0 = 0;
                com.google.android.gms.tasks.TaskCompletionSource v4_13 = new Object[0];
                v0_15.b.b("reportBinderDeath", v4_13);
                if (v0_15.j.get() != null) {
                    throw new ClassCastException();
                } else {
                    v0_15.b.b("%s : Binder has died.", new Object[] {v0_15.c}));
                    Object v1_4 = v0_15.d;
                    int v2_2 = v1_4.size();
                    while (v3_0 < v2_2) {
                        com.google.android.gms.tasks.TaskCompletionSource v4_1 = v1_4.get(v3_0);
                        v3_0++;
                        ((k4.a0) v4_1).a(new android.os.RemoteException(String.valueOf(v0_15.c).concat(" : Binder has died.")));
                    }
                    v0_15.d.clear();
                    try {
                        v0_15.e();
                        return;
                    } catch (Throwable v0_3) {
                        throw v0_3;
                    }
                }
        }
    }
}
