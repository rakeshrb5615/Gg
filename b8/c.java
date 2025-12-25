package b8;
public final class c implements java.util.Iterator, v7.a {
    public final CharSequence a;
    public int b;
    public int c;
    public int d;
    public int e;

    public c(CharSequence p2)
    {
        kotlin.jvm.internal.j.e(p2, "string");
        this.a = p2;
        return;
    }

    public final boolean hasNext()
    {
        char v0_0 = this.b;
        if (v0_0 == 0) {
            int v3 = 2;
            if (this.e >= 0) {
                char v0_3 = this.a;
                int v1_2 = v0_3.length();
                int v4 = this.c;
                int v5_0 = v0_3.length();
                while (v4 < v5_0) {
                    char v6 = v0_3.charAt(v4);
                    if ((v6 == 10) || (v6 == 13)) {
                        if (v6 != 13) {
                            v3 = 1;
                        } else {
                            int v1_1 = (v4 + 1);
                            if ((v1_1 >= v0_3.length()) || (v0_3.charAt(v1_1) != 10)) {
                            }
                        }
                        v1_2 = v4;
                    } else {
                        v4++;
                    }
                    this.b = 1;
                    this.e = v3;
                    this.d = v1_2;
                    return 1;
                }
                v3 = -1;
                this.b = 1;
                this.e = v3;
                this.d = v1_2;
                return 1;
            } else {
                this.b = 2;
                return 0;
            }
        } else {
            if (v0_0 != 1) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException();
        } else {
            this.b = 0;
            java.util.NoSuchElementException v0_6 = this.d;
            int v1 = this.c;
            this.c = (this.e + v0_6);
            return this.a.subSequence(v1, v0_6).toString();
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
