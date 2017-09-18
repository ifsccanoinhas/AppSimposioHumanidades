package com.devifsc.estagiario.appeventos;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.devifsc.estagiario.appeventos.IHC.AvalieEventoFragment;
import com.devifsc.estagiario.appeventos.IHC.InicioFragment;
import com.devifsc.estagiario.appeventos.IHC.InscricoesFragment;
import com.devifsc.estagiario.appeventos.IHC.LocalFragment;
import com.devifsc.estagiario.appeventos.IHC.PalestrantesFragment;
import com.devifsc.estagiario.appeventos.IHC.ProgramacaoFragment;
import com.devifsc.estagiario.appeventos.IHC.SobreAplicativoFragment;
import com.devifsc.estagiario.appeventos.IHC.SobreSimposioFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        InicioFragment inicioFragment = new InicioFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.mainLayout, inicioFragment).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {

        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        String barra = "II Simpósio de Humanidades";

        if (id == R.id.nav_home) {
            InicioFragment inicioFragment = new InicioFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, inicioFragment).commit();
            barra = "II Simpósio de Humanidades";

        } else if (id == R.id.nav_palestrantes) {
            PalestrantesFragment palestrantesFragment = new PalestrantesFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, palestrantesFragment).commit();
            barra = "Palestrantes";

        } else if (id == R.id.nav_inscricoes) {
            InscricoesFragment inscricoesFragment = new InscricoesFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, inscricoesFragment).commit();
            barra = "Inscrições";

        } else if (id == R.id.nav_programacao) {
            ProgramacaoFragment programacaoFragment = new ProgramacaoFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, programacaoFragment).commit();
            barra = "Programação";

        } else if (id == R.id.nav_avalie_evento) {
            AvalieEventoFragment avalieEventoFragment = new AvalieEventoFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, avalieEventoFragment).commit();
            barra = "Avalie o Evento";

        }else if (id == R.id.nav_sobre_aplicativo) {
            SobreAplicativoFragment sobreAplicativoFragment = new SobreAplicativoFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, sobreAplicativoFragment).commit();
            barra = "Sobre o Aplicativo";

        } else if (id == R.id.nav_sobre_simposio) {
            SobreSimposioFragment sobreSimposioFragment = new SobreSimposioFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, sobreSimposioFragment).commit();
            barra = "Sobre o Simpósio";

        } else if (id == R.id.nav_local) {
            LocalFragment localFragment = new LocalFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.mainLayout, localFragment).commit();
            barra = "Local";
        }
        getSupportActionBar().setTitle(barra);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
