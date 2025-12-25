package com.google.android.gms.fido.common;
public final enum class Transport extends java.lang.Enum implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final enum com.google.android.gms.fido.common.Transport BLUETOOTH_CLASSIC;
    public static final enum com.google.android.gms.fido.common.Transport BLUETOOTH_LOW_ENERGY;
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.common.Transport HYBRID;
    public static final enum com.google.android.gms.fido.common.Transport INTERNAL;
    public static final enum com.google.android.gms.fido.common.Transport NFC;
    public static final enum com.google.android.gms.fido.common.Transport USB;
    private static final synthetic com.google.android.gms.fido.common.Transport[] zza;
    private final String zzb;

    static Transport()
    {
        com.google.android.gms.fido.common.zza v0_3 = new com.google.android.gms.fido.common.Transport("BLUETOOTH_CLASSIC", 0, "bt");
        com.google.android.gms.fido.common.Transport.BLUETOOTH_CLASSIC = v0_3;
        com.google.android.gms.fido.common.Transport.BLUETOOTH_LOW_ENERGY = new com.google.android.gms.fido.common.Transport("BLUETOOTH_LOW_ENERGY", 1, "ble");
        com.google.android.gms.fido.common.Transport.NFC = new com.google.android.gms.fido.common.Transport("NFC", 2, "nfc");
        com.google.android.gms.fido.common.Transport.USB = new com.google.android.gms.fido.common.Transport("USB", 3, "usb");
        com.google.android.gms.fido.common.Transport.INTERNAL = new com.google.android.gms.fido.common.Transport("INTERNAL", 4, "internal");
        com.google.android.gms.fido.common.Transport v5_4 = new com.google.android.gms.fido.common.Transport("HYBRID", 5, "cable");
        com.google.android.gms.fido.common.Transport.HYBRID = v5_4;
        com.google.android.gms.fido.common.Transport.zza = new com.google.android.gms.fido.common.Transport[] {v0_3, v5_4});
        com.google.android.gms.fido.common.Transport.CREATOR = new com.google.android.gms.fido.common.zza();
        return;
    }

    private Transport(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.common.Transport fromString(String p5)
    {
        com.google.android.gms.fido.common.Transport$UnsupportedTransportException v0_0 = com.google.android.gms.fido.common.Transport.values();
        String v2_1 = 0;
        while (v2_1 < v0_0.length) {
            com.google.android.gms.fido.common.Transport v3 = v0_0[v2_1];
            if (!p5.equals(v3.zzb)) {
                v2_1++;
            } else {
                return v3;
            }
        }
        if (!p5.equals("hybrid")) {
            throw new com.google.android.gms.fido.common.Transport$UnsupportedTransportException(v1.a.l("Transport ", p5, " not supported"));
        } else {
            return com.google.android.gms.fido.common.Transport.HYBRID;
        }
    }

    public static java.util.List parseTransports(org.json.JSONArray p4)
    {
        if (p4 != null) {
            java.util.HashSet v0_1 = new java.util.HashSet(p4.length());
            int v1_0 = 0;
            while (v1_0 < p4.length()) {
                String v2_0 = p4.getString(v1_0);
                if ((v2_0 != null) && (!v2_0.isEmpty())) {
                    try {
                        v0_1.add(com.google.android.gms.fido.common.Transport.fromString(v2_0));
                    } catch (com.google.android.gms.fido.common.Transport$UnsupportedTransportException) {
                        android.util.Log.w("Transport", "Ignoring unrecognized transport ".concat(v2_0));
                    }
                }
                v1_0++;
            }
            return new java.util.ArrayList(v0_1);
        } else {
            return 0;
        }
    }

    public static com.google.android.gms.fido.common.Transport valueOf(String p1)
    {
        return ((com.google.android.gms.fido.common.Transport) Enum.valueOf(com.google.android.gms.fido.common.Transport, p1));
    }

    public static com.google.android.gms.fido.common.Transport[] values()
    {
        return ((com.google.android.gms.fido.common.Transport[]) com.google.android.gms.fido.common.Transport.zza.clone());
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeString(this.zzb);
        return;
    }
}
