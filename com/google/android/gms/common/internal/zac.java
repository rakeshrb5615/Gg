package com.google.android.gms.common.internal;
public final class zac {
    private static final r.j zaa;
    private static java.util.Locale zab;

    static zac()
    {
        com.google.android.gms.common.internal.zac.zaa = new r.j(0);
        return;
    }

    public static String zaa(android.content.Context p2)
    {
        String v0 = p2.getPackageName();
        try {
            String v2_3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(p2).getApplicationLabel(v0).toString();
            return v2_3;
        } catch (NullPointerException) {
            String v2_2 = v2_3.getApplicationInfo().name;
            if (!android.text.TextUtils.isEmpty(v2_2)) {
                return v2_2;
            } else {
                return v0;
            }
        }
    }

    public static String zab(android.content.Context p1, int p2)
    {
        String v1_1 = p1.getResources();
        if (p2 == 1) {
            return v1_1.getString(com.google.android.gms.base.R$string.common_google_play_services_install_button);
        } else {
            if (p2 == 2) {
                return v1_1.getString(com.google.android.gms.base.R$string.common_google_play_services_update_button);
            } else {
                if (p2 == 3) {
                    return v1_1.getString(com.google.android.gms.base.R$string.common_google_play_services_enable_button);
                } else {
                    return v1_1.getString(17039370);
                }
            }
        }
    }

    public static String zac(android.content.Context p3, int p4)
    {
        android.content.res.Resources v0 = p3.getResources();
        String v1 = com.google.android.gms.common.internal.zac.zaa(p3);
        if (p4 == 1) {
            return v0.getString(com.google.android.gms.base.R$string.common_google_play_services_install_text, new Object[] {v1}));
        } else {
            if (p4 == 2) {
                if (!com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(p3)) {
                    return v0.getString(com.google.android.gms.base.R$string.common_google_play_services_update_text, new Object[] {v1}));
                } else {
                    return v0.getString(com.google.android.gms.base.R$string.common_google_play_services_wear_update_text);
                }
            } else {
                if (p4 == 3) {
                    return v0.getString(com.google.android.gms.base.R$string.common_google_play_services_enable_text, new Object[] {v1}));
                } else {
                    if (p4 == 5) {
                        return com.google.android.gms.common.internal.zac.zag(p3, "common_google_play_services_invalid_account_text", v1);
                    } else {
                        if (p4 == 7) {
                            return com.google.android.gms.common.internal.zac.zag(p3, "common_google_play_services_network_error_text", v1);
                        } else {
                            if (p4 == 9) {
                                return v0.getString(com.google.android.gms.base.R$string.common_google_play_services_unsupported_text, new Object[] {v1}));
                            } else {
                                if (p4 == 20) {
                                    return com.google.android.gms.common.internal.zac.zag(p3, "common_google_play_services_restricted_profile_text", v1);
                                } else {
                                    switch (p4) {
                                        case 16:
                                            return com.google.android.gms.common.internal.zac.zag(p3, "common_google_play_services_api_unavailable_text", v1);
                                        case 17:
                                            return com.google.android.gms.common.internal.zac.zag(p3, "common_google_play_services_sign_in_failed_text", v1);
                                        case 18:
                                            return v0.getString(com.google.android.gms.base.R$string.common_google_play_services_updating_text, new Object[] {v1}));
                                        default:
                                            return v0.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, new Object[] {v1}));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static String zad(android.content.Context p1, int p2)
    {
        if ((p2 != 6) && (p2 != 19)) {
            return com.google.android.gms.common.internal.zac.zac(p1, p2);
        } else {
            return com.google.android.gms.common.internal.zac.zag(p1, "common_google_play_services_resolution_required_text", com.google.android.gms.common.internal.zac.zaa(p1));
        }
    }

    public static String zae(android.content.Context p1, int p2)
    {
        int v2_2;
        if (p2 != 6) {
            v2_2 = com.google.android.gms.common.internal.zac.zaf(p1, p2);
        } else {
            v2_2 = com.google.android.gms.common.internal.zac.zah(p1, "common_google_play_services_resolution_required_title");
        }
        if (v2_2 != 0) {
            return v2_2;
        } else {
            return p1.getResources().getString(com.google.android.gms.base.R$string.common_google_play_services_notification_ticker);
        }
    }

    public static String zaf(android.content.Context p3, int p4)
    {
        String v0_0 = p3.getResources();
        switch (p4) {
            case 1:
                return v0_0.getString(com.google.android.gms.base.R$string.common_google_play_services_install_title);
            case 2:
                return v0_0.getString(com.google.android.gms.base.R$string.common_google_play_services_update_title);
            case 3:
                return v0_0.getString(com.google.android.gms.base.R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return 0;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return com.google.android.gms.common.internal.zac.zah(p3, "common_google_play_services_invalid_account_title");
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return com.google.android.gms.common.internal.zac.zah(p3, "common_google_play_services_network_error_title");
            case 8:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return 0;
            case 9:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return 0;
            case 10:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return 0;
            case 11:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return 0;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                String v3_16 = new StringBuilder("Unexpected error code ");
                v3_16.append(p4);
                android.util.Log.e("GoogleApiAvailability", v3_16.toString());
                return 0;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return 0;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return com.google.android.gms.common.internal.zac.zah(p3, "common_google_play_services_sign_in_failed_title");
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return com.google.android.gms.common.internal.zac.zah(p3, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zag(android.content.Context p1, String p2, String p3)
    {
        android.content.res.Resources v0 = p1.getResources();
        String v1_2 = com.google.android.gms.common.internal.zac.zah(p1, p2);
        if (v1_2 == null) {
            v1_2 = v0.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(v0.getConfiguration().locale, v1_2, new Object[] {p3}));
    }

    private static String zah(android.content.Context p6, String p7)
    {
        r.j v2 = com.google.android.gms.common.internal.zac.zaa;
        int v3_0 = p6.getResources().getConfiguration().getLocales().get(0);
        if (!v3_0.equals(com.google.android.gms.common.internal.zac.zab)) {
            v2.clear();
            com.google.android.gms.common.internal.zac.zab = v3_0;
        }
        int v3_2 = ((String) v2.get(p7));
        if (v3_2 == 0) {
            String v6_1 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(p6);
            if (v6_1 != null) {
                int v4_4 = v6_1.getIdentifier(p7, "string", "com.google.android.gms");
                if (v4_4 != 0) {
                    String v6_2 = v6_1.getString(v4_4);
                    if (!android.text.TextUtils.isEmpty(v6_2)) {
                        v2.put(p7, v6_2);
                        return v6_2;
                    } else {
                        StringBuilder v1_3 = new StringBuilder("Got empty resource: ");
                        v1_3.append(p7);
                        android.util.Log.w("GoogleApiAvailability", v1_3.toString());
                        return 0;
                    }
                } else {
                    StringBuilder v0_2 = new StringBuilder("Missing resource: ");
                    v0_2.append(p7);
                    android.util.Log.w("GoogleApiAvailability", v0_2.toString());
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return v3_2;
        }
    }
}
