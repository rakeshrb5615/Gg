package u;
public abstract synthetic class e {
    public static final synthetic int[] a;

    static synthetic e()
    {
        int[] v0_1 = new int[10];
        v0_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        u.e.a = v0_1;
        return;
    }

    public static synthetic boolean a(int p0, int p1)
    {
        if (p0 == 0) {
            throw 0;
        } else {
            if (p0 != p1) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static StringBuilder b(String p1)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p1);
        return v0_1;
    }

    public static synthetic int c(int p0)
    {
        if (p0 == 0) {
            throw 0;
        } else {
            return (p0 - 1);
        }
    }

    public static synthetic int[] d(int p3)
    {
        int[] v0 = new int[p3];
        System.arraycopy(u.e.a, 0, v0, 0, p3);
        return v0;
    }
}
