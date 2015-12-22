package Util.Locale;

import java.util.Locale;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class LocalMethodExample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Default Locale: "+ locale);

        Locale[]availableLocale = Locale.getAvailableLocales();
        for (Locale aLocale : availableLocale) {
            System.out.println("Name of Locale: " + aLocale.getDisplayName());
            System.out.println("Language Code: " + aLocale.getLanguage()+ ", Language Display Name: " + aLocale.getDisplayName());
            System.out.println("Country Code: " + aLocale.getDisplayCountry() + ", Country Display Name: " + aLocale.getDisplayScript());
            if (!aLocale.getScript().equals("")){
                System.out.println("Script Code: "+aLocale.getScript()+", Script Display Name: "+aLocale.getDisplayScript());
            }
            if(!aLocale.getVariant().equals("")){
                System.out.println("Variant Code: "+aLocale.getVariant() +", Variant Display Name: "+aLocale.getDisplayVariant());
            }
            System.out.println("****************************************************************");
        }
    }
}
