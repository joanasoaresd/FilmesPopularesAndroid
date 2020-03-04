package com.example.filmespopulares.ui.listafilmes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toolbar;

import com.example.filmespopulares.R;

public class ListaFilmesActivity extends AppCompatActivityActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerFilmes = findViewById(R.id.recycler_filmes);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager( context: this);
        recyclerFilmes.setLayoutManager(linearLayoutManager);
        recyclerFilmes.setAdapter();
    }
}
