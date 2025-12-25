package k7;
public final class a implements java.util.Comparator {
    public static final k7.a b;
    public static final k7.a c;
    public final synthetic int a;

    static synthetic a()
    {
        k7.a.b = new k7.a(0);
        k7.a.c = new k7.a(1);
        return;
    }

    public synthetic a(int p1)
    {
        this.a = p1;
        return;
    }

    public final int compare(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(((Comparable) p2), "a");
                kotlin.jvm.internal.j.e(((Comparable) p3), "b");
                return ((Comparable) p2).compareTo(((Comparable) p3));
            default:
                kotlin.jvm.internal.j.e(((Comparable) p2), "a");
                kotlin.jvm.internal.j.e(((Comparable) p3), "b");
                return ((Comparable) p3).compareTo(((Comparable) p2));
        }
    }

    public final java.util.Comparator reversed()
    {
        switch (this.a) {
            case 0:
                return k7.a.c;
            default:
                return k7.a.b;
        }
    }
}
