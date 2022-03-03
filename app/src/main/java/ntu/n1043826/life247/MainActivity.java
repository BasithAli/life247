package ntu.n1043826.life247;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button letsGetInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        letsGetInButton = findViewById(R.id.startbutton);

        letsGetInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Login Activity

                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}