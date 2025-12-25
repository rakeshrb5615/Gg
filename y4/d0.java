package y4;
public final class d0 extends x1.b {
    public final synthetic boolean a;
    public final synthetic y4.l b;
    public final synthetic y4.d c;
    public final synthetic com.google.firebase.auth.FirebaseAuth d;

    public d0(com.google.firebase.auth.FirebaseAuth p1, boolean p2, y4.l p3, y4.d p4)
    {
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p1;
        return;
    }

    public final com.google.android.gms.tasks.Task f(String p8)
    {
        if (!android.text.TextUtils.isEmpty(p8)) {
            android.util.Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        } else {
            android.util.Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        }
        y4.d v4 = this.c;
        q4.f v1_0 = this.d;
        if (!this.a) {
            com.google.android.gms.internal.firebase-auth-api.zzacq v0_1 = v1_0;
            return v0_1.e.zza(v0_1.a, v4, p8, new y4.f(v0_1));
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzacq v0_2 = v1_0;
            return v0_2.e.zzb(v0_2.a, ((y4.l) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.b)), v4, p8, new y4.g(v0_2, 0));
        }
    }
}
