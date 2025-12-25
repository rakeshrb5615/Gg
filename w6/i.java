package w6;
public final class i {
    public static final w6.i d;
    public final String a;
    public final String b;
    public final boolean c;

    static i()
    {
        w6.i.d = new w6.i("", "", 0);
        new w6.i("\n", "  ", 1);
        return;
    }

    public i(String p2, String p3, boolean p4)
    {
        if (!p2.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        } else {
            if (!p3.matches("[ \t]*")) {
                throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
            } else {
                this.a = p2;
                this.b = p3;
                this.c = p4;
                return;
            }
        }
    }
}
