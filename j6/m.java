package j6;
public final synthetic class m implements com.google.android.gms.tasks.OnSuccessListener {
    public final synthetic int a;
    public final synthetic com.google.firebase.messaging.FirebaseMessaging b;

    public synthetic m(com.google.firebase.messaging.FirebaseMessaging p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onSuccess(Object p5)
    {
        switch (this.a) {
            case 0:
                if ((this.b.e.b()) && ((((j6.z) p5).h.a() != null) && (!((j6.z) p5).g))) {
                    ((j6.z) p5).f(0);
                }
                return;
            default:
                long v0_5 = this.b;
                if (((com.google.android.gms.cloudmessaging.CloudMessage) p5) != null) {
                    a.a.J(((com.google.android.gms.cloudmessaging.CloudMessage) p5).getIntent());
                    ((com.google.android.gms.cloudmessaging.Rpc) v0_5.c.c).getProxiedNotificationData().addOnSuccessListener(v0_5.f, new j6.m(v0_5, 1));
                }
                return;
        }
    }
}
