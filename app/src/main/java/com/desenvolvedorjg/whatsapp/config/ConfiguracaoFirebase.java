package com.desenvolvedorjg.whatsapp.config;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public final class ConfiguracaoFirebase {

    private static DatabaseReference referenciaDatabase;

    public static DatabaseReference getFirebase() {

        if (referenciaDatabase == null ) {
            referenciaDatabase = FirebaseDatabase.getInstance().getReference();
        }

        return referenciaDatabase;
    }
}
