package com.devifsc.estagiario.appeventos.IHC;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.devifsc.estagiario.appeventos.ExpandableListAdapter;
import com.devifsc.estagiario.appeventos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dia28Fragment extends Fragment {


    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dia28, container, false);

        expListView = (ExpandableListView) v.findViewById(R.id.elvDia29);
        prepareListData();
        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);

        return  v;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        // Adding child data
        listDataHeader.add("18:30 - 19:30");
        listDataHeader.add("19:30 - 22:30");
        // Adding child data
        List<String> horario1 = new ArrayList<String>();
        horario1.add("Solenidade de Abertura");
        List<String> horario2 = new ArrayList<String>();
        horario2.add("Evento: Mesa de debate - ABERTURA\nTema: Educação no Brasil, desafios para a formação de sujeitos críticos.\nPalestrante: Profa.  Dra. Olinda Evangelista (UFSC)\nPalestrante: Profa. Dra. Mônica Ribeiro da Silva (UFPR)\nCoordenador: Prof. Dr. Joel José de Souza(IFSC)\n");
        listDataChild.put(listDataHeader.get(0), horario1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), horario2);
    }

}
