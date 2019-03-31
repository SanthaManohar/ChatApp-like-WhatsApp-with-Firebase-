package santhakumar.com.chatappbanone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    Button register,login;

    FirebaseUser firebaseUser;

    @Override
    protected void onStart() {
        super.onStart();

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if(firebaseUser != null){
            Intent goToHomeActivity = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(goToHomeActivity);
            finish();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        register = (Button)findViewById(R.id.btn_register);
        login = (Button)findViewById(R.id.btn_login);

    }

    public void register(View v){
        Intent goToRegisterActivity = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(goToRegisterActivity);
    }
    public void login(View v){
        Intent goToRegisterActivity = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(goToRegisterActivity);
    }

}
