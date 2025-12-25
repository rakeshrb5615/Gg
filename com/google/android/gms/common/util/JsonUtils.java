package com.google.android.gms.common.util;
public final class JsonUtils {
    private static final java.util.regex.Pattern zza;
    private static final java.util.regex.Pattern zzb;

    static JsonUtils()
    {
        com.google.android.gms.common.util.JsonUtils.zza = java.util.regex.Pattern.compile("\\\\.");
        com.google.android.gms.common.util.JsonUtils.zzb = java.util.regex.Pattern.compile("[\\\\\"/\u0008\u000c\n\r\t]");
        return;
    }

    private JsonUtils()
    {
        return;
    }

    public static boolean areJsonValuesEquivalent(Object p5, Object p6)
    {
        if ((p5 == null) && (p6 == null)) {
            return 1;
        } else {
            if ((p5 != null) && (p6 != null)) {
                if ((!(p5 instanceof org.json.JSONObject)) || (!(p6 instanceof org.json.JSONObject))) {
                    if ((!(p5 instanceof org.json.JSONArray)) || (!(p6 instanceof org.json.JSONArray))) {
                        return p5.equals(p6);
                    } else {
                        if (((org.json.JSONArray) p5).length() != ((org.json.JSONArray) p6).length()) {
                            return 0;
                        } else {
                            int v2_3 = 0;
                            while (v2_3 < ((org.json.JSONArray) p5).length()) {
                                try {
                                    if (!com.google.android.gms.common.util.JsonUtils.areJsonValuesEquivalent(((org.json.JSONArray) p5).get(v2_3), ((org.json.JSONArray) p6).get(v2_3))) {
                                        return 0;
                                    } else {
                                        v2_3++;
                                    }
                                } catch (org.json.JSONException) {
                                    return 0;
                                }
                            }
                            return 1;
                        }
                    }
                } else {
                    if (((org.json.JSONObject) p5).length() == ((org.json.JSONObject) p6).length()) {
                        int v2_5 = ((org.json.JSONObject) p5).keys();
                        while (v2_5.hasNext()) {
                            boolean v3_7 = ((String) v2_5.next());
                            try {
                                if (((org.json.JSONObject) p6).has(v3_7)) {
                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_7);
                                    if (!com.google.android.gms.common.util.JsonUtils.areJsonValuesEquivalent(((org.json.JSONObject) p5).get(v3_7), ((org.json.JSONObject) p6).get(v3_7))) {
                                    }
                                }
                                return 0;
                            } catch (org.json.JSONException) {
                                return 0;
                            }
                        }
                        return 1;
                    } else {
                        return 0;
                    }
                }
            } else {
                return 0;
            }
        }
    }

    public static String escapeString(String p4)
    {
        if (!android.text.TextUtils.isEmpty(p4)) {
            java.util.regex.Matcher v0_2 = com.google.android.gms.common.util.JsonUtils.zzb.matcher(p4);
            StringBuffer v1_1 = 0;
            while (v0_2.find()) {
                if (v1_1 == null) {
                    v1_1 = new StringBuffer();
                }
                String v2_1 = v0_2.group().charAt(0);
                if (v2_1 == 12) {
                    v0_2.appendReplacement(v1_1, "\\\\f");
                } else {
                    if (v2_1 == 13) {
                        v0_2.appendReplacement(v1_1, "\\\\r");
                    } else {
                        if (v2_1 == 34) {
                            v0_2.appendReplacement(v1_1, "\\\\\\\"");
                        } else {
                            if (v2_1 == 47) {
                                v0_2.appendReplacement(v1_1, "\\\\/");
                            } else {
                                if (v2_1 == 92) {
                                    v0_2.appendReplacement(v1_1, "\\\\\\\\");
                                } else {
                                    switch (v2_1) {
                                        case 8:
                                            v0_2.appendReplacement(v1_1, "\\\\b");
                                            break;
                                        case 9:
                                            v0_2.appendReplacement(v1_1, "\\\\t");
                                            break;
                                        case 10:
                                            v0_2.appendReplacement(v1_1, "\\\\n");
                                            break;
                                        default:
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (v1_1 != null) {
                v0_2.appendTail(v1_1);
                p4 = v1_1.toString();
            }
        }
        return p4;
    }

    public static String unescapeString(String p4)
    {
        if (!android.text.TextUtils.isEmpty(p4)) {
            IllegalStateException v4_1 = com.google.android.gms.common.util.zzf.zza(p4);
            String v0_3 = com.google.android.gms.common.util.JsonUtils.zza.matcher(v4_1);
            StringBuffer v1_1 = 0;
            while (v0_3.find()) {
                if (v1_1 == null) {
                    v1_1 = new StringBuffer();
                }
                String v2_2 = v0_3.group().charAt(1);
                if (v2_2 == 34) {
                    v0_3.appendReplacement(v1_1, "\"");
                } else {
                    if (v2_2 == 47) {
                        v0_3.appendReplacement(v1_1, "/");
                    } else {
                        if (v2_2 == 92) {
                            v0_3.appendReplacement(v1_1, "\\\\");
                        } else {
                            if (v2_2 == 98) {
                                v0_3.appendReplacement(v1_1, "\u0008");
                            } else {
                                if (v2_2 == 102) {
                                    v0_3.appendReplacement(v1_1, "\u000c");
                                } else {
                                    if (v2_2 == 110) {
                                        v0_3.appendReplacement(v1_1, "\n");
                                    } else {
                                        if (v2_2 == 114) {
                                            v0_3.appendReplacement(v1_1, "\r");
                                        } else {
                                            if (v2_2 != 116) {
                                                throw new IllegalStateException("Found an escaped character that should never be.");
                                            } else {
                                                v0_3.appendReplacement(v1_1, "\t");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (v1_1 != null) {
                v0_3.appendTail(v1_1);
                p4 = v1_1.toString();
            } else {
                return v4_1;
            }
        }
        return p4;
    }
}
