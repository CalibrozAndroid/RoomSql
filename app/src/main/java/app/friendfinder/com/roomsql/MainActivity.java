package app.friendfinder.com.roomsql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import app.friendfinder.com.roomsql.database.tables.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getName();
    private EditText mNameEditText;
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNameEditText = findViewById(R.id.nameEditText);
        mUsernameEditText = findViewById(R.id.usernameeditText);
        mPasswordEditText = findViewById(R.id.passwordEditText);

        mSubmitButton = findViewById(R.id.submitButton);


        mSubmitButton.setOnClickListener(this);


        printAllUser();
    }

    private void printAllUser() {

        List<User> allUsers = RoomSqlApplication.getInstants().getDatabase().userDao().getAllUsers();

        for (User allUser : allUsers) {
            Log.d(TAG, "printAllUser: " + allUser.getName());
        }
    }

    @Override
    public void onClick(View view) {

        String name = mNameEditText.getText().toString();
        String username = mUsernameEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();


        User user = new User();

        user.setName(name);
        user.setUname(username);
        user.setPassword(password);


        RoomSqlApplication.getInstants().getDatabase().userDao().insert(user);


    }
}
