package o0;
public final class a {
    public static final byte[] e;
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static a()
    {
        int v1_0 = new byte[1792];
        o0.a.e = v1_0;
        int v1_1 = 0;
        while (v1_1 < 1792) {
            o0.a.e[v1_1] = Character.getDirectionality(v1_1);
            v1_1++;
        }
        return;
    }

    public a(CharSequence p1)
    {
        this.a = p1;
        this.b = p1.length();
        return;
    }

    public final byte a()
    {
        byte[] v1_2 = this.a;
        byte v0_8 = v1_2.charAt((this.c - 1));
        this.d = v0_8;
        if (!Character.isLowSurrogate(v0_8)) {
            byte v0_4;
            this.c = (this.c - 1);
            byte v0_3 = this.d;
            if (v0_3 >= 1792) {
                v0_4 = Character.getDirectionality(v0_3);
            } else {
                v0_4 = o0.a.e[v0_3];
            }
            return v0_4;
        } else {
            byte v0_6 = Character.codePointBefore(v1_2, this.c);
            this.c = (this.c - Character.charCount(v0_6));
            return Character.getDirectionality(v0_6);
        }
    }
}
