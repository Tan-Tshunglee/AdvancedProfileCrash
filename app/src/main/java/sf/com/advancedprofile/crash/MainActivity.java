package sf.com.advancedprofile.crash;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DialogFragment editFragment = new EditTextDialogFragment();
        editFragment.show(getSupportFragmentManager(), "edit_dialog");
    }
}
