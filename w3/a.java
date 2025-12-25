package w3;
public final class a {
    public final synthetic int a;
    public final com.google.android.material.sidesheet.SideSheetBehavior b;

    public synthetic a(com.google.android.material.sidesheet.SideSheetBehavior p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public static y7.d e(y7.e p2, int p3)
    {
        int v0_4;
        kotlin.jvm.internal.j.e(p2, "<this>");
        if (p3 <= null) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        int v1_1 = Integer.valueOf(p3);
        if (v0_4 == 0) {
            String v3_1 = new StringBuilder("Step must be positive, was: ");
            v3_1.append(v1_1);
            v3_1.append(46);
            throw new IllegalArgumentException(v3_1.toString());
        } else {
            if (p2.c <= 0) {
                p3 = (- p3);
            }
            return new y7.d(p2.a, p2.b, p3);
        }
    }

    public static y7.e f(int p2, int p3)
    {
        if (p3 > -2147483648) {
            return new y7.e(p2, (p3 - 1), 1);
        } else {
            return y7.e.d;
        }
    }

    public static java.util.ArrayList h(java.util.List p2)
    {
        if ((p2 != null) && (!p2.isEmpty())) {
            java.util.ArrayList v0_2 = new java.util.ArrayList();
            java.util.Iterator v2_3 = p2.iterator();
            while (v2_3.hasNext()) {
                y4.p v1_2 = w3.a.i(((com.google.android.gms.internal.firebase-auth-api.zzahy) v2_3.next()));
                if (v1_2 != null) {
                    v0_2.add(v1_2);
                }
            }
            return v0_2;
        } else {
            return new java.util.ArrayList();
        }
    }

    public static y4.p i(com.google.android.gms.internal.firebase-auth-api.zzahy p8)
    {
        if (p8 != null) {
            if (android.text.TextUtils.isEmpty(p8.zze())) {
                if (p8.zzb() == null) {
                    return 0;
                } else {
                    return new y4.z(p8.zzd(), p8.zzc(), p8.zza(), ((com.google.android.gms.internal.firebase-auth-api.zzaiz) com.google.android.gms.common.internal.Preconditions.checkNotNull(p8.zzb(), "totpInfo cannot be null.")));
                }
            } else {
                return new y4.w(p8.zza(), p8.zzd(), p8.zzc(), com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8.zze()));
            }
        } else {
            return 0;
        }
    }

    public final int a()
    {
        switch (this.a) {
            case 0:
                int v0_5 = this.b;
                return Math.max(0, (v0_5.n + v0_5.o));
            default:
                int v0_1 = this.b;
                return Math.max(0, ((v0_1.m - v0_1.l) - v0_1.o));
        }
    }

    public final int b()
    {
        switch (this.a) {
            case 0:
                int v0_1 = this.b;
                return ((- v0_1.l) - v0_1.o);
            default:
                return this.b.m;
        }
    }

    public final int c(android.view.View p2)
    {
        switch (this.a) {
            case 0:
                return (p2.getRight() + this.b.o);
            default:
                return (p2.getLeft() - this.b.o);
        }
    }

    public final int d()
    {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void g(android.view.ViewGroup$MarginLayoutParams p2, int p3)
    {
        switch (this.a) {
            case 0:
                p2.leftMargin = p3;
                return;
            default:
                p2.rightMargin = p3;
                return;
        }
    }
}
