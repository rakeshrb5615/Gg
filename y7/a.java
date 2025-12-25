package y7;
public abstract class a implements java.lang.Iterable, v7.a {
    public final char a;
    public final char b;
    public final int c;

    public a(char p2, char p3)
    {
        this.a = p2;
        this.b = ((char) c4.b.D(p2, p3, 1));
        this.c = 1;
        return;
    }

    public final java.util.Iterator iterator()
    {
        return new y7.b(this.a, this.b, this.c);
    }
}
