package y4;
public final class j0 extends x1.b {
    public final synthetic String a;
    public final synthetic boolean b;
    public final synthetic y4.l c;
    public final synthetic String d;
    public final synthetic String e;
    public final synthetic com.google.firebase.auth.FirebaseAuth f;

    public j0(com.google.firebase.auth.FirebaseAuth p1, String p2, boolean p3, y4.l p4, String p5, String p6)
    {
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = p1;
        return;
    }

    public final com.google.android.gms.tasks.Task f(String p11)
    {
        q4.f v1_1 = this.a;
        if (!android.text.TextUtils.isEmpty(p11)) {
            com.google.android.gms.internal.firebase-auth-api.zzacq v0_11 = new StringBuilder("Got reCAPTCHA token for login with email ");
            v0_11.append(v1_1);
            android.util.Log.i("FirebaseAuth", v0_11.toString());
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzacq v0_3 = new StringBuilder("Logging in as ");
            v0_3.append(v1_1);
            v0_3.append(" with empty reCAPTCHA token");
            android.util.Log.i("FirebaseAuth", v0_3.toString());
        }
        q4.f v1_2 = this.f;
        if (!this.b) {
            com.google.android.gms.tasks.Task v11_1 = v1_2;
            return v1_2.e.zzb(v11_1.a, this.a, this.d, this.e, p11, new y4.f(v11_1));
        } else {
            return v1_2.e.zzb(v1_2.a, ((y4.l) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.c)), this.a, this.d, this.e, p11, new y4.g(v1_2, 0));
        }
    }
}
