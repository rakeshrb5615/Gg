package g5;
public final class x {
    public final String a;
    public final String b;

    public x(String p1, String p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof g5.x)) {
                if (kotlin.jvm.internal.j.a(this.a, ((g5.x) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((g5.x) p5).b)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_2;
        int v0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_2 = v1_0.hashCode();
        } else {
            v1_2 = 0;
        }
        int v1_3 = (v1_2 * 31);
        String v2 = this.b;
        if (v2 != null) {
            v0 = v2.hashCode();
        }
        return (v1_3 + v0);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("FirebaseInstallationId(fid=");
        v0_2.append(this.a);
        v0_2.append(", authToken=");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
