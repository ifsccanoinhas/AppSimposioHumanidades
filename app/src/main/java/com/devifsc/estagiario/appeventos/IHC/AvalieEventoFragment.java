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
public class AvalieEventoFragment extends Fragment {

    public WebView avalieEventoWebView;
    public AvalieEventoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_avalie_evento, container, false);

        avalieEventoWebView = (WebView) v.findViewById(R.id.webViewAvalieEvento);
        avalieEventoWebView.loadUrl("https://goo.gl/forms/98kUyn6VyVqvTp9L2");
        WebSettings webSettings = avalieEventoWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);

        avalieEventoWebView.setWebViewClient(new WebViewClient());

        return v;
    }

}
