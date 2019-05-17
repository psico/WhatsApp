package com.desenvolvedorjg.whatsapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.desenvolvedorjg.whatsapp.R;
import com.desenvolvedorjg.whatsapp.model.Contato;
import com.desenvolvedorjg.whatsapp.model.Conversa;

import java.util.ArrayList;

public class ConversasAdapter extends ArrayAdapter<Conversa> {

    private ArrayList<Conversa> conversas;
    private Context context;

    public ConversasAdapter(Context c, ArrayList<Conversa> objects) {
        super(c, 0, objects);
        this.conversas = objects;
        this.context = c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        //Verifica se a lista está vazia
        if (conversas != null ) {

            //Inicializar objeto para montagem da view
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            //Monta view a partir do xml
            view = inflater.inflate(R.layout.lista_conversas, parent, false);

            //Recupera elemento para exibição
            TextView titulo = (TextView) view.findViewById(R.id.tv_titulo);
            TextView ultimaMensagem = (TextView) view.findViewById(R.id.tv_subtitulo);

            Conversa conversa = conversas.get( position );
            titulo.setText(conversa.getNome());
            ultimaMensagem.setText(conversa.getMensagem());
        }

        return view;
    }
}
