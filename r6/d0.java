package r6;
public final class d0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public d0(String p1, int p2, int p3, boolean p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof r6.d0)) {
                if (kotlin.jvm.internal.j.a(this.a, ((r6.d0) p5).a)) {
                    if (this.b == ((r6.d0) p5).b) {
                        if (this.c == ((r6.d0) p5).c) {
                            if (this.d == ((r6.d0) p5).d) {
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
        return (Boolean.hashCode(this.d) + ((Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("ProcessDetails(processName=");
        v0_1.append(this.a);
        v0_1.append(", pid=");
        v0_1.append(this.b);
        v0_1.append(", importance=");
        v0_1.append(this.c);
        v0_1.append(", isDefaultProcess=");
        v0_1.append(this.d);
        v0_1.append(41);
        return v0_1.toString();
    }
}
