package y4;
public final class g implements z4.j, z4.y {
    public final synthetic int a;
    public final synthetic com.google.firebase.auth.FirebaseAuth b;

    public g(com.google.firebase.auth.FirebaseAuth p1, int p2)
    {
        this.a = p2;
        switch (p2) {
            case 1:
                this.b = p1;
                return;
            default:
                java.util.Objects.requireNonNull(p1);
                this.b = p1;
                return;
        }
    }

    public final void a(com.google.android.gms.internal.firebase-auth-api.zzahv p3, y4.l p4)
    {
        switch (this.a) {
            case 0:
                com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
                ((z4.e) p4).getClass();
                ((z4.e) p4).a = ((com.google.android.gms.internal.firebase-auth-api.zzahv) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
                com.google.firebase.auth.FirebaseAuth v0_1 = this.b;
                v0_1.getClass();
                com.google.firebase.auth.FirebaseAuth.c(v0_1, p4, p3, 1, 1);
                return;
            default:
                com.google.firebase.auth.FirebaseAuth v0_2 = this.b;
                v0_2.getClass();
                com.google.firebase.auth.FirebaseAuth.c(v0_2, p4, p3, 1, 1);
                return;
        }
    }

    public final void zza(com.google.android.gms.common.api.Status p3)
    {
        switch (this.a) {
            case 0:
                if ((p3.getStatusCode() == 17011) || ((p3.getStatusCode() == 17021) || ((p3.getStatusCode() == 17005) || (p3.getStatusCode() == 17091)))) {
                    this.b.a();
                }
                return;
            default:
                int v3_3 = p3.getStatusCode();
                if ((v3_3 == 17011) || ((v3_3 == 17021) || (v3_3 == 17005))) {
                    this.b.a();
                }
                return;
        }
    }
}
