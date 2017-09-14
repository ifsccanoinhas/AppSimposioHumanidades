package com.devifsc.estagiario.appeventos.IHC;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.devifsc.estagiario.appeventos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InscricoesFragment extends Fragment {

    public WebView inscricoesWebView;
    public InscricoesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_inscricoes, container, false);

        inscricoesWebView = (WebView) v.findViewById(R.id.webViewInscricoes);
        inscricoesWebView.loadUrl("https://sigaa.ifsc.edu.br/sigaa/link/public/extensao/inscricoesOnline");
        WebSettings webSettings = inscricoesWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);

        inscricoesWebView.setWebViewClient(new WebViewClient());

        return v;
    }

}
