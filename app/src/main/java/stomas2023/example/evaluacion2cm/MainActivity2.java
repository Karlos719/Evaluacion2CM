package stomas2023.example.evaluacion2cm;

    import android.content.Intent;
        import android.os.Bundle;
        import androidx.appcompat.app.AppCompatActivity;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;
public class MainActivity2 extends AppCompatActivity {
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String iddireccion1 = intent.getStringExtra("iddireccion1");
        String iddireccion2 = intent.getStringExtra("iddireccion2");
        String iddireccion3 = intent.getStringExtra("iddireccion3");

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.Map);
        mapFragment.getMapAsync(googleMap -> {
            mMap = googleMap;

            agregarMarcador(iddireccion1);
            agregarMarcador(iddireccion2);
            agregarMarcador(iddireccion3);
        });
    }
    private void agregarMarcador(String iddireccion) {
    }
}