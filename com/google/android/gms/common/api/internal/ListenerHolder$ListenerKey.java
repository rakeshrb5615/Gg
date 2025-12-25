package com.google.android.gms.common.api.internal;
public final class ListenerHolder$ListenerKey {
    private final Object zaa;
    private final String zab;

    public ListenerHolder$ListenerKey(Object p1, String p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey)) {
                if ((this.zaa != ((com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey) p5).zaa) || (!this.zab.equals(((com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey) p5).zab))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return (this.zab.hashCode() + (System.identityHashCode(this.zaa) * 31));
    }

    public String toIdString()
    {
        String v0_2 = System.identityHashCode(this.zaa);
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append(this.zab);
        v1_1.append("@");
        v1_1.append(v0_2);
        return v1_1.toString();
    }
}
