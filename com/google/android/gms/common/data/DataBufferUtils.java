package com.google.android.gms.common.data;
public final class DataBufferUtils {
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils()
    {
        return;
    }

    public static java.util.ArrayList freezeAndClose(com.google.android.gms.common.data.DataBuffer p3)
    {
        Throwable v0_1 = new java.util.ArrayList(p3.getCount());
        try {
            java.util.Iterator v1_1 = p3.iterator();
        } catch (Throwable v0_2) {
            p3.close();
            throw v0_2;
        }
        while (v1_1.hasNext()) {
            v0_1.add(((com.google.android.gms.common.data.Freezable) v1_1.next()).freeze());
        }
        p3.close();
        return v0_1;
    }

    public static boolean hasData(com.google.android.gms.common.data.DataBuffer p0)
    {
        if ((p0 == 0) || (p0.getCount() <= 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean hasNextPage(com.google.android.gms.common.data.DataBuffer p1)
    {
        int v1_1 = p1.getMetadata();
        if ((v1_1 == 0) || (v1_1.getString("next_page_token") == null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean hasPrevPage(com.google.android.gms.common.data.DataBuffer p1)
    {
        int v1_1 = p1.getMetadata();
        if ((v1_1 == 0) || (v1_1.getString("prev_page_token") == null)) {
            return 0;
        } else {
            return 1;
        }
    }
}
