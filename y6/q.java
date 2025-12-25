package y6;
public final class q implements java.lang.CharSequence {
    public char[] a;
    public String b;

    public final char charAt(int p2)
    {
        return this.a[p2];
    }

    public final int length()
    {
        return this.a.length;
    }

    public final CharSequence subSequence(int p3, int p4)
    {
        return new String(this.a, p3, (p4 - p3));
    }

    public final String toString()
    {
        if (this.b == null) {
            this.b = new String(this.a);
        }
        return this.b;
    }
}
