package v1;
public abstract synthetic class a {

    public static final void a(android.view.View p4, int p5)
    {
        kotlin.jvm.internal.j.e(p4, "view");
        int v5_2 = u.e.c(p5);
        if (v5_2 == 0) {
            int v5_1;
            int v5_18 = p4.getParent();
            if (!(v5_18 instanceof android.view.ViewGroup)) {
                v5_1 = 0;
            } else {
                v5_1 = ((android.view.ViewGroup) v5_18);
            }
            if (v5_1 != 0) {
                if (androidx.fragment.app.b1.H(2)) {
                    String v1_2 = new StringBuilder("SpecialEffectsController: Removing view ");
                    v1_2.append(p4);
                    v1_2.append(" from container ");
                    v1_2.append(v5_1);
                    android.util.Log.v("FragmentManager", v1_2.toString());
                }
                v5_1.removeView(p4);
            }
        } else {
            if (v5_2 == 1) {
                if (androidx.fragment.app.b1.H(2)) {
                    int v5_5 = new StringBuilder("SpecialEffectsController: Setting view ");
                    v5_5.append(p4);
                    v5_5.append(" to VISIBLE");
                    android.util.Log.v("FragmentManager", v5_5.toString());
                }
                p4.setVisibility(0);
                return;
            } else {
                if (v5_2 == 2) {
                    if (androidx.fragment.app.b1.H(2)) {
                        int v5_10 = new StringBuilder("SpecialEffectsController: Setting view ");
                        v5_10.append(p4);
                        v5_10.append(" to GONE");
                        android.util.Log.v("FragmentManager", v5_10.toString());
                    }
                    p4.setVisibility(8);
                    return;
                } else {
                    if (v5_2 == 3) {
                        if (androidx.fragment.app.b1.H(2)) {
                            int v5_15 = new StringBuilder("SpecialEffectsController: Setting view ");
                            v5_15.append(p4);
                            v5_15.append(" to INVISIBLE");
                            android.util.Log.v("FragmentManager", v5_15.toString());
                        }
                        p4.setVisibility(4);
                        return;
                    }
                }
            }
        }
        return;
    }

    public static int b(int p0, int p1, int p2)
    {
        return ((com.google.android.gms.internal.measurement.zzlm.zzz(p0) + p1) + p2);
    }

    public static int c(int p0, int p1, int p2, int p3, int p4)
    {
        return Math.max((((p0 * p1) / p2) + p3), p4);
    }

    public static com.android.billingclient.api.BillingResult d(int p1, String p2)
    {
        com.android.billingclient.api.BillingResult$Builder v0 = com.android.billingclient.api.BillingResult.newBuilder();
        v0.setResponseCode(p1);
        v0.setDebugMessage(p2);
        return v0.build();
    }

    public static ClassCastException e(java.util.Iterator p0)
    {
        p0.next().getClass();
        return new ClassCastException();
    }

    public static Object f(com.google.android.gms.internal.measurement.zzbk p0, int p1, java.util.List p2, int p3)
    {
        com.google.android.gms.internal.measurement.zzh.zza(p0.name(), p1, p2);
        return p2.get(p3);
    }

    public static String g(long p1, String p3)
    {
        StringBuilder v0_1 = new StringBuilder(p3);
        v0_1.append(p1);
        return v0_1.toString();
    }

    public static String h(androidx.recyclerview.widget.RecyclerView p0, StringBuilder p1)
    {
        p1.append(p0.B());
        return p1.toString();
    }

    public static String i(String p1, int p2, int p3, String p4)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p4);
        v0_1.append(p3);
        return v0_1.toString();
    }

    public static String j(String p1, int p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        return v0_1.toString();
    }

    public static String k(String p1, androidx.fragment.app.e0 p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        return v0_1.toString();
    }

    public static String l(String p1, String p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        return v0_1.toString();
    }

    public static String m(StringBuilder p0, String p1, int p2)
    {
        p0.append(p1);
        p0.append(p2);
        return p0.toString();
    }

    public static String n(StringBuilder p0, String p1, String p2)
    {
        p0.append(p1);
        p0.append(p2);
        return p0.toString();
    }

    public static String o(StringBuilder p0, String p1, String p2, String p3)
    {
        p0.append(p1);
        p0.append(p2);
        p0.append(p3);
        return p0.toString();
    }

    public static StringBuilder p(String p1, int p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        return v0_1;
    }

    public static StringBuilder q(String p1, String p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        return v0_1;
    }

    public static StringBuilder r(String p1, String p2, String p3, String p4, String p5)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        v0_1.append(p4);
        v0_1.append(p5);
        return v0_1;
    }

    public static void s(com.google.android.gms.measurement.internal.zzic p0, String p1)
    {
        p0.zzaV().zzb().zza(p1);
        return;
    }

    public static synthetic void t(Object p0)
    {
        if (p0 != null) {
            throw new ClassCastException();
        } else {
            return;
        }
    }

    public static int u(int p0, int p1, int p2)
    {
        return ((com.google.android.gms.internal.play_billing.zzep.zzC(p0) + p1) + p2);
    }

    public static void v(com.google.android.gms.measurement.internal.zzic p0, String p1)
    {
        p0.zzaV().zze().zza(p1);
        return;
    }

    public static int w(int p0, int p1, int p2)
    {
        return ((com.google.android.recaptcha.internal.zzln.zzA(p0) + p1) + p2);
    }

    public static synthetic String x(int p1)
    {
        if (p1 == 1) {
            return "NONE";
        } else {
            if (p1 == 2) {
                return "ADDING";
            } else {
                if (p1 == 3) {
                    return "REMOVING";
                } else {
                    return "null";
                }
            }
        }
    }

    public static synthetic String y(int p1)
    {
        if (p1 == 1) {
            return "REMOVED";
        } else {
            if (p1 == 2) {
                return "VISIBLE";
            } else {
                if (p1 == 3) {
                    return "GONE";
                } else {
                    if (p1 == 4) {
                        return "INVISIBLE";
                    } else {
                        return "null";
                    }
                }
            }
        }
    }

    public static synthetic String z(int p0)
    {
        switch (p0) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
