package a2;
public final class a {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof a2.a)) {
                int v1_8 = this.a;
                if (v1_8 == ((a2.a) p4).a) {
                    if ((v1_8 != 8) || ((Math.abs((this.c - this.b)) != 1) || ((this.c != ((a2.a) p4).b) || (this.b != ((a2.a) p4).c)))) {
                        if ((this.c == ((a2.a) p4).c) && (this.b == ((a2.a) p4).b)) {
                            return 1;
                        }
                    } else {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final int hashCode()
    {
        return ((((this.a * 31) + this.b) * 31) + this.c);
    }

    public final String toString()
    {
        String v1_0;
        String v0_1 = new StringBuilder();
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append("[");
        String v1_9 = this.a;
        if (v1_9 == 1) {
            v1_0 = "add";
        } else {
            if (v1_9 == 2) {
                v1_0 = "rm";
            } else {
                if (v1_9 == 4) {
                    v1_0 = "up";
                } else {
                    if (v1_9 == 8) {
                        v1_0 = "mv";
                    } else {
                        v1_0 = "??";
                    }
                }
            }
        }
        v0_1.append(v1_0);
        v0_1.append(",s:");
        v0_1.append(this.b);
        v0_1.append("c:");
        v0_1.append(this.c);
        v0_1.append(",p:null]");
        return v0_1.toString();
    }
}
