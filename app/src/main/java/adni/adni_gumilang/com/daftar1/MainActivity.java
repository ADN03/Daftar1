package adni.adni_gumilang.com.daftar1;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi dulu
    Button btnToast, btnAlert, btnAlert2;
    /* Context berguna untuk memberikan hak akses pada aplikasi kita untuk meload file,
       gambar, activity, theme, atau package android studio */
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);
        btnAlert = findViewById(R.id.btnAlert);
        btnAlert2 = findViewById(R.id.btnAlert2);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Membuat Toast
                Toast.makeText(MainActivity.this, "RPL A Hore", Toast.LENGTH_LONG).show();
            }
        });
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Hello World!");
                builder.setMessage("Hello This is Message");
                builder.setNeutralButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                //TODO menampilkan Alert
                builder.show();
            }
        });

        btnAlert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
                builder2.setTitle("Peringatan");
                builder2.setMessage("Mau Keluar?");
                builder2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
                builder2.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder2.show();
            }
        });
    }
}
