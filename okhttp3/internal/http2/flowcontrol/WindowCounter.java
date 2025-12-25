package okhttp3.internal.http2.flowcontrol;
public final class WindowCounter {
    public final int a;
    public long b;
    public long c;

    public WindowCounter(int p1)
    {
        this.a = p1;
        return;
    }

    public static void b(okhttp3.internal.http2.flowcontrol.WindowCounter p3, long p4, long p6, int p8)
    {
        if ((p8 & 1) != 0) {
            p4 = 0;
        }
        if ((p8 & 2) != 0) {
            p6 = 0;
        }
        if (p4 < 0) {
            throw new IllegalStateException("Check failed.");
        } else {
            if (p6 < 0) {
                throw new IllegalStateException("Check failed.");
            } else {
                long v0_2 = (p3.b + p4);
                p3.b = v0_2;
                IllegalStateException v4_5 = (p3.c + p6);
                p3.c = v4_5;
                if (v4_5 > v0_2) {
                    throw new IllegalStateException("Check failed.");
                } else {
                    return;
                }
            }
        }
    }

    public final declared_synchronized long a()
    {
        return (this.b - this.c);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("WindowCounter(streamId=");
        v0_1.append(this.a);
        v0_1.append(", total=");
        v0_1.append(this.b);
        v0_1.append(", acknowledged=");
        v0_1.append(this.c);
        v0_1.append(", unacknowledged=");
        v0_1.append(this.a());
        v0_1.append(41);
        return v0_1.toString();
    }
}
