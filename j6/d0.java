package j6;
public final class d0 extends android.os.Binder {
    public final l6.c a;

    public d0(l6.c p1)
    {
        this.a = p1;
        return;
    }

    public final void a(j6.e0 p7)
    {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        } else {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            com.google.android.gms.tasks.Task v0_3 = p7.a;
            x1.d v1_3 = ((j6.g) this.a.b);
            a5.a v2_1 = new com.google.android.gms.tasks.TaskCompletionSource();
            v1_3.a.execute(new androidx.fragment.app.l(v1_3, v0_3, v2_1, 4));
            v2_1.getTask().addOnCompleteListener(new x1.d(), new a5.a(p7, 12));
            return;
        }
    }
}
