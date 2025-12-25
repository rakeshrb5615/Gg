package okhttp3;
public final class Challenge {
    public final String a;
    public final java.util.Map b;

    public Challenge(String p5, java.util.Map p6)
    {
        this.a = p5;
        java.util.Map v5_3 = new java.util.LinkedHashMap();
        String v6_3 = p6.entrySet().iterator();
        while (v6_3.hasNext()) {
            int v1_2;
            String v0_1 = ((java.util.Map$Entry) v6_3.next());
            int v1_1 = ((String) v0_1.getKey());
            String v0_3 = ((String) v0_1.getValue());
            if (v1_1 == 0) {
                v1_2 = 0;
            } else {
                String v2_0 = java.util.Locale.US;
                kotlin.jvm.internal.j.d(v2_0, "US");
                v1_2 = v1_1.toLowerCase(v2_0);
                kotlin.jvm.internal.j.d(v1_2, "toLowerCase(...)");
            }
            v5_3.put(v1_2, v0_3);
        }
        java.util.Map v5_1 = java.util.Collections.unmodifiableMap(v5_3);
        kotlin.jvm.internal.j.d(v5_1, "unmodifiableMap(...)");
        this.b = v5_1;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof okhttp3.Challenge)) || ((!kotlin.jvm.internal.j.a(((okhttp3.Challenge) p3).a, this.a)) || (!kotlin.jvm.internal.j.a(((okhttp3.Challenge) p3).b, this.b)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.b.hashCode() + ((this.a.hashCode() + 899) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append(" authParams=");
        v0_1.append(this.b);
        return v0_1.toString();
    }
}
