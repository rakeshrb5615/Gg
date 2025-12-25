package v4;
public abstract class a {
    public static final m4.g a;
    public static final m4.i b;
    public static final m4.i c;
    public static final m4.i d;
    public static final m4.i e;
    public static final m4.i f;

    static a()
    {
        int v2 = "_ug";
        int v4 = "_exp_set";
        int v6 = "_exp_activate";
        int v2_0 = new Object[15];
        v2_0[0] = "_in";
        v2_0[1] = "_xa";
        v2_0[2] = "_xu";
        v2_0[3] = "_aq";
        v2_0[4] = "_aa";
        v2_0[5] = "_ai";
        System.arraycopy(new String[] {"_ac", "_exp_expire"}), 0, v2_0, 6, 9);
        v4.a.a = m4.g.g(15, v2_0);
        String v9 = "_iap";
        String v11 = "_au";
        m4.i v0_4 = new Object[] {"_e", "_cd"});
        j5.t1.d(7, v0_4);
        v4.a.b = m4.d.e(7, v0_4);
        m4.i v0_7 = new Object[] {"auto", "app", "am"});
        j5.t1.d(3, v0_7);
        v4.a.c = m4.d.e(3, v0_7);
        m4.i v0_10 = new Object[] {"_r", "_dbg"});
        j5.t1.d(2, v0_10);
        v4.a.d = m4.d.e(2, v0_10);
        m4.i v0_12 = new Object[4];
        String v1_4 = com.google.android.gms.measurement.internal.zzjo.zza;
        int v2_2 = v1_4.length;
        j5.t1.d(v2_2, v1_4);
        if (4 < v2_2) {
            v0_12 = java.util.Arrays.copyOf(v0_12, c4.b.y(4, v2_2));
        }
        System.arraycopy(v1_4, 0, v0_12, 0, v2_2);
        String v1_5 = com.google.android.gms.measurement.internal.zzjo.zzb;
        int v5_4 = v1_5.length;
        j5.t1.d(v5_4, v1_5);
        int v6_2 = (v2_2 + v5_4);
        if (v0_12.length < v6_2) {
            v0_12 = java.util.Arrays.copyOf(v0_12, c4.b.y(v0_12.length, v6_2));
        }
        System.arraycopy(v1_5, 0, v0_12, v2_2, v5_4);
        v4.a.e = m4.d.e(v6_2, v0_12);
        m4.i v0_15 = new Object[] {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
        j5.t1.d(2, v0_15);
        v4.a.f = m4.d.e(2, v0_15);
        return;
    }

    public static boolean a(String p1)
    {
        if (v4.a.c.contains(p1)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean b(android.os.Bundle p4, String p5)
    {
        if (!v4.a.b.contains(p5)) {
            if (p4 != 0) {
                m4.i v5_2 = v4.a.d;
                int v1 = v5_2.d;
                int v2 = 0;
                while (v2 < v1) {
                    boolean vtmp3 = p4.containsKey(((String) v5_2.get(v2)));
                    v2++;
                    if (vtmp3) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static boolean c(String p4, String p5)
    {
        if ((!"_ce1".equals(p5)) && (!"_ce2".equals(p5))) {
            if (!"_ln".equals(p5)) {
                if (!v4.a.e.contains(p5)) {
                    m4.i v4_3 = v4.a.f;
                    int v0_3 = v4_3.d;
                    int v1_0 = 0;
                    while (v1_0 < v0_3) {
                        boolean vtmp10 = p5.matches(((String) v4_3.get(v1_0)));
                        v1_0++;
                        if (vtmp10) {
                            return 0;
                        }
                    }
                }
            } else {
                if ((!p4.equals("fcm")) && (!p4.equals("fiam"))) {
                    return 0;
                }
            }
        } else {
            if ((!p4.equals("fcm")) && (!p4.equals("frc"))) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean d(String p5, String p6, android.os.Bundle p7)
    {
        if ("_cmp".equals(p6)) {
            if ((v4.a.a(p5)) && (p7 != null)) {
                String v6_1 = v4.a.d;
                int v2_0 = v6_1.d;
                String v3_0 = 0;
                while (v3_0 < v2_0) {
                    boolean vtmp4 = p7.containsKey(((String) v6_1.get(v3_0)));
                    v3_0++;
                    if (vtmp4) {
                    }
                }
                String v6_2 = p5.hashCode();
                if (v6_2 == 101200) {
                    if (p5.equals("fcm")) {
                        p7.putString("_cis", "fcm_integration");
                        return 1;
                    }
                } else {
                    if (v6_2 == 101230) {
                        if (p5.equals("fdl")) {
                            p7.putString("_cis", "fdl_integration");
                            return 1;
                        }
                    } else {
                        if ((v6_2 == 3142703) && (p5.equals("fiam"))) {
                            p7.putString("_cis", "fiam_integration");
                            return 1;
                        }
                    }
                }
            }
            return 0;
        } else {
            return 1;
        }
    }
}
