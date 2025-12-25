package com.google.android.gms.auth.api.credentials;
public final class IdentityProviders {
    public static final String FACEBOOK = "https://www.facebook.com";
    public static final String GOOGLE = "https://accounts.google.com";
    public static final String LINKEDIN = "https://www.linkedin.com";
    public static final String MICROSOFT = "https://login.live.com";
    public static final String PAYPAL = "https://www.paypal.com";
    public static final String TWITTER = "https://twitter.com";
    public static final String YAHOO = "https://login.yahoo.com";

    private IdentityProviders()
    {
        return;
    }

    public static final String getIdentityProviderForAccount(android.accounts.Account p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "account cannot be null");
        if (!"com.google".equals(p2.type)) {
            if (!"com.facebook.auth.login".equals(p2.type)) {
                return 0;
            } else {
                return "https://www.facebook.com";
            }
        } else {
            return "https://accounts.google.com";
        }
    }
}
