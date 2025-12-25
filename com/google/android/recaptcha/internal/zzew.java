package com.google.android.recaptcha.internal;
public final class zzew {
    private final java.net.HttpURLConnection zza;

    public zzew(java.net.HttpURLConnection p1)
    {
        this.zza = p1;
        return;
    }

    private final java.io.InputStream zzf()
    {
        try {
            return this.zza.getInputStream();
        } catch (String v0_4) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzaf, v0_4.getMessage());
        } catch (String v0_1) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzae, v0_1.getMessage());
        } catch (String v0_6) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzak, v0_6.getMessage());
        }
    }

    private final java.io.OutputStream zzg()
    {
        try {
            return this.zza.getOutputStream();
        } catch (String v0_4) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzaf, v0_4.getMessage());
        } catch (String v0_1) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzae, v0_1.getMessage());
        } catch (String v0_6) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzak, v0_6.getMessage());
        }
    }

    public final com.google.android.recaptcha.internal.zzoi zza(com.google.android.recaptcha.internal.zzoi p4)
    {
        try {
            com.google.android.recaptcha.internal.zzbb v0_4 = this.zza.getResponseCode();
        } catch (com.google.android.recaptcha.internal.zzbd v4_17) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzah, v4_17.getMessage());
        }
        if (v0_4 == 200) {
            com.google.android.recaptcha.internal.zzbb v0_3 = c4.b.S(this.zzf());
            if (v0_3.length == 0) {
                throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzat, 0);
            } else {
                try {
                    com.google.android.recaptcha.internal.zzbd v4_5 = p4.zzD().zzb(v0_3);
                    kotlin.jvm.internal.j.c(v4_5, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                    return ((com.google.android.recaptcha.internal.zzoi) v4_5);
                } catch (com.google.android.recaptcha.internal.zzbd v4_7) {
                    throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzG, v4_7.getMessage());
                }
            }
        } else {
            com.google.android.recaptcha.internal.zzbd v4_11;
            if (v0_4 == 400) {
                v4_11 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzau, 0);
            } else {
                if (v0_4 == 503) {
                    v4_11 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzi, com.google.android.recaptcha.internal.zzba.zzJ, 0);
                } else {
                    if (v0_4 == 403) {
                        v4_11 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzi, com.google.android.recaptcha.internal.zzba.zzJ, 0);
                    } else {
                        if (v0_4 == 404) {
                            v4_11 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzi, 0);
                        } else {
                            v4_11 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzK, 0);
                        }
                    }
                }
            }
            throw v4_11;
        }
    }

    public final java.net.HttpURLConnection zzb()
    {
        return this.zza;
    }

    public final void zzc()
    {
        try {
            this.zza.connect();
            return;
        } catch (String v0_3) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzac, v0_3.getMessage());
        } catch (String v0_1) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzad, v0_1.getMessage());
        } catch (String v0_5) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzaj, v0_5.getMessage());
        }
    }

    public final void zzd()
    {
        this.zza.disconnect();
        return;
    }

    public final void zze(byte[] p4)
    {
        try {
            this.zzg().write(p4);
            return;
        } catch (String v4_3) {
            throw v4_3;
        } catch (String v4_1) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzag, v4_1.getMessage());
        } catch (String v4_4) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzal, v4_4.getMessage());
        }
    }
}
