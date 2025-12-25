package m4;
public final class p extends m4.s {
    public int a;
    public Object b;
    public final java.util.Iterator c;
    public final java.util.Iterator d;
    public final synthetic m4.q e;

    public p(m4.q p2)
    {
        this.e = p2;
        this.a = 2;
        this.c = p2.a.iterator();
        this.d = p2.b.iterator();
        return;
    }

    public final boolean hasNext()
    {
        int v0_0 = this.a;
        if (v0_0 == 4) {
            throw new IllegalStateException();
        } else {
            int v0_8 = u.e.c(v0_0);
            if (v0_8 == 0) {
                return 1;
            } else {
                if (v0_8 != 2) {
                    int v0_3;
                    this.a = 4;
                    int v0_1 = this.c;
                    if (!v0_1.hasNext()) {
                        do {
                            int v0_2 = this.d;
                            if (!v0_2.hasNext()) {
                                this.a = 3;
                                v0_3 = 0;
                                break;
                            } else {
                                v0_3 = v0_2.next();
                            }
                        } while(this.e.a.contains(v0_3));
                    } else {
                        v0_3 = v0_1.next();
                    }
                    this.b = v0_3;
                    if (this.a != 3) {
                        this.a = 1;
                        return 1;
                    }
                }
                return 0;
            }
        }
    }

    public final Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException();
        } else {
            this.a = 2;
            java.util.NoSuchElementException v0_4 = this.b;
            this.b = 0;
            return v0_4;
        }
    }
}
