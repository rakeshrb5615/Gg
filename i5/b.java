package i5;
public final class b extends i5.m {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public b(String p1, String p2, String p3, String p4, long p5)
    {
        if (p1 == null) {
            throw new NullPointerException("Null rolloutId");
        } else {
            this.b = p1;
            if (p2 == null) {
                throw new NullPointerException("Null parameterKey");
            } else {
                this.c = p2;
                if (p3 == null) {
                    throw new NullPointerException("Null parameterValue");
                } else {
                    this.d = p3;
                    if (p4 == null) {
                        throw new NullPointerException("Null variantId");
                    } else {
                        this.e = p4;
                        this.f = p5;
                        return;
                    }
                }
            }
        }
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof i5.m)) || ((!this.b.equals(((i5.b) ((i5.m) p8)).b)) || ((!this.c.equals(((i5.b) ((i5.m) p8)).c)) || ((!this.d.equals(((i5.b) ((i5.m) p8)).d)) || ((!this.e.equals(((i5.b) ((i5.m) p8)).e)) || (this.f != ((i5.b) ((i5.m) p8)).f)))))) {
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
        long v2_4 = this.f;
        return (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) ((v2_4 >> 32) ^ v2_4)));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("RolloutAssignment{rolloutId=");
        v0_1.append(this.b);
        v0_1.append(", parameterKey=");
        v0_1.append(this.c);
        v0_1.append(", parameterValue=");
        v0_1.append(this.d);
        v0_1.append(", variantId=");
        v0_1.append(this.e);
        v0_1.append(", templateVersion=");
        v0_1.append(this.f);
        v0_1.append("}");
        return v0_1.toString();
    }
}
