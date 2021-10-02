package com.developer.johhns.singletonejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cadena1 , cadena2, entero1, entero2 , resultado ;

    Button btnResultado, btnIncrementa ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadena1   = findViewById(R.id.editCadena1) ;
        cadena2   = findViewById(R.id.editCadena2) ;
        entero1   = findViewById(R.id.editEntero1) ;
        entero2   = findViewById(R.id.editEntero2) ;
        resultado = findViewById(R.id.txtResultado) ;

        btnResultado  = findViewById( R.id.btnResultado ) ;
        btnIncrementa = findViewById( R.id.btnIncrementar ) ;

        cadena1.setText( SingletonUtil.getInstancia().getCadena_1() ) ;
        cadena2.setText( SingletonUtil.getInstancia().getCadena_2() ) ;
        entero1.setText( String.valueOf( SingletonUtil.getInstancia().getEntero_1() ) );
        entero2.setText( String.valueOf( SingletonUtil.getInstancia().getEntero_2() ) );

        mostrarResultado();

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizarValores();
            }
        });

        btnIncrementa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementarEnteros();
            }
        });


    }

    private void incrementarEnteros(){
        int _entero1 = SingletonUtil.getInstancia().getEntero_1() + 1;
        int _entero2 = SingletonUtil.getInstancia().getEntero_2() + 1 ;
        SingletonUtil.getInstancia().setEntero_1( _entero1 ) ;
        SingletonUtil.getInstancia().setEntero_2( _entero2 ) ;
        entero1.setText( String.valueOf( SingletonUtil.getInstancia().getEntero_1() ) );
        entero2.setText( String.valueOf( SingletonUtil.getInstancia().getEntero_2() ) );
        mostrarResultado();
    }

    private void actualizarValores(){
        SingletonUtil.getInstancia().setCadena_1( String.valueOf( cadena1.getText() ) );
        SingletonUtil.getInstancia().setCadena_2( String.valueOf( cadena2.getText() ) );
        SingletonUtil.getInstancia().setEntero_1( Integer.parseInt( String.valueOf( entero1.getText() ) ) );
        SingletonUtil.getInstancia().setEntero_2( Integer.parseInt( String.valueOf( entero2.getText() ) ) );
        mostrarResultado();
    }


    private void mostrarResultado() {
        String texto = "      Contenido Singleton \n" ;
        texto += "---------------------------\n" ;
        texto += "Cadena 1 = " + SingletonUtil.getInstancia().getCadena_1() + "\n" ;
        texto += "Cadena 2 = " + SingletonUtil.getInstancia().getCadena_2() + "\n" ;
        texto += "Entero 1 = " + String.valueOf( SingletonUtil.getInstancia().getEntero_1() ) + "\n" ;
        texto += "Entero 2 = " + String.valueOf( SingletonUtil.getInstancia().getEntero_2() ) + "\n" ;
        resultado.setText( texto );
    }


}