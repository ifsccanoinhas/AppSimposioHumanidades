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
public class Dia29Fragment extends Fragment {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v = inflater.inflate(R.layout.fragment_dia29, container, false);

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
        listDataHeader.add("08:30 - 11:30");
        listDataHeader.add("11:30 - 13:30");
        listDataHeader.add("13:30 - 16:30");
        listDataHeader.add("19:00 - 22:00");
        // Adding child data
        List<String> horario1 = new ArrayList<String>();
        horario1.add("Evento: Roda de Conversa\nTema: GRAFFITI\nMediador: Dharla Raupp Kamers(Artista Raup - Coletivo CURA)\nMediador: Rafael Ferreira da Silva(Artista Crione - Coletivo CURA)\nVagas: 20");
        horario1.add("Evento: Palestra\nTema: Trabalho docente na conjuntura atual\nPalestrante: Profa. Msa. Renata Lucia Batista Flores(Doutorando/Geografia/UFSC)\nVagas: 40");
        horario1.add("Evento: Palestra\nTema: Os desafios da escola crítica e a inoperância da neutralidade\nPalestrante: Prof. Ms. Paulo Henrique Schlickmann(Doutorando/Geografia/UFSC)\nVagas: 150");
        horario1.add("Evento: Palestra\nTema: Construção humanizada: aspectos da relação homem x edifício\nPalestrante: Prof. Ms. Gabriel Moraes de Bem(IFSC)\nPalestrante: Profa. Msa. Roberta Costa Ribeiro da Silva(IFSC)\nVagas: 40");
        List<String> horario2 = new ArrayList<String>();
        horario2.add("Evento: Atividades Culturais\n");
        List<String> horario3 = new ArrayList<String>();
        horario3.add("Evento: Palestra\nTema: Tornar-se mulher, um olhar para as relações de gênero\nPalestrante: Profa. Quéli Flach Anschau(Doutoranda/UFSC/PPGSS)\nVagas: 60");
        horario3.add("Evento: Palestra\nTema: Reflexões sobre pesquisa em política nacional\nPalestrante: Profa. Dra. Olinda Evangelista(UFSC)\nVagas: 30");
        horario3.add("Evento: Palestra\nTema: Retrato e representação (Fotografia) I\nPalestrante: Profa. Msa. Maria Lucila Hom (Doutoranda/PPGE/UDESC)\nPalestrante: Profa. Msa. Micheline Barros(IFSC)\nVagas: 20");
        horario3.add("Evento: Palestra\nTema: Antropologia da Alimentação\nPalestrante: Prof. Dr. Vilson Cesar Schenato (IFSC)\nVagas: 40");
        horario3.add("Evento: Palestra\nTema: Educação Popular em Saúde\nPalestrante: Jorge Senna (Militante Direitos Humanos)\nVagas: 40");
        horario3.add("Evento: Cinema/Debate\nFilme: Cine-Fórum: O Capital(Le Capitale) - Direção: Costa-Gavras - Duração: 1h53min\nDebatedor: Sandro Luiz Bazzanella(Mestrado - UNC)\nVagas: 150");
        List<String> horario4 = new ArrayList<String>();
        horario4.add("Evento: Mesa de debate\nTema: Escola para quê(m)?\nPalestrante: Prof. Davis Moreira Alvim(IFES)\nPalestrante: Prof(a). Ana Maria Said(UFU)\nCoordenador: Prof. Ms. Cícero Santiago de Oliveira(IFSC)\nVagas: 150");
        listDataChild.put(listDataHeader.get(0), horario1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), horario2);
        listDataChild.put(listDataHeader.get(2), horario3); // Header, Child data
        listDataChild.put(listDataHeader.get(3), horario4);
    }

}
