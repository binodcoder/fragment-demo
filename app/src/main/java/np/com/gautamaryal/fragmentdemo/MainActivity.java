package np.com.gautamaryal.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // redirecting to demo one activity
        findViewById(R.id.demo_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DemoOne.class);
                startActivity(i);

            }
        });

        // redirecting to demo two activity
        findViewById(R.id.demo_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DemoTwo.class);
                startActivity(i);

            }
        });
    }
}