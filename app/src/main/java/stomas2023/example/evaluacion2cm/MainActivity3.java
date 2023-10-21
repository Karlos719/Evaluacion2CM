package stomas2023.example.evaluacion2cm;

import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText etd1, etd2, etd3;
    private Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etd1 = findViewById(R.id.ETD1);
        etd2 = findViewById(R.id.ETD2);
        etd3 = findViewById(R.id.ETD3);
        btnAgregar = findViewById(R.id.BTAgregar);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String iddireccion1 = etd1.getText().toString();
                String iddireccion2 = etd2.getText().toString();
                String iddireccion3 = etd3.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Direccion1", iddireccion1);
                intent.putExtra("Direccion2", iddireccion2);
                intent.putExtra("Direccion3", iddireccion3);
                startActivity(intent);
            }
        });
    }
}