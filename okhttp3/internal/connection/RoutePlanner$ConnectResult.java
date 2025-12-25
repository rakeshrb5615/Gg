package okhttp3.internal.connection;
public final class RoutePlanner$ConnectResult {
    public final okhttp3.internal.connection.RoutePlanner$Plan a;
    public final okhttp3.internal.connection.RoutePlanner$Plan b;
    public final Throwable c;

    public synthetic RoutePlanner$ConnectResult(okhttp3.internal.connection.RoutePlanner$Plan p3, okhttp3.internal.connection.ConnectPlan p4, Throwable p5, int p6)
    {
        if ((p6 & 2) != 0) {
            p4 = 0;
        }
        if ((p6 & 4) != 0) {
            p5 = 0;
        }
        this(p3, p4, p5);
        return;
    }

    public RoutePlanner$ConnectResult(okhttp3.internal.connection.RoutePlanner$Plan p1, okhttp3.internal.connection.RoutePlanner$Plan p2, Throwable p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof okhttp3.internal.connection.RoutePlanner$ConnectResult)) {
                if (kotlin.jvm.internal.j.a(this.a, ((okhttp3.internal.connection.RoutePlanner$ConnectResult) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((okhttp3.internal.connection.RoutePlanner$ConnectResult) p5).b)) {
                        if (kotlin.jvm.internal.j.a(this.c, ((okhttp3.internal.connection.RoutePlanner$ConnectResult) p5).c)) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        Throwable v2_2;
        int v0_5 = (this.a.hashCode() * 31);
        int v1 = 0;
        Throwable v2_1 = this.b;
        if (v2_1 != null) {
            v2_2 = v2_1.hashCode();
        } else {
            v2_2 = 0;
        }
        int v0_2 = ((v0_5 + v2_2) * 31);
        Throwable v2_0 = this.c;
        if (v2_0 != null) {
            v1 = v2_0.hashCode();
        }
        return (v0_2 + v1);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("ConnectResult(plan=");
        v0_2.append(this.a);
        v0_2.append(", nextPlan=");
        v0_2.append(this.b);
        v0_2.append(", throwable=");
        v0_2.append(this.c);
        v0_2.append(41);
        return v0_2.toString();
    }
}
