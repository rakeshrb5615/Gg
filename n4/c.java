package n4;
public final class c extends n4.d {

    public c(String p3, String p4)
    {
        this(new n4.a(p3, p4.toCharArray()), Character.valueOf(61));
        return;
    }

    public c(n4.a p1, Character p2)
    {
        super(p1, p2);
        if (p1.b.length != 64) {
            throw new IllegalArgumentException();
        } else {
            return;
        }
    }
}
