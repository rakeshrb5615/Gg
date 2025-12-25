package t8;
public final class d {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final t8.a e;

    public d()
    {
        this.a = 1;
        this.b = "    ";
        this.c = "type";
        this.d = 1;
        this.e = t8.a.a;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=");
        v0_1.append(this.a);
        v0_1.append(", prettyPrintIndent=\'");
        v0_1.append(this.b);
        v0_1.append("\', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator=\'");
        v0_1.append(this.c);
        v0_1.append("\', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        v0_1.append(this.d);
        v0_1.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }
}
