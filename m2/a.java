package m2;
public final class a {
    public static final java.text.SimpleDateFormat[] a;

    static a()
    {
        java.util.Locale v1 = java.util.Locale.US;
        m2.a.a = new java.text.SimpleDateFormat[] {new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", v1), new java.text.SimpleDateFormat("dd/MM yyyy, HH:mm", v1)});
        return;
    }

    public a()
    {
        new java.text.SimpleDateFormat("dd/MM yyyy, HH:mm", new java.util.Locale$Builder().setLanguage("en").setRegion("US").build());
        return;
    }

    public static float a()
    {
        float v0_0 = java.util.Calendar.getInstance();
        return ((((float) v0_0.get(12)) / 1114636288) + ((float) v0_0.get(11)));
    }

    public static String b(float p2)
    {
        return String.format(java.util.Locale.getDefault(), "%02d:%02d", new Object[] {Integer.valueOf(((int) p2)), Integer.valueOf(((int) ((p2 - ((float) ((int) p2))) * 1114636288)))}));
    }

    public static float[] c(android.content.Context p4, int p5)
    {
        float[] v5_1;
        int v4_1 = j5.t1.z(p4);
        float v0_1 = v4_1.getFloat("sunriseTimeFloatKey", 1086324736);
        float v1_2 = v4_1.getFloat("sunsetTimeFloatKey", 1099956224);
        int v4_2 = v4_1.getFloat("systemTime", 1094713344);
        if (p5 != 9) {
            v5_1 = 1065353216;
        } else {
            v5_1 = 1073741824;
        }
        if ((v4_2 <= (v0_1 - v5_1)) || (v4_2 >= (v0_1 + v5_1))) {
            if ((v4_2 <= (v1_2 - v5_1)) || (v4_2 >= (v1_2 + v5_1))) {
                float v2_10 = -1082130432;
            } else {
                float v2_11 = (v4_2 - v1_2);
                v2_10 = ((v2_11 + v5_1) / (1073741824 * v5_1));
            }
        } else {
            v2_11 = (v4_2 - v0_1);
        }
        float[] v5_3 = new float[4];
        v5_3[0] = v4_2;
        v5_3[1] = v0_1;
        v5_3[2] = v1_2;
        v5_3[3] = v2_10;
        return v5_3;
    }

    public static boolean d()
    {
        int v0_0 = java.util.Calendar.getInstance();
        int v1_3 = v0_0.get(2);
        int v0_2 = v0_0.get(5);
        if ((v1_3 != 11) || ((v0_2 < 24) || (v0_2 > 27))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean e(android.content.Context p5)
    {
        int v5_1 = j5.t1.z(p5);
        float v0_4 = v5_1.getFloat("sunriseTimeFloatKey", 1086324736);
        float v1_3 = v5_1.getFloat("sunsetTimeFloatKey", 1099956224);
        float[] v2_2 = new float[3];
        v2_2[0] = v5_1.getFloat("systemTime", 1094713344);
        v2_2[1] = v0_4;
        v2_2[2] = v1_3;
        float v1_0 = v2_2[0];
        if ((v1_0 < v2_2[1]) || (v1_0 > v2_2[2])) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean f(int p7, String p8)
    {
        int v0 = 1;
        if ((p8 != null) && (!p8.isEmpty())) {
            long v1_3 = m2.a.a;
            int v2 = v1_3.length;
            long v4_0 = 0;
            int v5 = 0;
            while (v5 < v2) {
                try {
                    v4_0 = v1_3[v5].parse(p8);
                } catch (java.text.ParseException) {
                    v5++;
                }
                if (v4_0 != 0) {
                    break;
                }
            }
            if ((v4_0 != 0) && ((System.currentTimeMillis() - v4_0.getTime()) < (((long) p7) * 60000))) {
                v0 = 0;
            }
        }
        return v0;
    }
}
