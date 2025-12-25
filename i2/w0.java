package i2;
public final class w0 implements java.io.Serializable {
    public final boolean[] A;
    public final android.content.SharedPreferences a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final java.util.HashSet w;
    public final java.util.HashSet x;
    public final android.content.Context y;
    public final String[] z;

    public w0(android.content.Context p45, android.content.SharedPreferences p46)
    {
        i2.w0 v0_1 = ;
java.util.List v1_33 = new String[2];
        v0_1.z = v1_33;
        java.util.List v1_45 = new boolean[5];
        v0_1.A = v1_45;
        v0_1.a = p46;
        v0_1.y = p45;
        v0_1.b = p45.getResources().getString(2131952478);
        v0_1.c = p45.getResources().getString(2131951751);
        v0_1.d = p45.getResources().getString(2131952363);
        v0_1.e = p45.getResources().getString(2131951743);
        v0_1.f = p45.getResources().getString(2131952216);
        v0_1.m = p45.getResources().getString(2131951755);
        String v4 = p45.getResources().getString(2131952261);
        v0_1.n = v4;
        java.util.HashSet v2_43 = p45.getResources().getString(2131952347);
        v0_1.o = v2_43;
        v0_1.s = p45.getResources().getString(2131952392);
        java.util.List v3_13 = p45.getResources().getString(2131952393);
        v0_1.t = v3_13;
        v0_1.u = p45.getResources().getString(2131952205);
        v0_1.p = p45.getResources().getString(2131952087);
        v0_1.q = p45.getResources().getString(2131951856);
        p45.getResources().getString(2131951816);
        v0_1.v = p45.getResources().getString(2131952263);
        v0_1.r = p45.getResources().getString(2131951809);
        p45.getResources().getString(2131952227);
        String v29 = p45.getResources().getString(2131952229);
        p45.getResources().getString(2131952228);
        p45.getResources().getString(2131952219);
        p45.getResources().getString(2131952394);
        String v30 = p45.getResources().getString(2131951705);
        p45.getResources().getString(2131951704);
        p45.getResources().getString(2131951860);
        p45.getResources().getString(2131952221);
        p45.getResources().getString(2131951942);
        p45.getResources().getString(2131951859);
        p45.getResources().getString(2131951878);
        p45.getResources().getString(2131952222);
        p45.getResources().getString(2131951944);
        p45.getResources().getString(2131952098);
        p45.getResources().getString(2131952097);
        p45.getResources().getString(2131951880);
        String v46_1 = v2_43;
        p45.getResources().getString(2131951879);
        p45.getResources().getString(2131951943);
        p45.getResources().getString(2131952089);
        p45.getResources().getString(2131951947);
        p45.getResources().getString(2131952093);
        String v32 = p45.getResources().getString(2131952224);
        String v33 = p45.getResources().getString(2131951949);
        p45.getResources().getString(2131952226);
        String v35 = p45.getResources().getString(2131952099);
        String v36 = p45.getResources().getString(2131952220);
        String v37 = p45.getResources().getString(2131951881);
        p45.getResources().getString(2131951887);
        p45.getResources().getString(2131951945);
        p45.getResources().getString(2131952090);
        p45.getResources().getString(2131952429);
        p45.getResources().getString(2131951948);
        p45.getResources().getString(2131952094);
        String v39 = p45.getResources().getString(2131951950);
        String v40 = p45.getResources().getString(2131952095);
        String v41 = p45.getResources().getString(2131951946);
        String v42 = p45.getResources().getString(2131952092);
        p45.getResources().getString(2131952223);
        p45.getResources().getString(2131952091);
        p45.getResources().getString(2131952225);
        p45.getResources().getString(2131952096);
        v0_1.w = new java.util.HashSet(java.util.Arrays.asList(new String[] {v4, v3_13})));
        String v6 = v29;
        String v14 = v30;
        String v7 = v32;
        String v8 = v33;
        String v10 = v35;
        String v11 = v36;
        String v12 = v37;
        String v15 = v39;
        String v16 = v40;
        String v20 = v41;
        v0_1.x = new java.util.HashSet(java.util.Arrays.asList(new String[] {v46_1, v42})));
        return;
    }

    public final String[] a()
    {
        int v2_0 = this.a;
        String[] v1_1 = this.z;
        v1_1[0] = v2_0.getString(this.b, this.r);
        v1_1[1] = v2_0.getString(this.c, "0");
        if ((v1_1[0].equals(this.v.toLowerCase())) && (v2_0.getBoolean(this.y.getString(2131952274), 0))) {
            String v0_8 = new java.util.ArrayList();
            v0_8.add(this.d);
            v0_8.add(this.e);
            v0_8.add(this.f);
            v0_8.add(this.m);
            v0_8.add(this.n);
            v0_8.add(this.o);
            v0_8.add(this.s);
            v0_8.add(this.t);
            v0_8.add(this.u);
            v0_8.add(this.p);
            v1_1[0] = ((String) v0_8.get(i2.k0.a.nextInt(v0_8.size())));
        }
        return v1_1;
    }

    public final boolean[] b(boolean p9)
    {
        String v0_0 = this.z;
        if (v0_0[0] == null) {
            this.a();
        }
        String v2_3;
        String v2_13 = v0_0[0].toLowerCase();
        android.content.SharedPreferences v4_0 = this.q;
        int v5_2 = this.p;
        int v6 = 1;
        if ((v2_13.contains(this.d.toLowerCase())) || ((v2_13.contains(this.e.toLowerCase())) || ((v2_13.contains(this.f.toLowerCase())) || ((v2_13.contains(this.m.toLowerCase())) || ((v2_13.contains(v5_2.toLowerCase())) || (v2_13.contains(v4_0.toLowerCase()))))))) {
            v2_3 = 0;
        } else {
            v2_3 = 1;
        }
        String v3_14 = this.A;
        v3_14[0] = v2_3;
        v3_14[1] = this.w.contains(v0_0[0]);
        v3_14[2] = this.x.contains(v0_0[0]);
        if ((!v0_0[0].contains(v5_2)) && (!v0_0[0].contains(this.o))) {
            v6 = 0;
        }
        v3_14[3] = v6;
        v3_14[4] = v0_0[0].contains(v4_0);
        android.content.SharedPreferences v4_1 = this.a;
        if (v4_1.getString(this.b, this.r).equalsIgnoreCase(this.v)) {
            String v2_18 = this.y;
            if ((v4_1.getBoolean(v2_18.getString(2131952274), 0)) && (p9 != 0)) {
                int v9_3 = i2.k0.a;
                String v0_12 = v9_3.nextInt(100);
                int v1_1 = v9_3.nextInt(30);
                int v9_2 = (v9_3.nextInt(130) - 65);
                c4.b.Q(v4_1, v2_18.getString(2131951749), v0_12);
                c4.b.Q(v4_1, "precipitationAmountKey", v1_1);
                c4.b.Q(v4_1, "windStrengthKey", v9_2);
            }
        }
        return v3_14;
    }
}
