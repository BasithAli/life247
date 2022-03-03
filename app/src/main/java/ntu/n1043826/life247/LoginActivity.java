package ntu.n1043826.life247;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
   private Button loginButton;
   private Button registerButton;

    public LoginActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.email_login_button);
        registerButton = findViewById(R.id.register_button_login);

       registerButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // register button login page activities

               startActivity(new Intent(LoginActivity.this,RegisterAccountActivity.class));
           }
       });
    }
}