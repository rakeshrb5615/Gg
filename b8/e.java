package b8;
public final class e extends i7.d {
    public final synthetic b8.g a;

    public e(b8.g p1)
    {
        this.a = p1;
        return;
    }

    public final int b()
    {
        return (((java.util.regex.Matcher) this.a.b).groupCount() + 1);
    }

    public final bridge boolean contains(Object p2)
    {
        if ((p2 instanceof String)) {
            return super.contains(((String) p2));
        } else {
            return 0;
        }
    }

    public final Object get(int p2)
    {
        String v2_1 = ((java.util.regex.Matcher) this.a.b).group(p2);
        if (v2_1 == null) {
            v2_1 = "";
        }
        return v2_1;
    }

    public final bridge int indexOf(Object p2)
    {
        if ((p2 instanceof String)) {
            return super.indexOf(((String) p2));
        } else {
            return -1;
        }
    }

    public final bridge int lastIndexOf(Object p2)
    {
        if ((p2 instanceof String)) {
            return super.lastIndexOf(((String) p2));
        } else {
            return -1;
        }
    }
}
