package pe.edu.upc.registrateupc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button asistencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asistencia=(Button)findViewById(R.id.asistencia);


        asistencia.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                Intent inten =new Intent(MainActivity.this,GeoMapActivity.class);
                startActivity(inten);
            }
        });

    }
}
