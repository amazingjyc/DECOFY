package decofy.dlsu.edu.ph.decofy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private Button registerBttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        registerBttn = findViewById(R.id.registerBttn);
        registerBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), WelcomeActivity.class);
                Toast.makeText(getBaseContext(), "Sign Up Successful!",
                        Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
