package z6;
public final class g extends w6.z {
    public static final z6.e c;
    public final z6.f a;
    public final java.util.ArrayList b;

    static g()
    {
        z6.g.c = new z6.e();
        return;
    }

    public g()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        this.b = v0_1;
        this.a = z6.f.a;
        java.util.Locale v1_1 = java.util.Locale.US;
        v0_1.add(java.text.DateFormat.getDateTimeInstance(2, 2, v1_1));
        if (!java.util.Locale.getDefault().equals(v1_1)) {
            v0_1.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (y6.j.a >= 9) {
            v0_1.add(new java.text.SimpleDateFormat(g2.g.e("MMM d, yyyy", " ", "h:mm:ss a"), v1_1));
        }
        return;
    }

    public final Object b(e7.a p9)
    {
        if (p9.O() != 9) {
            z6.f v0_3 = p9.M();
            w6.p v2_2 = this.b;
            int v3_2 = v2_2.size();
            int v5 = 0;
            while (v5 < v3_2) {
                java.text.DateFormat v6_0 = v2_2.get(v5);
                v5++;
                java.text.DateFormat v6_1 = ((java.text.DateFormat) v6_0);
                java.util.TimeZone v7 = v6_1.getTimeZone();
                String v9_1 = v6_1.parse(v0_3);
                v6_1.setTimeZone(v7);
                this.a.getClass();
                return v9_1;
            }
            try {
                v9_1 = a7.a.b(v0_3, new java.text.ParsePosition(0));
            } catch (java.text.ParseException v1_2) {
                z6.f v0_1 = v1.a.q("Failed parsing \'", v0_3, "\' as Date; at path ");
                v0_1.append(v9_1.A(1));
                throw new w6.p(v0_1.toString(), v1_2);
            }
            this.a.getClass();
            return v9_1;
        } else {
            p9.K();
            return 0;
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        if (((java.util.Date) p4) != null) {
            p3.I(((java.text.DateFormat) this.b.get(0)).format(((java.util.Date) p4)));
            return;
        } else {
            p3.B();
            return;
        }
    }

    public final String toString()
    {
        String v0_8 = ((java.text.DateFormat) this.b.get(0));
        if (!(v0_8 instanceof java.text.SimpleDateFormat)) {
            StringBuilder v1_1 = new StringBuilder("DefaultDateTypeAdapter(");
            v1_1.append(v0_8.getClass().getSimpleName());
            v1_1.append(41);
            return v1_1.toString();
        } else {
            StringBuilder v1_3 = new StringBuilder("DefaultDateTypeAdapter(");
            v1_3.append(((java.text.SimpleDateFormat) v0_8).toPattern());
            v1_3.append(41);
            return v1_3.toString();
        }
    }
}
