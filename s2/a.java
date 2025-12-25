package s2;
public final class a {
    public final int a;
    public final long b;

    public a(int p1, long p2)
    {
        if (p1 == null) {
            throw new NullPointerException("Null status");
        } else {
            this.a = p1;
            this.b = p2;
            return;
        }
    }

    public final boolean equals(Object p5)
    {
        if ((p5 != this) && ((!(p5 instanceof s2.a)) || ((!u.e.a(this.a, ((s2.a) p5).a)) || (this.b != ((s2.a) p5).b)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        long v2 = this.b;
        return (((u.e.c(this.a) ^ 1000003) * 1000003) ^ ((int) ((v2 >> 32) ^ v2)));
    }

    public final String toString()
    {
        String v1_2;
        String v0_1 = new StringBuilder("BackendResponse{status=");
        int v2 = this.a;
        if (v2 == 1) {
            v1_2 = "OK";
        } else {
            if (v2 == 2) {
                v1_2 = "TRANSIENT_ERROR";
            } else {
                if (v2 == 3) {
                    v1_2 = "FATAL_ERROR";
                } else {
                    if (v2 == 4) {
                        v1_2 = "INVALID_PAYLOAD";
                    } else {
                        v1_2 = "null";
                    }
                }
            }
        }
        v0_1.append(v1_2);
        v0_1.append(", nextRequestWaitMillis=");
        v0_1.append(this.b);
        v0_1.append("}");
        return v0_1.toString();
    }
}
