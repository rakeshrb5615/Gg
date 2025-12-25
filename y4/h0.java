package y4;
public final class h0 extends x1.b {
    public final synthetic y4.l a;
    public final synthetic y4.d b;
    public final synthetic z4.d c;

    public h0(z4.d p1, y4.l p2, y4.d p3)
    {
        this.a = p2;
        this.b = p3;
        this.c = p1;
        return;
    }

    public final com.google.android.gms.tasks.Task f(String p8)
    {
        if (!android.text.TextUtils.isEmpty(p8)) {
            android.util.Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        } else {
            android.util.Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        }
        z4.d v0_3 = this.c;
        return v0_3.e.zza(v0_3.a, this.a, this.b, p8, new y4.g(v0_3, 0));
    }
}
