package androidx.lifecycle;
public final enum class n extends java.lang.Enum {
    private static final synthetic o7.a $ENTRIES;
    private static final synthetic androidx.lifecycle.n[] $VALUES;
    public static final androidx.lifecycle.l Companion;
    public static final enum androidx.lifecycle.n ON_ANY;
    public static final enum androidx.lifecycle.n ON_CREATE;
    public static final enum androidx.lifecycle.n ON_DESTROY;
    public static final enum androidx.lifecycle.n ON_PAUSE;
    public static final enum androidx.lifecycle.n ON_RESUME;
    public static final enum androidx.lifecycle.n ON_START;
    public static final enum androidx.lifecycle.n ON_STOP;

    static n()
    {
        androidx.lifecycle.l v0_1 = new androidx.lifecycle.n("ON_CREATE", 0);
        androidx.lifecycle.n.ON_CREATE = v0_1;
        androidx.lifecycle.n.ON_START = new androidx.lifecycle.n("ON_START", 1);
        androidx.lifecycle.n.ON_RESUME = new androidx.lifecycle.n("ON_RESUME", 2);
        androidx.lifecycle.n.ON_PAUSE = new androidx.lifecycle.n("ON_PAUSE", 3);
        androidx.lifecycle.n.ON_STOP = new androidx.lifecycle.n("ON_STOP", 4);
        androidx.lifecycle.n.ON_DESTROY = new androidx.lifecycle.n("ON_DESTROY", 5);
        androidx.lifecycle.n v6_3 = new androidx.lifecycle.n("ON_ANY", 6);
        androidx.lifecycle.n.ON_ANY = v6_3;
        androidx.lifecycle.l v0_2 = new androidx.lifecycle.n[] {v0_1, v6_3});
        androidx.lifecycle.n.$VALUES = v0_2;
        androidx.lifecycle.n.$ENTRIES = c4.b.x(v0_2);
        androidx.lifecycle.n.Companion = new androidx.lifecycle.l();
        return;
    }

    public static androidx.lifecycle.n valueOf(String p1)
    {
        return ((androidx.lifecycle.n) Enum.valueOf(androidx.lifecycle.n, p1));
    }

    public static androidx.lifecycle.n[] values()
    {
        return ((androidx.lifecycle.n[]) androidx.lifecycle.n.$VALUES.clone());
    }

    public final androidx.lifecycle.o a()
    {
        switch (androidx.lifecycle.m.a[this.ordinal()]) {
            case 1:
            case 2:
                return androidx.lifecycle.o.c;
            case 3:
            case 4:
                return androidx.lifecycle.o.d;
            case 5:
                return androidx.lifecycle.o.e;
            case 6:
                return androidx.lifecycle.o.a;
            case 7:
                String v1_3 = new StringBuilder();
                v1_3.append(this);
                v1_3.append(" has no target state");
                throw new IllegalArgumentException(v1_3.toString());
                break;
            default:
                throw new a5.o();
        }
    }
}
