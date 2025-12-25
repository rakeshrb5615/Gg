package com.google.android.recaptcha.internal;
public abstract class zzjk implements java.lang.Iterable {

    public zzjk()
    {
        return;
    }

    public final String toString()
    {
        String v0_0 = this.iterator();
        StringBuilder v1_1 = new StringBuilder("[");
        int v2_2 = 1;
        while (v0_0.hasNext()) {
            if (v2_2 == 0) {
                v1_1.append(", ");
            }
            v1_1.append(v0_0.next());
            v2_2 = 0;
        }
        v1_1.append(93);
        return v1_1.toString();
    }
}
