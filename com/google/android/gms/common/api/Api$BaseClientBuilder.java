package com.google.android.gms.common.api;
public abstract class Api$BaseClientBuilder {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = 2147483647;
    public static final int API_PRIORITY_PLUS = 2;

    public Api$BaseClientBuilder()
    {
        return;
    }

    public java.util.List getImpliedScopes(Object p1)
    {
        return java.util.Collections.EMPTY_LIST;
    }

    public int getPriority()
    {
        return 2147483647;
    }
}
