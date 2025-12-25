package n;
public abstract class c1 {

    public static android.text.StaticLayout a(CharSequence p2, android.text.Layout$Alignment p3, int p4, int p5, android.widget.TextView p6, android.text.TextPaint p7, n.f1 p8)
    {
        android.text.StaticLayout v2_2 = android.text.StaticLayout$Builder.obtain(p2, 0, p2.length(), p7, p4);
        String v3_4 = v2_2.setAlignment(p3).setLineSpacing(p6.getLineSpacingExtra(), p6.getLineSpacingMultiplier()).setIncludePad(p6.getIncludeFontPadding()).setBreakStrategy(p6.getBreakStrategy()).setHyphenationFrequency(p6.getHyphenationFrequency());
        if (p5 == -1) {
            p5 = 2147483647;
        }
        v3_4.setMaxLines(p5);
        try {
            p8.a(v2_2, p6);
        } catch (ClassCastException) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return v2_2.build();
    }
}
