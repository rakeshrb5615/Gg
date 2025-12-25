package o0;
public final class c {
    public final android.text.TextPaint a;
    public final android.text.TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public c(android.text.PrecomputedText$Params p2)
    {
        this.a = p2.getTextPaint();
        this.b = p2.getTextDirection();
        this.c = p2.getBreakStrategy();
        this.d = p2.getHyphenationFrequency();
        return;
    }

    public c(android.text.TextPaint p3, android.text.TextDirectionHeuristic p4, int p5, int p6)
    {
        if (android.os.Build$VERSION.SDK_INT >= 29) {
            new android.text.PrecomputedText$Params$Builder(p3).setBreakStrategy(p5).setHyphenationFrequency(p6).setTextDirection(p4).build();
        }
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if (((p5 instanceof o0.c)) && ((this.c == ((o0.c) p5).c) && (this.d == ((o0.c) p5).d))) {
                android.text.TextDirectionHeuristic v0_1 = this.a;
                android.text.TextPaint v2 = ((o0.c) p5).a;
                if ((v0_1.getTextSize() == v2.getTextSize()) && ((v0_1.getTextScaleX() == v2.getTextScaleX()) && ((v0_1.getTextSkewX() == v2.getTextSkewX()) && ((v0_1.getLetterSpacing() == v2.getLetterSpacing()) && ((android.text.TextUtils.equals(v0_1.getFontFeatureSettings(), v2.getFontFeatureSettings())) && ((v0_1.getFlags() == v2.getFlags()) && (v0_1.getTextLocales().equals(v2.getTextLocales())))))))) {
                    if (v0_1.getTypeface() != null) {
                        if (!v0_1.getTypeface().equals(v2.getTypeface())) {
                            return 0;
                        }
                    } else {
                        if (v2.getTypeface() != null) {
                            return 0;
                        }
                    }
                    if (this.b == ((o0.c) p5).b) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        Float v2 = Float.valueOf(v0_0.getTextSize());
        Float.valueOf(v0_0.getTextScaleX());
        Float.valueOf(v0_0.getTextSkewX());
        Float.valueOf(v0_0.getLetterSpacing());
        Integer.valueOf(v0_0.getFlags());
        v0_0.getTextLocales();
        v0_0.getTypeface();
        Boolean.valueOf(v0_0.isElegantTextHeight());
        Integer.valueOf(this.c);
        return java.util.Objects.hash(new Object[] {v2, Integer.valueOf(this.d)}));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("{");
        String v1_17 = new StringBuilder("textSize=");
        int v2_1 = this.a;
        v1_17.append(v2_1.getTextSize());
        v0_2.append(v1_17.toString());
        String v1_4 = new StringBuilder(", textScaleX=");
        v1_4.append(v2_1.getTextScaleX());
        v0_2.append(v1_4.toString());
        String v1_7 = new StringBuilder(", textSkewX=");
        v1_7.append(v2_1.getTextSkewX());
        v0_2.append(v1_7.toString());
        String v1_11 = new StringBuilder(", letterSpacing=");
        v1_11.append(v2_1.getLetterSpacing());
        v0_2.append(v1_11.toString());
        String v1_14 = new StringBuilder(", elegantTextHeight=");
        v1_14.append(v2_1.isElegantTextHeight());
        v0_2.append(v1_14.toString());
        String v1_18 = new StringBuilder(", textLocale=");
        v1_18.append(v2_1.getTextLocales());
        v0_2.append(v1_18.toString());
        String v1_21 = new StringBuilder(", typeface=");
        v1_21.append(v2_1.getTypeface());
        v0_2.append(v1_21.toString());
        String v1_24 = new StringBuilder(", variationSettings=");
        v1_24.append(v2_1.getFontVariationSettings());
        v0_2.append(v1_24.toString());
        String v1_27 = new StringBuilder(", textDir=");
        v1_27.append(this.b);
        v0_2.append(v1_27.toString());
        String v1_30 = new StringBuilder(", breakStrategy=");
        v1_30.append(this.c);
        v0_2.append(v1_30.toString());
        String v1_33 = new StringBuilder(", hyphenationFrequency=");
        v1_33.append(this.d);
        v0_2.append(v1_33.toString());
        v0_2.append("}");
        return v0_2.toString();
    }
}
