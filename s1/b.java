package s1;
public final class b {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public b(int p1, float p2, float p3, float p4, long p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if ((p7 == 0) || ((s1.b != p7.getClass()) || ((this.c != ((s1.b) p7).c) || ((this.d != ((s1.b) p7).d) || (this.b != ((s1.b) p7).b))))) {
                return 0;
            } else {
                if (this.a == ((s1.b) p7).a) {
                    if (this.e == ((s1.b) p7).e) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (Long.hashCode(this.e) + ((Integer.hashCode(this.a) + ((Float.hashCode(this.b) + ((Float.hashCode(this.d) + (Float.hashCode(this.c) * 31)) * 31)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("NavigationEvent(touchX=");
        v0_1.append(this.c);
        v0_1.append(", touchY=");
        v0_1.append(this.d);
        v0_1.append(", progress=");
        v0_1.append(this.b);
        v0_1.append(", swipeEdge=");
        v0_1.append(this.a);
        v0_1.append(", frameTimeMillis=");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }
}
