package Util.Locale;

import java.util.Locale;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class LocaleExample {
    public static void main(String[] args) {
        Locale locale = new Locale("fr");
        System.out.println("Locale: "+ locale);

        Locale locale12 = new Locale("fr", "CANADA");
        System.out.println("Locale: " + locale12);

        Locale locale13 = new Locale("no", "NORWAY");
        System.out.println("Locale: " + locale13);

        Locale locale1FromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        System.out.println("localeFromBuilder: " + locale1FromBuilder);

        Locale forLangLocale = Locale.forLanguageTag("en-GB");
        System.out.println("forLangLocale: " + forLangLocale);

        Locale localCosnt = Locale.FRANCE;
        System.out.println("localCosnt: " + localCosnt );
    }
}
