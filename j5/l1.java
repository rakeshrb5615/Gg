package j5;
public final class l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final k2.c f;

    public l1(String p1, String p2, String p3, String p4, int p5, k2.c p6)
    {
        if (p1 == null) {
            throw new NullPointerException("Null appIdentifier");
        } else {
            this.a = p1;
            if (p2 == null) {
                throw new NullPointerException("Null versionCode");
            } else {
                this.b = p2;
                if (p3 == null) {
                    throw new NullPointerException("Null versionName");
                } else {
                    this.c = p3;
                    if (p4 == null) {
                        throw new NullPointerException("Null installUuid");
                    } else {
                        this.d = p4;
                        this.e = p5;
                        this.f = p6;
                        return;
                    }
                }
            }
        }
    }

    public final boolean equals(Object p3)
    {
        if ((p3 != this) && ((!(p3 instanceof j5.l1)) || ((!this.a.equals(((j5.l1) p3).a)) || ((!this.b.equals(((j5.l1) p3).b)) || ((!this.c.equals(((j5.l1) p3).c)) || ((!this.d.equals(((j5.l1) p3).d)) || ((this.e != ((j5.l1) p3).e) || (!this.f.equals(((j5.l1) p3).f))))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_2 = 1000003;
        return (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * v1_2) ^ this.d.hashCode()) * v1_2) ^ this.e) * v1_2) ^ this.f.hashCode());
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("AppData{appIdentifier=");
        v0_1.append(this.a);
        v0_1.append(", versionCode=");
        v0_1.append(this.b);
        v0_1.append(", versionName=");
        v0_1.append(this.c);
        v0_1.append(", installUuid=");
        v0_1.append(this.d);
        v0_1.append(", deliveryMechanism=");
        v0_1.append(this.e);
        v0_1.append(", developmentPlatformProvider=");
        v0_1.append(this.f);
        v0_1.append("}");
        return v0_1.toString();
    }
}
