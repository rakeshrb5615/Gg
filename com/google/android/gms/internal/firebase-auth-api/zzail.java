package com.google.android.gms.internal.firebase-auth-api;
public final class zzail implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzaiw zzg;
    private boolean zzh;
    private com.google.android.gms.internal.firebase-auth-api.zzaiw zzi;
    private String zzj;

    public zzail()
    {
        this.zzh = 1;
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzaiw();
        this.zzi = new com.google.android.gms.internal.firebase-auth-api.zzaiw();
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zza(String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzi.zzb().add(p2);
        return this;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("returnSecureToken", this.zzh);
        String v2_0 = 0;
        if (!this.zzi.zzb().isEmpty()) {
            String v1_1 = this.zzi.zzb();
            int v3_1 = new org.json.JSONArray();
            int v4_0 = 0;
            while (v4_0 < v1_1.size()) {
                v3_1.put(v1_1.get(v4_0));
                v4_0++;
            }
            v0_1.put("deleteProvider", v3_1);
        }
        String v1_5 = this.zzg.zzb();
        int v3_2 = v1_5.size();
        int v4_1 = new int[v3_2];
        int v5_0 = 0;
        while (v5_0 < v1_5.size()) {
            boolean v6_3 = ((String) v1_5.get(v5_0));
            v6_3.getClass();
            int v8 = 2;
            int v10 = -1;
            switch (v6_3.hashCode()) {
                case -333046776:
                    if (v6_3.equals("DISPLAY_NAME")) {
                        v10 = 0;
                    } else {
                    }
                    break;
                case 66081660:
                    if (v6_3.equals("EMAIL")) {
                        v10 = 1;
                    } else {
                    }
                    break;
                case 1939891618:
                    if (v6_3.equals("PHOTO_URL")) {
                        v10 = 2;
                    } else {
                    }
                    break;
                case 1999612571:
                    if (v6_3.equals("PASSWORD")) {
                        v10 = 3;
                    } else {
                    }
                    break;
                default:
            }
            switch (v10) {
                case 0:
                    break;
                case 1:
                    v8 = 1;
                    break;
                case 2:
                    v8 = 4;
                    break;
                case 3:
                    v8 = 5;
                    break;
                default:
                    v8 = 0;
            }
            v4_1[v5_0] = v8;
            v5_0++;
        }
        if (v3_2 > 0) {
            String v1_7 = new org.json.JSONArray();
            while (v2_0 < v3_2) {
                v1_7.put(v4_1[v2_0]);
                v2_0++;
            }
            v0_1.put("deleteAttribute", v1_7);
        }
        String v1_8 = this.zza;
        if (v1_8 != null) {
            v0_1.put("idToken", v1_8);
        }
        String v1_9 = this.zzc;
        if (v1_9 != null) {
            v0_1.put("email", v1_9);
        }
        String v1_10 = this.zzd;
        if (v1_10 != null) {
            v0_1.put("password", v1_10);
        }
        String v1_12 = this.zzb;
        if (v1_12 != null) {
            v0_1.put("displayName", v1_12);
        }
        String v1_13 = this.zzf;
        if (v1_13 != null) {
            v0_1.put("photoUrl", v1_13);
        }
        String v1_14 = this.zze;
        if (v1_14 != null) {
            v0_1.put("oobCode", v1_14);
        }
        String v1_15 = this.zzj;
        if (v1_15 != null) {
            v0_1.put("tenantId", v1_15);
        }
        return v0_1.toString();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zzb(String p2)
    {
        if (p2 != null) {
            this.zzb = p2;
            return this;
        } else {
            this.zzg.zzb().add("DISPLAY_NAME");
            return this;
        }
    }

    public final String zzb()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zzc(String p2)
    {
        if (p2 != null) {
            this.zzc = p2;
            return this;
        } else {
            this.zzg.zzb().add("EMAIL");
            return this;
        }
    }

    public final String zzc()
    {
        return this.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zzd(String p1)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public final String zzd()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zze(String p1)
    {
        this.zze = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public final String zze()
    {
        return this.zzf;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zzf(String p2)
    {
        if (p2 != null) {
            this.zzd = p2;
            return this;
        } else {
            this.zzg.zzb().add("PASSWORD");
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zzg(String p2)
    {
        if (p2 != null) {
            this.zzf = p2;
            return this;
        } else {
            this.zzg.zzb().add("PHOTO_URL");
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzail zzh(String p1)
    {
        this.zzj = p1;
        return this;
    }

    public final boolean zzi(String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        return this.zzg.zzb().contains(p2);
    }
}
