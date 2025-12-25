package x1;
public abstract class b {

    public static final java.io.File a(android.content.Context p2, String p3)
    {
        kotlin.jvm.internal.j.e(p3, "fileName");
        return new java.io.File(p2.getApplicationContext().getFilesDir(), "datastore/".concat(p3));
    }

    public abstract Object b();

    public abstract Object c();

    public abstract Object d();

    public com.google.android.gms.tasks.Task e(com.google.firebase.auth.FirebaseAuth p8, String p9, com.google.android.recaptcha.RecaptchaAction p10)
    {
        j6.o v5_1 = new j6.o(24, 0);
        v5_1.b = this;
        a5.z v3 = p8.j;
        if (v3 != null) {
            int v0_2;
            com.google.android.gms.tasks.Task v2_1 = ((com.google.android.gms.internal.firebase-auth-api.zzahs) v3.c);
            if ((v2_1 == null) || (!v2_1.zzc("EMAIL_PASSWORD_PROVIDER"))) {
                v0_2 = 0;
            } else {
                v0_2 = 1;
            }
            if (v0_2 != 0) {
                return v3.w(p9, Boolean.FALSE, p10).continueWithTask(v5_1).continueWithTask(new j6.s(p9, v3, p10, v5_1, 18));
            }
        }
        com.google.android.gms.tasks.Task v9_2 = this.f(0);
        j6.s v10_2 = new j6.s(17, 0);
        v10_2.c = p10;
        v10_2.d = p8;
        v10_2.b = p9;
        v10_2.e = v5_1;
        return v9_2.continueWithTask(v10_2);
    }

    public abstract com.google.android.gms.tasks.Task f();
}
