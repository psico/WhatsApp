package com.desenvolvedorjg.whatsapp.helper;

import android.util.Base64;

public class Base64Custom {

    public static String codificarBase64(String texto) {
        return Base64.encodeToString(texto.getBytes(), Base64.DEFAULT).replaceAll("(\\n|\\r)", "");
    }

    public static String decodificarBase64(String textoCodificiado) {
        return new String(Base64.decode(textoCodificiado, Base64.DEFAULT));
    }
}
