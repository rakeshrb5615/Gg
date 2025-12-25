package c7;
public final class b extends w6.z {
    public static final c7.b$a b;
    public final java.text.SimpleDateFormat a;

    static b()
    {
        c7.b.b = new c7.b$a();
        return;
    }

    private b()
    {
        this.a = new java.text.SimpleDateFormat("hh:mm:ss a");
        return;
    }

    public synthetic b(int p1)
    {
        return;
    }

    public final Object b(e7.a p8)
    {
        if (p8.O() != 9) {
            String v1_1 = p8.M();
            try {
                java.util.TimeZone v2_2 = this.a.getTimeZone();
                try {
                    w6.p v4_1 = new java.sql.Time(this.a.parse(v1_1).getTime());
                } catch (java.text.ParseException v3_2) {
                    StringBuilder v5_2 = new StringBuilder("Failed parsing \'");
                    v5_2.append(v1_1);
                    v5_2.append("\' as SQL Time; at path ");
                    v5_2.append(p8.A(1));
                    throw new w6.p(v5_2.toString(), v3_2);
                } catch (String v8_3) {
                    this.a.setTimeZone(v2_2);
                    throw v8_3;
                }
                this.a.setTimeZone(v2_2);
                return v4_1;
            } catch (String v8_5) {
                throw v8_5;
            }
        } else {
            p8.K();
            return 0;
        }
    }

    public final void c(e7.b p2, Object p3)
    {
        if (((java.sql.Time) p3) != null) {
            p2.I(this.a.format(((java.sql.Time) p3)));
            return;
        } else {
            p2.B();
            return;
        }
    }
}
