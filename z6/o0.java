package z6;
public class o0 extends w6.z {

    public o0()
    {
        return;
    }

    public final Object b(e7.a p13)
    {
        if (p13.O() != 9) {
            p13.f();
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            int v5 = 0;
            int v6 = 0;
            int v7 = 0;
            while(true) {
                int v8_0 = 4;
                if (p13.O() == 4) {
                    break;
                }
                boolean v1_4 = p13.I();
                int v9 = p13.G();
                v1_4.getClass();
                switch (v1_4.hashCode()) {
                    case -1181204563:
                        if (v1_4.equals("dayOfMonth")) {
                            v8_0 = 0;
                        } else {
                            v8_0 = -1;
                        }
                        break;
                    case -1074026988:
                        if (v1_4.equals("minute")) {
                            v8_0 = 1;
                        }
                        break;
                    case -906279820:
                        if (v1_4.equals("second")) {
                            v8_0 = 2;
                        }
                        break;
                    case 3704893:
                        if (v1_4.equals("year")) {
                            v8_0 = 3;
                        }
                        break;
                    case 104080000:
                        if (v1_4.equals("month")) {
                        }
                        break;
                    case 985252545:
                        if (v1_4.equals("hourOfDay")) {
                            v8_0 = 5;
                        }
                        break;
                    default:
                }
                switch (v8_0) {
                    case 0:
                        v4 = v9;
                        break;
                    case 1:
                        v6 = v9;
                        break;
                    case 2:
                        v7 = v9;
                        break;
                    case 3:
                        v2 = v9;
                        break;
                    case 4:
                        v3 = v9;
                        break;
                    case 5:
                        v5 = v9;
                        break;
                    default:
                }
            }
            p13.y();
            return new java.util.GregorianCalendar(v2, v3, v4, v5, v6, v7);
        } else {
            p13.K();
            return 0;
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        if (((java.util.Calendar) p4) != null) {
            p3.i();
            p3.z("year");
            p3.G(((long) ((java.util.Calendar) p4).get(1)));
            p3.z("month");
            p3.G(((long) ((java.util.Calendar) p4).get(2)));
            p3.z("dayOfMonth");
            p3.G(((long) ((java.util.Calendar) p4).get(5)));
            p3.z("hourOfDay");
            p3.G(((long) ((java.util.Calendar) p4).get(11)));
            p3.z("minute");
            p3.G(((long) ((java.util.Calendar) p4).get(12)));
            p3.z("second");
            p3.G(((long) ((java.util.Calendar) p4).get(13)));
            p3.y();
            return;
        } else {
            p3.B();
            return;
        }
    }
}
