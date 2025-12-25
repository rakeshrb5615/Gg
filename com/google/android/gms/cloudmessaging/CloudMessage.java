package com.google.android.gms.cloudmessaging;
public final class CloudMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN;
    final android.content.Intent zza;
    private java.util.Map zzb;

    static CloudMessage()
    {
        com.google.android.gms.cloudmessaging.CloudMessage.CREATOR = new com.google.android.gms.cloudmessaging.zza();
        return;
    }

    public CloudMessage(android.content.Intent p1)
    {
        this.zza = p1;
        return;
    }

    private static int zzb(String p1)
    {
        if (!java.util.Objects.equals(p1, "high")) {
            if (!java.util.Objects.equals(p1, "normal")) {
                return 0;
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    public String getCollapseKey()
    {
        return this.zza.getStringExtra("collapse_key");
    }

    public declared_synchronized java.util.Map getData()
    {
        if (this.zzb == null) {
            java.util.Map v0_2 = this.zza.getExtras();
            r.e v1_1 = new r.e(0);
            if (v0_2 != null) {
                java.util.Iterator v2_1 = v0_2.keySet().iterator();
                while (v2_1.hasNext()) {
                    String v3_2 = ((String) v2_1.next());
                    String v4_0 = v0_2.get(v3_2);
                    if (((v4_0 instanceof String)) && ((!v3_2.startsWith("google.")) && ((!v3_2.equals("from")) && ((!v3_2.equals("message_type")) && (!v3_2.equals("collapse_key")))))) {
                        v1_1.put(v3_2, ((String) v4_0));
                    }
                }
            } else {
            }
            this.zzb = v1_1;
        }
        return this.zzb;
    }

    public String getFrom()
    {
        return this.zza.getStringExtra("from");
    }

    public android.content.Intent getIntent()
    {
        return this.zza;
    }

    public String getMessageId()
    {
        String v0_1 = this.zza.getStringExtra("google.message_id");
        if (v0_1 == null) {
            v0_1 = this.zza.getStringExtra("message_id");
        }
        return v0_1;
    }

    public String getMessageType()
    {
        return this.zza.getStringExtra("message_type");
    }

    public int getOriginalPriority()
    {
        int v0_2 = this.zza.getStringExtra("google.original_priority");
        if (v0_2 == 0) {
            v0_2 = this.zza.getStringExtra("google.priority");
        }
        return com.google.android.gms.cloudmessaging.CloudMessage.zzb(v0_2);
    }

    public int getPriority()
    {
        String v0_3 = this.zza.getStringExtra("google.delivered_priority");
        if (v0_3 == null) {
            if (!java.util.Objects.equals(this.zza.getStringExtra("google.priority_reduced"), "1")) {
                v0_3 = this.zza.getStringExtra("google.priority");
            } else {
                return 2;
            }
        }
        return com.google.android.gms.cloudmessaging.CloudMessage.zzb(v0_3);
    }

    public byte[] getRawData()
    {
        return this.zza.getByteArrayExtra("rawData");
    }

    public String getSenderId()
    {
        return this.zza.getStringExtra("google.c.sender.id");
    }

    public long getSentTime()
    {
        String v0_8;
        String v0_3 = this.zza.getExtras();
        if (v0_3 == null) {
            v0_8 = 0;
        } else {
            v0_8 = v0_3.get("google.sent_time");
        }
        if (!(v0_8 instanceof Long)) {
            if ((v0_8 instanceof String)) {
                try {
                    String v0_1 = Long.parseLong(((String) v0_8));
                    return v0_1;
                } catch (NumberFormatException) {
                    android.util.Log.w("CloudMessage", "Invalid sent time: ".concat(String.valueOf(v0_1)));
                }
            }
            return 0;
        } else {
            return ((Long) v0_8).longValue();
        }
    }

    public String getTo()
    {
        return this.zza.getStringExtra("google.to");
    }

    public int getTtl()
    {
        String v0_8;
        String v0_3 = this.zza.getExtras();
        if (v0_3 == null) {
            v0_8 = 0;
        } else {
            v0_8 = v0_3.get("google.ttl");
        }
        if (!(v0_8 instanceof Integer)) {
            if ((v0_8 instanceof String)) {
                try {
                    String v0_1 = Integer.parseInt(((String) v0_8));
                    return v0_1;
                } catch (NumberFormatException) {
                    android.util.Log.w("CloudMessage", "Invalid TTL: ".concat(String.valueOf(v0_1)));
                }
            }
            return 0;
        } else {
            return ((Integer) v0_8).intValue();
        }
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.zza, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final Integer zza()
    {
        if (!this.zza.hasExtra("google.product_id")) {
            return 0;
        } else {
            return Integer.valueOf(this.zza.getIntExtra("google.product_id", 0));
        }
    }
}
