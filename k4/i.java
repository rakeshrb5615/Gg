package k4;
public final class i implements k4.h, l8.b, t2.b, t6.b {
    public final synthetic int a;
    public final Object b;

    public synthetic i(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public static k4.i b(Object p2)
    {
        if (p2 == null) {
            throw new NullPointerException("instance cannot be null");
        } else {
            return new k4.i(p2, 4);
        }
    }

    public static k4.i c(boolean p7, int p8, int p9, int p10, int p11)
    {
        return new k4.i(android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(p8, p9, p10, p11, 0, p7), 2);
    }

    public Object a()
    {
        return this.b;
    }

    public Object get()
    {
        switch (this.a) {
            case 3:
                return this.b;
            default:
                return this.b;
        }
    }
}
