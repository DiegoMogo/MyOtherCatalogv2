package com.example.myothercatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class MainActivity<Jsonrequest, PokemonData, PokemonRecyclerViewAdapter> extends AppCompatActivity {
    private Object Jsonrequest;
    JsonArrayRequest request;
    private Object name;

    void sonArrayRequest(

        Jsonrequest null,
        new Response.Listener<JSONArray>() {

    }
)
  new Response.ErrorListener()
    private final Object VolleyError = null;

    {
        request = new JsonArrayRequest();
        public void onErrorResponse;
        (VolleyError);
        Object error;
        error)
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.reccycler_view);
        List<PokemonData> data = new ArrayList<>();
        boolean bulbasaur = data.add(new PokemonData(name,"Bulbasaur", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData(name, "Ivysaur", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData(name, "Venosaur", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData(name, "Charmander", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData(name, "Charmeleon", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData(name, "Charizard", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        PokemonRecyclerViewAdapter adapter = new  PokemonRecyclerViewAdapter(data, activity this);
        recyclerView.setAdapter((RecyclerView.Adapter) adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context this));
}

    private void imageUrl(String s) {
    }
}