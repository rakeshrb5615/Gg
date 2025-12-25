package n6;
public final synthetic class g implements com.google.android.gms.tasks.Continuation {
    public final synthetic n6.i a;
    public final synthetic com.google.android.gms.tasks.Task b;
    public final synthetic com.google.android.gms.tasks.Task c;
    public final synthetic java.util.Date d;
    public final synthetic java.util.HashMap e;

    public synthetic g(n6.i p1, com.google.android.gms.tasks.Task p2, com.google.android.gms.tasks.Task p3, java.util.Date p4, java.util.HashMap p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final Object then(com.google.android.gms.tasks.Task p8)
    {
        com.google.android.gms.tasks.Task v8_0 = this.a;
        a5.a v2_3 = this.b;
        if (v2_3.isSuccessful()) {
            int v3_6 = this.c;
            if (v3_6.isSuccessful()) {
                n6.h v0_1 = v8_0.a(((String) v2_3.getResult()), ((d6.a) v3_6.getResult()).a, this.d, this.e);
                if (v0_1.a == 0) {
                    com.google.android.gms.tasks.Task v1_2 = v8_0.f;
                    a5.a v2_2 = v0_1.b;
                    int v3_3 = v1_2.a;
                    return com.google.android.gms.tasks.Tasks.call(v3_3, new j6.h(2, v1_2, v2_2)).onSuccessTask(v3_3, new a5.u(5, v1_2, v2_2)).onSuccessTask(v8_0.c, new a5.a(v0_1, 14));
                } else {
                    return com.google.android.gms.tasks.Tasks.forResult(v0_1);
                }
            } else {
                return com.google.android.gms.tasks.Tasks.forException(new m6.c("Firebase Installations failed to get installation auth token for fetch.", v3_6.getException()));
            }
        } else {
            return com.google.android.gms.tasks.Tasks.forException(new m6.c("Firebase Installations failed to get installation ID for fetch.", v2_3.getException()));
        }
    }
}
