package q2;
public final class u {
    public final long a;

    public u(long p1)
    {
        this.a = p1;
        return;
    }

    public static q2.u a(java.io.BufferedReader p3)
    {
        android.util.JsonReader v0_1 = new android.util.JsonReader(p3);
        try {
            v0_1.beginObject();
        } catch (q2.u v3_6) {
            v0_1.close();
            throw v3_6;
        }
        while (v0_1.hasNext()) {
            if (!v0_1.nextName().equals("nextRequestWaitMillis")) {
                v0_1.skipValue();
            } else {
                if (v0_1.peek() != android.util.JsonToken.STRING) {
                    q2.u v3_5 = new q2.u(v0_1.nextLong());
                    v0_1.close();
                    return v3_5;
                } else {
                    q2.u v3_9 = new q2.u(Long.parseLong(v0_1.nextString()));
                    v0_1.close();
                    return v3_9;
                }
            }
        }
        throw new java.io.IOException("Response is missing nextRequestWaitMillis field.");
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof q2.u)) || (this.a != ((q2.u) p8).a)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_0 = this.a;
        return (((int) ((v1_0 >> 32) ^ v1_0)) ^ 1000003);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        v0_1.append(this.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
