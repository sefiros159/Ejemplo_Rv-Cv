/**En esta actividad se declara y usa el RecyclerView
 *
 */

package com.example.sefir.ejemplodatos;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PersonaActividad extends AppCompatActivity
{

    //declaración del arreglo como ua base de datos(irreal) y el elemento RecyclerView
    public static final List<Persona> bd = new ArrayList<>();
    RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_principal);

        //Buscamos el elemento por medio del ID y lo asignamos a rv
        rv = (RecyclerView) findViewById(R.id.rv);

        //Esto se quitara despues, son los elementos del RecyclerView
        bd.add(new Persona("Pueba", "Telefono Prueba"));
        bd.add(new Persona("Pueba", "Telefono Prueba"));


        //buscamos el elemento FloatingButton y lo asignamos a su variable
        FloatingActionButton boton = (FloatingActionButton)findViewById(R.id.addActivity);

        //damos funcionalidad al boton, lanzara un Toast
        boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(PersonaActividad.this,"Funciona Bien",Toast.LENGTH_SHORT).show();
            }
        });

        actualizaRecyvler();
    }
    //metodo que actualiza el metodo
    private void actualizaRecyvler()
    {
        rv.setAdapter(new AdaptadorPersonalizado(bd));
        rv.hasFixedSize();
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
    }
}
