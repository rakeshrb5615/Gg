package com.google.android.gms.dynamite;
public final class DynamiteModule {
    public static final int LOCAL = 255;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = None;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = None;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = None;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy PREFER_LOCAL = None;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy PREFER_REMOTE = None;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = None;
    public static final int REMOTE = 1;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy zza = None;
    public static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy zzb = None;
    private static Boolean zzc = None;
    private static String zzd = "";
    private static boolean zze = False;
    private static int zzf = 255;
    private static Boolean zzg;
    private static final ThreadLocal zzh;
    private static final ThreadLocal zzi;
    private static final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions zzj;
    private static com.google.android.gms.dynamite.zzp zzl;
    private static com.google.android.gms.dynamite.zzq zzm;
    private final android.content.Context zzk;

    static DynamiteModule()
    {
        com.google.android.gms.dynamite.DynamiteModule.zzh = new ThreadLocal();
        com.google.android.gms.dynamite.DynamiteModule.zzi = new com.google.android.gms.dynamite.zze();
        com.google.android.gms.dynamite.DynamiteModule.zzj = new com.google.android.gms.dynamite.zzf();
        com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE = new com.google.android.gms.dynamite.zzg();
        com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL = new com.google.android.gms.dynamite.zzh();
        com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzi();
        com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = new com.google.android.gms.dynamite.zzj();
        com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzk();
        com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = new com.google.android.gms.dynamite.zzl();
        com.google.android.gms.dynamite.DynamiteModule.zza = new com.google.android.gms.dynamite.zzm();
        com.google.android.gms.dynamite.DynamiteModule.zzb = new com.google.android.gms.dynamite.zzc();
        return;
    }

    private DynamiteModule(android.content.Context p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zzk = p1;
        return;
    }

    public static int getLocalVersion(android.content.Context p9, String p10)
    {
        try {
            String v9_1 = p9.getApplicationContext().getClassLoader();
            StringBuilder v8_1 = new StringBuilder((String.valueOf(p10).length() + 61));
            v8_1.append("com.google.android.gms.dynamite.descriptors.");
            v8_1.append(p10);
            v8_1.append(".ModuleDescriptor");
            String v9_2 = v9_1.loadClass(v8_1.toString());
            int v4_2 = v9_2.getDeclaredField("MODULE_ID");
            String v9_3 = v9_2.getDeclaredField("MODULE_VERSION");
        } catch (ClassNotFoundException) {
            StringBuilder v1_2 = new StringBuilder((String.valueOf(p10).length() + 45));
            v1_2.append("Local module descriptor class for ");
            v1_2.append(p10);
            v1_2.append(" not found.");
            android.util.Log.w("DynamiteModule", v1_2.toString());
            return 0;
        }
        if (com.google.android.gms.common.internal.Objects.equal(v4_2.get(0), p10)) {
            return v9_3.getInt(0);
        } else {
            String v9_6 = String.valueOf(v4_2.get(0));
            StringBuilder v5_6 = new StringBuilder((((v9_6.length() + 50) + String.valueOf(p10).length()) + 1));
            v5_6.append("Module descriptor id \'");
            v5_6.append(v9_6);
            v5_6.append("\' didn\'t match expected id \'");
            v5_6.append(p10);
            v5_6.append("\'");
            android.util.Log.e("DynamiteModule", v5_6.toString());
            return 0;
        }
    }

