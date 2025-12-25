package d0;
public abstract class d {
    public static final Object a;

    static d()
    {
        d0.d.a = new Object();
        return;
    }

    public static android.content.Intent a(h.i p3)
    {
        String v0_0 = p3.getParentActivityIntent();
        if (v0_0 == null) {
            try {
                String v0_6 = d0.d.c(p3, p3.getComponentName());
            } catch (android.content.Intent v3_9) {
                throw new IllegalArgumentException(v3_9);
            }
            if (v0_6 != null) {
                String v2_1 = new android.content.ComponentName(p3, v0_6);
                try {
                    if (d0.d.c(p3, v2_1) != null) {
                        return new android.content.Intent().setComponent(v2_1);
                    } else {
                        return android.content.Intent.makeMainActivity(v2_1);
                    }
                } catch (android.content.pm.PackageManager$NameNotFoundException) {
                    android.content.Intent v3_7 = new StringBuilder("getParentActivityIntent: bad parentActivityName \'");
                    v3_7.append(v0_6);
                    v3_7.append("\' in manifest");
                    android.util.Log.e("NavUtils", v3_7.toString());
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return v0_0;
        }
    }

    public static android.content.Intent b(h.i p2, android.content.ComponentName p3)
    {
        String v0 = d0.d.c(p2, p3);
        if (v0 != null) {
            android.content.ComponentName v1_1 = new android.content.ComponentName(p3.getPackageName(), v0);
            if (d0.d.c(p2, v1_1) != null) {
                return new android.content.Intent().setComponent(v1_1);
            } else {
                return android.content.Intent.makeMainActivity(v1_1);
            }
        } else {
            return 0;
        }
    }

    public static String c(android.content.Context p3, android.content.ComponentName p4)
    {
        int v1_3;
        StringBuilder v0_0 = p3.getPackageManager();
        if (android.os.Build$VERSION.SDK_INT < 29) {
            v1_3 = 787072;
        } else {
            v1_3 = 269222528;
        }
        String v4_3 = v0_0.getActivityInfo(p4, v1_3);
        StringBuilder v0_6 = v4_3.parentActivityName;
        if (v0_6 == null) {
            String v4_1 = v4_3.metaData;
            if (v4_1 != null) {
                String v4_2 = v4_1.getString("android.support.PARENT_ACTIVITY");
                if (v4_2 != null) {
                    if (v4_2.charAt(0) != 46) {
                        return v4_2;
                    } else {
                        StringBuilder v0_5 = new StringBuilder();
                        v0_5.append(p3.getPackageName());
                        v0_5.append(v4_2);
                        return v0_5.toString();
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return v0_6;
        }
    }

    public static void d(android.content.Context p5, String p6)
    {
        try {
            if (!p6.equals("")) {
                String v5_2 = p5.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                String v1_1 = android.util.Xml.newSerializer();
                try {
                    v1_1.setOutput(v5_2, 0);
                    v1_1.startDocument("UTF-8", Boolean.TRUE);
                    v1_1.startTag(0, "locales");
                    v1_1.attribute(0, "application_locales", p6);
                    v1_1.endTag(0, "locales");
                    v1_1.endDocument();
                } catch (Throwable v6_3) {
                    android.util.Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", v6_3);
                    if (v5_2 == null) {
                        return;
                    } else {
                        v5_2.close();
                    }
                } catch (Throwable v6_4) {
                    if (v5_2 != null) {
                        v5_2.close();
                    }
                    throw v6_4;
                }
                if (v5_2 == null) {
                } else {
                }
            } else {
                p5.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
        } catch (String v5_1) {
            throw v5_1;
        }
    }

    public static String e(android.content.Context p8)
    {
        try {
            String v1 = "";
        } catch (Throwable v8_1) {
            throw v8_1;
        }
        String v2_1 = p8.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        String v3_1 = android.util.Xml.newPullParser();
        v3_1.setInput(v2_1, "UTF-8");
        String v4_0 = v3_1.getDepth();
        do {
            int v5_0 = v3_1.next();
            if (v5_0 != 1) {
                if (v5_0 == 3) {
                    if (v3_1.getDepth() <= v4_0) {
                        if (v2_1 == null) {
                            if (v1.isEmpty()) {
                                p8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            } else {
                            }
                            return v1;
                        } else {
                            v2_1.close();
                        }
                    } else {
                    }
                }
                if (v5_0 != 3) {
                    if (v5_0 != 4) {
                    } else {
                    }
                }
            }
        } while(!v3_1.getName().equals("locales"));
        v1 = v3_1.getAttributeValue(0, "application_locales");
    }
}
