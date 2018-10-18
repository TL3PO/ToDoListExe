package mortitale.tldolistbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = findViewById(R.id.ue_username);
        final TextView userRec = findViewById(R.id.user_rec);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");

        String message = name + "Welcome to your user area";
        userRec.setText(message);
        etUsername.setText(username);

    }
}