    public static int getRemoteVersion(android.content.Context p1, String p2)
    {
        return com.google.android.gms.dynamite.DynamiteModule.zza(p1, p2, 0);
    }

    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context p30, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy p31, String p32)
    {
        android.content.Context v12 = p30.getApplicationContext();
        if (v12 == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("null application Context", 0);
        } else {
            ThreadLocal v14 = com.google.android.gms.dynamite.DynamiteModule.zzh;
            com.google.android.gms.dynamite.zzn v15_1 = ((com.google.android.gms.dynamite.zzn) v14.get());
            com.google.android.gms.dynamite.zzn v7_1 = new com.google.android.gms.dynamite.zzn(0);
            v14.set(v7_1);
            int v13_9 = com.google.android.gms.dynamite.DynamiteModule.zzi;
            Long v8_1 = ((Long) v13_9.get());
            long v20 = v8_1.longValue();
            v13_9.set(Long.valueOf(android.os.SystemClock.uptimeMillis()));
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult v9_2 = p31.selectModule(p30, p32, com.google.android.gms.dynamite.DynamiteModule.zzj);
            String v6_16 = v9_2.localVersion;
            String v2_12 = v9_2.remoteVersion;
            com.google.android.gms.dynamite.DynamiteModule$LoadingException v1_18 = new StringBuilder(((((((String.valueOf(p32).length() + 26) + String.valueOf(v6_16).length()) + 19) + String.valueOf(p32).length()) + 1) + String.valueOf(v2_12).length()));
            v1_18.append("Considering local module ");
            v1_18.append(p32);
            v1_18.append(":");
            v1_18.append(v6_16);
            v1_18.append(" and remote module ");
            v1_18.append(p32);
            v1_18.append(":");
            v1_18.append(v2_12);
            android.util.Log.i("DynamiteModule", v1_18.toString());
            com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_44 = v9_2.selection;
            if (v0_44 != null) {
                if (v0_44 == -1) {
                    if (v9_2.localVersion == 0) {
                        com.google.android.gms.dynamite.DynamiteModule$LoadingException v1_1 = v9_2.localVersion;
                        String v2_1 = v9_2.remoteVersion;
                        int v5_5 = new StringBuilder((((((String.valueOf(p32).length() + 46) + String.valueOf(v1_1).length()) + 23) + String.valueOf(v2_1).length()) + 1));
                        v5_5.append("No acceptable module ");
                        v5_5.append(p32);
                        v5_5.append(" found. Local version is ");
                        v5_5.append(v1_1);
                        v5_5.append(" and remote version is ");
                        v5_5.append(v2_1);
                        v5_5.append(".");
                        throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException(v5_5.toString(), 0);
                    } else {
                        v0_44 = -1;
                    }
                }
                if ((v0_44 != 1) || (v9_2.remoteVersion != 0)) {
                    if (v0_44 != -1) {
                        if (v0_44 != 1) {
                            StringBuilder v3_2 = new StringBuilder((String.valueOf(v0_44).length() + 36));
                            v3_2.append("VersionPolicy returned invalid code:");
                            v3_2.append(v0_44);
                            throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException(v3_2.toString(), 0);
                        } else {
                            try {
                                com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_4 = v9_2.remoteVersion;
                            } catch (com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_5) {
                                String v4_8 = p30;
                                String v6_12 = v0_5.getMessage();
                                String v11_12 = new StringBuilder((String.valueOf(v6_12).length() + 30));
                                v11_12.append("Failed to load remote module: ");
                                v11_12.append(v6_12);
                                android.util.Log.w("DynamiteModule", v11_12.toString());
                                int v5_37 = v9_2.localVersion;
                                if (v5_37 != 0) {
                                    if (p31.selectModule(v4_8, p32, new com.google.android.gms.dynamite.zzo(v5_37, 0)).selection == -1) {
                                        String v4_17 = com.google.android.gms.dynamite.DynamiteModule.zze(v12, p32);
                                        if (v20 != 0) {
                                            com.google.android.gms.dynamite.DynamiteModule.zzi.set(v8_1);
                                        } else {
                                            com.google.android.gms.dynamite.DynamiteModule.zzi.remove();
                                        }
                                        com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_40 = v7_1.zza;
                                        if (v0_40 != null) {
                                            v0_40.close();
                                        }
                                        com.google.android.gms.dynamite.DynamiteModule.zzh.set(v15_1);
                                        return v4_17;
                                    }
                                }
                                throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Remote load failed. No local fallback found.", v0_5, 0);
                            }
                            if (!com.google.android.gms.dynamite.DynamiteModule.zzb(p30)) {
                                throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Remote loading disabled", 0);
                            } else {
                                int v5_10 = com.google.android.gms.dynamite.DynamiteModule.zzc;
                                if (v5_10 == 0) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Failed to determine which loading route to use.", 0);
                                } else {
                                    if (!v5_10.booleanValue()) {
                                        int v13_4 = new StringBuilder(((String.valueOf(p32).length() + 40) + String.valueOf(v0_4).length()));
                                        v13_4.append("Selected remote version of ");
                                        v13_4.append(p32);
                                        v13_4.append(", version >= ");
                                        v13_4.append(v0_4);
                                        android.util.Log.i("DynamiteModule", v13_4.toString());
                                        String v4_12 = com.google.android.gms.dynamite.DynamiteModule.zzg(p30);
                                        if (v4_12 == null) {
                                            throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Failed to create IDynamiteLoader.", 0);
                                        } else {
                                            com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_14;
                                            String v6_3 = v4_12.zzi();
                                            if (v6_3 < 3) {
                                                if (v6_3 != 2) {
                                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    v0_14 = v4_12.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(p30), p32, v0_4);
                                                } else {
                                                    android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    v0_14 = v4_12.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(p30), p32, v0_4);
                                                }
                                            } else {
                                                int v5_20 = ((com.google.android.gms.dynamite.zzn) v14.get());
                                                if (v5_20 == 0) {
                                                    throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("No cached result cursor holder", 0);
                                                } else {
                                                    v0_14 = v4_12.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(p30), p32, v0_4, com.google.android.gms.dynamic.ObjectWrapper.wrap(v5_20.zza));
                                                }
                                            }
                                            com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_17 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(v0_14);
                                            if (v0_17 == null) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Failed to load remote module.", 0);
                                            } else {
                                                v4_17 = new com.google.android.gms.dynamite.DynamiteModule(((android.content.Context) v0_17));
                                            }
                                        }
                                    } else {
                                        int v13_8 = new StringBuilder(((String.valueOf(p32).length() + 40) + String.valueOf(v0_4).length()));
                                        v13_8.append("Selected remote version of ");
                                        v13_8.append(p32);
                                        v13_8.append(", version >= ");
                                        v13_8.append(v0_4);
                                        android.util.Log.i("DynamiteModule", v13_8.toString());
                                        String v6_9 = com.google.android.gms.dynamite.DynamiteModule.zzm;
                                        if (v6_9 == null) {
                                            throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.", 0);
                                        } else {
                                            String v4_21 = ((com.google.android.gms.dynamite.zzn) v14.get());
                                            if ((v4_21 == null) || (v4_21.zza == null)) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("No result cursor", 0);
                                            } else {
                                                android.content.Context v10_5 = p30.getApplicationContext();
                                                String v4_23 = v4_21.zza;
                                                com.google.android.gms.dynamic.ObjectWrapper.wrap(0);
                                                String v29;
                                                if (com.google.android.gms.dynamite.DynamiteModule.zzf < 2) {
                                                    v29 = 0;
                                                } else {
                                                    v29 = 1;
                                                }
                                                com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_28;
                                                if (v29 == null) {
                                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    v0_28 = v6_9.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(v10_5), p32, v0_4, com.google.android.gms.dynamic.ObjectWrapper.wrap(v4_23));
                                                } else {
                                                    android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    v0_28 = v6_9.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(v10_5), p32, v0_4, com.google.android.gms.dynamic.ObjectWrapper.wrap(v4_23));
                                                }
                                                com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_30 = ((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(v0_28));
                                                if (v0_30 == null) {
                                                    throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Failed to get module context", 0);
                                                } else {
                                                    v4_17 = new com.google.android.gms.dynamite.DynamiteModule(v0_30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        com.google.android.gms.dynamite.DynamiteModule$LoadingException v0_42 = com.google.android.gms.dynamite.DynamiteModule.zze(v12, p32);
                        if (v20 != 0) {
                            v13_9.set(v8_1);
                        } else {
                            v13_9.remove();
                        }
                        com.google.android.gms.dynamite.DynamiteModule$LoadingException v1_16 = v7_1.zza;
                        if (v1_16 != null) {
                            v1_16.close();
                        }
                        v14.set(v15_1);
                        return v0_42;
                    }
                }
            }
        }
    }

    public static int zza(android.content.Context p12, String p13, boolean p14)
    {
        try {
        } catch (boolean v0_26) {
            String v13_16 = v0_26;
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(p12, v13_16);
            throw v13_16;
        }
        boolean v0_27 = com.google.android.gms.dynamite.DynamiteModule.zzc;
        String v4 = 0;
        int v5 = 0;
        if (!v0_27) {
            try {
                boolean v0_16 = p12.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.getName()).getDeclaredField("sClassLoader");
                v0_16.getDeclaringClass();
            } catch (boolean v0_30) {
                boolean v0_31 = v0_30.toString();
                int v8_7 = new StringBuilder((v0_31.length() + 30));
                v8_7.append("Failed to load module via V2: ");
                v8_7.append(v0_31);
                android.util.Log.w("DynamiteModule", v8_7.toString());
                v0_27 = Boolean.FALSE;
                com.google.android.gms.dynamite.DynamiteModule.zzc = v0_27;
            } catch (boolean v0_30) {
            } catch (boolean v0_30) {
            }
            ClassLoader v7_2 = ((ClassLoader) v0_16.get(0));
            if (v7_2 != ClassLoader.getSystemClassLoader()) {
                if (v7_2 == null) {
                    if (com.google.android.gms.dynamite.DynamiteModule.zzb(p12)) {
                        if (!com.google.android.gms.dynamite.DynamiteModule.zze) {
                            ClassLoader v7_5 = Boolean.TRUE;
                            if (!v7_5.equals(0)) {
                                int v8_5 = com.google.android.gms.dynamite.DynamiteModule.zzc(p12, p13, p14, 1);
                                com.google.android.gms.dynamite.zzd v9_2 = com.google.android.gms.dynamite.DynamiteModule.zzd;
                                if (v9_2 != null) {
                                    if (!v9_2.isEmpty()) {
                                        com.google.android.gms.dynamite.zzd v9_4 = com.google.android.gms.dynamite.zzb.zza();
                                        if (v9_4 == null) {
                                            if (android.os.Build$VERSION.SDK_INT < 29) {
                                                String v10_2 = com.google.android.gms.dynamite.DynamiteModule.zzd;
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(v10_2);
                                                v9_4 = new com.google.android.gms.dynamite.zzd(v10_2, ClassLoader.getSystemClassLoader());
                                            } else {
                                                com.google.android.gms.dynamite.a.b();
                                                com.google.android.gms.dynamite.zzd v9_7 = com.google.android.gms.dynamite.DynamiteModule.zzd;
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(v9_7);
                                                v9_4 = com.google.android.gms.dynamite.a.a(v9_7, ClassLoader.getSystemClassLoader());
                                            }
                                        } else {
                                        }
                                        com.google.android.gms.dynamite.DynamiteModule.zzf(v9_4);
                                        v0_16.set(0, v9_4);
                                        com.google.android.gms.dynamite.DynamiteModule.zzc = v7_5;
                                        return v8_5;
                                    } else {
                                    }
                                }
                                return v8_5;
                            }
                        }
                        v0_16.set(0, ClassLoader.getSystemClassLoader());
                        v0_27 = Boolean.FALSE;
                    } else {
                        return 0;
                    }
                } else {
                    com.google.android.gms.dynamite.DynamiteModule.zzf(v7_2);
                    v0_27 = Boolean.TRUE;
                }
            } else {
                v0_27 = Boolean.FALSE;
            }
        }
        if (!v0_27.booleanValue()) {
            com.google.android.gms.dynamite.zzp v6_0 = com.google.android.gms.dynamite.DynamiteModule.zzg(p12);
            if (v6_0 != null) {
                boolean v0_3 = v6_0.zzi();
                if (v0_3 < 3) {
                    if (v0_3 != 2) {
                        android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                        v5 = v6_0.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(p12), p13, p14);
                    } else {
                        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                        v5 = v6_0.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(p12), p13, p14);
                    }
                } else {
                    boolean v0_6 = ((com.google.android.gms.dynamite.zzn) com.google.android.gms.dynamite.DynamiteModule.zzh.get());
                    if (v0_6) {
                        boolean v0_7 = v0_6.zza;
                        if (v0_7) {
                            v5 = v0_7.getInt(0);
                            return v5;
                        }
                    }
                    String v13_9 = ((android.database.Cursor) com.google.android.gms.dynamic.ObjectWrapper.unwrap(v6_0.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(p12), p13, p14, ((Long) com.google.android.gms.dynamite.DynamiteModule.zzi.get()).longValue())));
                    try {
                        if (v13_9 != null) {
                            if (v13_9.moveToFirst()) {
                                int v14_4 = v13_9.getInt(0);
                                if ((v14_4 <= 0) || (!com.google.android.gms.dynamite.DynamiteModule.zzd(v13_9))) {
                                    v4 = v13_9;
                                }
                                if (v4 != null) {
                                    v4.close();
                                }
                                v5 = v14_4;
                                return v5;
                            } else {
                            }
                        }
                    } catch (boolean v0_15) {
                        int v14_7 = v0_15;
                        v4 = v13_9;
                        int v14_8 = v14_7.getMessage();
                        StringBuilder v2_3 = new StringBuilder((String.valueOf(v14_8).length() + 42));
                        v2_3.append("Failed to retrieve remote module version: ");
                        v2_3.append(v14_8);
                        android.util.Log.w("DynamiteModule", v2_3.toString());
                        if (v4 != null) {
                            v4.close();
                        }
                    } catch (boolean v0_14) {
                        int v14_6 = v0_14;
                        v4 = v13_9;
                        if (v4 != null) {
                            v4.close();
                        }
                        throw v14_6;
                    }
                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    if (v13_9 != null) {
                        v13_9.close();
                    }
                }
            }
            return v5;
        } else {
            try {
                p12 = com.google.android.gms.dynamite.DynamiteModule.zzc(p12, p13, p14, 0);
                return p12;
            } catch (boolean v0_22) {
                String v13_14 = v0_22.getMessage();
                StringBuilder v2_5 = new StringBuilder((String.valueOf(v13_14).length() + 42));
                v2_5.append("Failed to retrieve remote module version: ");
                v2_5.append(v13_14);
                android.util.Log.w("DynamiteModule", v2_5.toString());
                return 0;
            }
        }
    }

    private static boolean zzb(android.content.Context p6)
    {
        android.content.pm.ProviderInfo v0_0 = Boolean.TRUE;
        if (!v0_0.equals(0)) {
            if (!v0_0.equals(com.google.android.gms.dynamite.DynamiteModule.zzg)) {
                int v3 = 0;
                if (com.google.android.gms.dynamite.DynamiteModule.zzg == null) {
                    String v4_1;
                    android.content.pm.ProviderInfo v0_2 = p6.getPackageManager();
                    if (1 == com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()) {
                        v4_1 = 268435456;
                    } else {
                        v4_1 = 0;
                    }
                    android.content.pm.ProviderInfo v0_3 = v0_2.resolveContentProvider("com.google.android.gms.chimera", v4_1);
                    if ((com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(p6, 10000000) == 0) && ((v0_3 != null) && ("com.google.android.gms".equals(v0_3.packageName)))) {
                        v3 = 1;
                    }
                    com.google.android.gms.dynamite.DynamiteModule.zzg = Boolean.valueOf(v3);
                    if (v3 != 0) {
                        String v6_5 = v0_3.applicationInfo;
                        if ((v6_5 != null) && ((v6_5.flags & 129) == 0)) {
                            android.util.Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                            com.google.android.gms.dynamite.DynamiteModule.zze = 1;
                        }
                    }
                }
                if (v3 == 0) {
                    android.util.Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                }
                return v3;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    private static int zzc(android.content.Context p14, String p15, boolean p16, boolean p17)
    {
        android.database.MatrixCursor v2 = 0;
        try {
            String v3_3 = ((Long) com.google.android.gms.dynamite.DynamiteModule.zzi.get()).longValue();
            android.os.RemoteException v0_8 = "api_force_staging";
            String v6 = 1;
        } catch (android.os.RemoteException v0_4) {
            boolean v14_3 = v0_4;
            android.database.MatrixCursor v8_0 = 0;
            if ((v14_3 instanceof com.google.android.gms.dynamite.DynamiteModule$LoadingException)) {
                throw v14_3;
            } else {
                String v3_1 = v14_3.getMessage();
                String v5_5 = new StringBuilder((String.valueOf(v3_1).length() + 25));
                v5_5.append("V2 version check failed: ");
                v5_5.append(v3_1);
                throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException(v5_5.toString(), v14_3, 0);
            }
        } catch (android.os.RemoteException v0_3) {
            boolean v14_2 = v0_3;
            if (v2 != null) {
                v2.close();
            }
            throw v14_2;
        } catch (android.os.RemoteException v0_16) {
            v14_2 = v0_16;
            v2 = v8_0;
        }
        if (1 != p16) {
            v0_8 = "api";
        }
        android.database.MatrixCursor v8_1 = new android.net.Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").path(v0_8).appendPath(p15).appendQueryParameter("requestStartUptime", String.valueOf(v3_3)).build();
        android.content.ContentProviderClient v7_3 = p14.getContentResolver().acquireUnstableContentProviderClient(v8_1);
        String v3_0 = 0;
        if (v7_3 != null) {
            try {
                Class v4_3 = v7_3.query(v8_1, 0, 0, 0, 0);
            } catch (android.os.RemoteException v0_2) {
                boolean v14_1 = v0_2;
                v7_3.release();
                throw v14_1;
            }
            if (v4_3 != null) {
                android.os.RemoteException v0_22 = v4_3.getCount();
                String v5_8 = v4_3.getColumnCount();
                v8_0 = new android.database.MatrixCursor(v4_3.getColumnNames(), v0_22);
                int v9_2 = 0;
                while (v9_2 < v0_22) {
                    if (!v4_3.moveToPosition(v9_2)) {
                        throw new android.os.RemoteException("Cursor read incomplete (ContentProvider dead?)");
                    } else {
                        Object[] v10_2 = new Object[v5_8];
                        int v11_0 = 0;
                        while (v11_0 < v5_8) {
                            byte[] v12_1 = v4_3.getType(v11_0);
                            if (v12_1 == null) {
                                v10_2[v11_0] = 0;
                            } else {
                                if (v12_1 == 1) {
                                    v10_2[v11_0] = Long.valueOf(v4_3.getLong(v11_0));
                                } else {
                                    if (v12_1 == 2) {
                                        v10_2[v11_0] = Double.valueOf(v4_3.getDouble(v11_0));
                                    } else {
                                        if (v12_1 == 3) {
                                            v10_2[v11_0] = v4_3.getString(v11_0);
                                        } else {
                                            if (v12_1 != 4) {
                                                throw new android.os.RemoteException("Unknown column type");
                                            } else {
                                                v10_2[v11_0] = v4_3.getBlob(v11_0);
                                            }
                                        }
                                    }
                                }
                            }
                            v11_0++;
                        }
                        v8_0.addRow(v10_2);
                        v9_2++;
                    }
                }
                v4_3.close();
                v7_3.release();
            } else {
                v7_3.release();
                v8_0 = 0;
            }
        }
        try {
            if ((v8_0 == null) || (!v8_0.moveToFirst())) {
                android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.", 0);
            } else {
                android.os.RemoteException v0_9 = v8_0.getInt(0);
                if (v0_9 > null) {
                    com.google.android.gms.dynamite.DynamiteModule.zzd = v8_0.getString(2);
                    boolean v14_9 = v8_0.getColumnIndex("loaderVersion");
                    if (v14_9) {
                        com.google.android.gms.dynamite.DynamiteModule.zzf = v8_0.getInt(v14_9);
                    }
                    boolean v14_12 = v8_0.getColumnIndex("disableStandaloneDynamiteLoader2");
                    if (v14_12) {
                        if (v8_0.getInt(v14_12) == 0) {
                            v6 = 0;
                        } else {
                        }
                        com.google.android.gms.dynamite.DynamiteModule.zze = v6;
                        v3_0 = v6;
                    }
                    if (com.google.android.gms.dynamite.DynamiteModule.zzd(v8_0)) {
                        v8_0 = 0;
                    }
                }
                if (p17) {
                    if (v3_0 != null) {
                        throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl", 0);
                    } else {
                    }
                }
                if (v8_0 != null) {
                    v8_0.close();
                }
                return v0_9;
            }
        } catch (android.os.RemoteException v0_12) {
            v14_3 = v0_12;
        }
    }

    private static boolean zzd(android.database.Cursor p2)
    {
        com.google.android.gms.dynamite.zzn v0_2 = ((com.google.android.gms.dynamite.zzn) com.google.android.gms.dynamite.DynamiteModule.zzh.get());
        if ((v0_2 == null) || (v0_2.zza != null)) {
            return 0;
        } else {
            v0_2.zza = p2;
            return 1;
        }
    }

    private static com.google.android.gms.dynamite.DynamiteModule zze(android.content.Context p2, String p3)
    {
        android.util.Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(p3)));
        return new com.google.android.gms.dynamite.DynamiteModule(p2);
    }

    private static void zzf(ClassLoader p3)
    {
        com.google.android.gms.dynamite.zzq v1_4;
        NoSuchMethodException v3_5 = ((android.os.IBinder) p3.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(0).newInstance(0));
        if (v3_5 != null) {
            com.google.android.gms.dynamite.zzq v1_2 = v3_5.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
            if (!(v1_2 instanceof com.google.android.gms.dynamite.zzq)) {
                v1_4 = new com.google.android.gms.dynamite.zzq(v3_5);
            } else {
                v1_4 = ((com.google.android.gms.dynamite.zzq) v1_2);
            }
        } else {
            v1_4 = 0;
        }
        com.google.android.gms.dynamite.DynamiteModule.zzm = v1_4;
        return;
    }

    private static com.google.android.gms.dynamite.zzp zzg(android.content.Context p6)
    {
        try {
            int v2_0 = com.google.android.gms.dynamite.DynamiteModule.zzl;
        } catch (String v6_8) {
            throw v6_8;
        }
        if (v2_0 == 0) {
            com.google.android.gms.dynamite.zzp v3_4;
            String v6_4 = ((android.os.IBinder) p6.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
            if (v6_4 != null) {
                com.google.android.gms.dynamite.zzp v3_2 = v6_4.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                if (!(v3_2 instanceof com.google.android.gms.dynamite.zzp)) {
                    v3_4 = new com.google.android.gms.dynamite.zzp(v6_4);
                } else {
                    v3_4 = ((com.google.android.gms.dynamite.zzp) v3_2);
                }
            } else {
                v3_4 = 0;
            }
            if (v3_4 == null) {
                return 0;
            } else {
                com.google.android.gms.dynamite.DynamiteModule.zzl = v3_4;
                return v3_4;
            }
        } else {
            return v2_0;
        }
    }

    public android.content.Context getModuleContext()
    {
        return this.zzk;
    }

    public android.os.IBinder instantiate(String p4)
    {
        try {
            return ((android.os.IBinder) this.zzk.getClassLoader().loadClass(p4).newInstance());
        } catch (IllegalAccessException v0_1) {
            throw new com.google.android.gms.dynamite.DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(String.valueOf(p4)), v0_1, 0);
        } catch (IllegalAccessException v0_1) {
        } catch (IllegalAccessException v0_1) {
        }
    }
}
