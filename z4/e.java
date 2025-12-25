package z4;
public final class e extends y4.l {
    public static final android.os.Parcelable$Creator CREATOR;
    public com.google.android.gms.internal.firebase-auth-api.zzahv a;
    public z4.c b;
    public String c;
    public String d;
    public java.util.ArrayList e;
    public java.util.ArrayList f;
    public String m;
    public Boolean n;
    public z4.f o;
    public boolean p;
    public y4.g0 q;
    public z4.o r;
    public java.util.List s;

    static e()
    {
        z4.e.CREATOR = new z4.b(1);
        return;
    }

    public e(q4.f p1, java.util.ArrayList p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        p1.a();
        this.c = p1.b;
        this.d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.m = "2";
        this.z(p2);
        return;
    }

    public final void A(java.util.ArrayList p7)
    {
        z4.o v7_2;
        if (!p7.isEmpty()) {
            java.util.ArrayList v0_2 = new java.util.ArrayList();
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            int v2 = p7.size();
            int v3 = 0;
            while (v3 < v2) {
                y4.z v4_0 = p7.get(v3);
                v3++;
                y4.z v4_1 = ((y4.p) v4_0);
                if (!(v4_1 instanceof y4.w)) {
                    if ((v4_1 instanceof y4.z)) {
                        v1_1.add(((y4.z) v4_1));
                    }
                } else {
                    v0_2.add(((y4.w) v4_1));
                }
            }
            v7_2 = new z4.o(v0_2, v1_1);
        } else {
            v7_2 = 0;
        }
        this.r = v7_2;
        return;
    }

    public final String s()
    {
        return this.b.b;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.a, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.b, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.d, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 5, this.e, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p5, 6, this.f, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.m, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(p5, 8, Boolean.valueOf(this.y()), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 9, this.o, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 10, this.p);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 11, this.q, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 12, this.r, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 13, this.s, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final String x()
    {
        String v0_0 = this.a;
        if ((v0_0 != null) && (v0_0.zzc() != null)) {
            String v0_5 = ((java.util.Map) ((java.util.Map) z4.n.a(this.a.zzc()).b).get("firebase"));
            if (v0_5 != null) {
                return ((String) v0_5.get("tenant"));
            }
        }
        return 0;
    }

    public final boolean y()
    {
        Boolean v0_0 = this.n;
        if ((v0_0 == null) || (v0_0.booleanValue())) {
            Boolean v0_6;
            Boolean v0_13 = this.a;
            if (v0_13 == null) {
                v0_6 = "";
            } else {
                Boolean v0_5 = ((java.util.Map) ((java.util.Map) z4.n.a(v0_13.zzc()).b).get("firebase"));
                if (v0_5 == null) {
                    v0_6 = 0;
                } else {
                    v0_6 = ((String) v0_5.get("sign_in_provider"));
                }
            }
            int v2 = 1;
            if ((this.e.size() > 1) || ((v0_6 != null) && (v0_6.equals("custom")))) {
                v2 = 0;
            }
            this.n = Boolean.valueOf(v2);
        }
        return this.n.booleanValue();
    }

    public final declared_synchronized z4.e z(java.util.List p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.e = new java.util.ArrayList(p6.size());
        this.f = new java.util.ArrayList(p6.size());
        int v1_0 = 0;
        while (v1_0 < p6.size()) {
            z4.c v2_2 = ((y4.b0) p6.get(v1_0));
            if (!v2_2.s().equals("firebase")) {
                this.f.add(v2_2.s());
            } else {
                this.b = ((z4.c) v2_2);
            }
            this.e.add(((z4.c) v2_2));
            v1_0++;
        }
        if (this.b == null) {
            this.b = ((z4.c) this.e.get(0));
        }
        return this;
    }
}
