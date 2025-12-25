package b3;
public abstract class a {
    public static final android.util.SparseArray a;
    public static final java.util.HashMap b;

    static a()
    {
        b3.a.a = new android.util.SparseArray();
        java.util.Iterator v0_5 = new java.util.HashMap();
        b3.a.b = v0_5;
        v0_5.put(o2.d.a, Integer.valueOf(0));
        v0_5.put(o2.d.b, Integer.valueOf(1));
        v0_5.put(o2.d.c, Integer.valueOf(2));
        java.util.Iterator v0_3 = v0_5.keySet().iterator();
        while (v0_3.hasNext()) {
            o2.d v1_6 = ((o2.d) v0_3.next());
            b3.a.a.append(((Integer) b3.a.b.get(v1_6)).intValue(), v1_6);
        }
        return;
    }

    public static int a(o2.d p3)
    {
        IllegalStateException v0_3 = ((Integer) b3.a.b.get(p3));
        if (v0_3 == null) {
            StringBuilder v1_1 = new StringBuilder("PriorityMapping is missing known Priority value ");
            v1_1.append(p3);
            throw new IllegalStateException(v1_1.toString());
        } else {
            return v0_3.intValue();
        }
    }

    public static o2.d b(int p2)
    {
        IllegalArgumentException v0_2 = ((o2.d) b3.a.a.get(p2));
        if (v0_2 == null) {
            throw new IllegalArgumentException(g2.g.c(p2, "Unknown Priority for value "));
        } else {
            return v0_2;
        }
    }
}
