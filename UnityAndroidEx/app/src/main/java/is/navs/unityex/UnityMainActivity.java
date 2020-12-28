package is.navs.unityex;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class UnityMainActivity extends AppCompatActivity {
// public class UnityMainActivity extends UnityPlayerCompatActivity {

    private UnityFragment unityFragment;
    private NativeFragment nativeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("UnityEx", "UnityMainActivity.OnCreate");

        setContentView(R.layout.activity_main);

        unityFragment = new UnityFragment();
        unityFragment.setArguments(new Bundle());

        nativeFragment = new NativeFragment();
        nativeFragment.setArguments(new Bundle());

        getSupportFragmentManager().beginTransaction().replace(R.id.unity_main_frame, unityFragment).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.native_frame, nativeFragment).commit();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.size() > 0) {
                setIntent(intent);
            }
        }
    }
}