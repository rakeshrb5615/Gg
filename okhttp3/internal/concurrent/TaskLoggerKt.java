package okhttp3.internal.concurrent;
public final class TaskLoggerKt {

    public static final void a(java.util.logging.Logger p1, okhttp3.internal.concurrent.Task p2, okhttp3.internal.concurrent.TaskQueue p3, String p4)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p3.b);
        v0_1.append(32);
        v0_1.append(String.format("%-22s", java.util.Arrays.copyOf(new Object[] {p4}), 1)));
        v0_1.append(": ");
        v0_1.append(p2.a);
        p1.fine(v0_1.toString());
        return;
    }

    public static final String b(long p12)
    {
        String v12_3;
        if (p12 > -999500000) {
            if (p12 > -999500) {
                if (p12 > 0) {
                    if (p12 >= 999500) {
                        if (p12 >= 999500000) {
                            StringBuilder v0_6 = new StringBuilder();
                            v0_6.append(((p12 + ((long) 500000000)) / ((long) 1000000000)));
                            v0_6.append(" s ");
                            v12_3 = v0_6.toString();
                        } else {
                            StringBuilder v0_8 = new StringBuilder();
                            v0_8.append(((p12 + ((long) 500000)) / ((long) 1000000)));
                            v0_8.append(" ms");
                            v12_3 = v0_8.toString();
                        }
                    } else {
                        StringBuilder v0_10 = new StringBuilder();
                        v0_10.append(((p12 + ((long) 500)) / ((long) 1000)));
                        v0_10.append(" \u00b5s");
                        v12_3 = v0_10.toString();
                    }
                } else {
                    StringBuilder v0_12 = new StringBuilder();
                    v0_12.append(((p12 - ((long) 500)) / ((long) 1000)));
                    v0_12.append(" \u00b5s");
                    v12_3 = v0_12.toString();
                }
            } else {
                StringBuilder v0_14 = new StringBuilder();
                v0_14.append(((p12 - ((long) 500000)) / ((long) 1000000)));
                v0_14.append(" ms");
                v12_3 = v0_14.toString();
            }
        } else {
            StringBuilder v0_17 = new StringBuilder();
            v0_17.append(((p12 - ((long) 500000000)) / ((long) 1000000000)));
            v0_17.append(" s ");
            v12_3 = v0_17.toString();
        }
        return String.format("%6s", java.util.Arrays.copyOf(new Object[] {v12_3}), 1));
    }
}
