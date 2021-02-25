package np.com.gautamaryal.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class DemoTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_two);

        loadInitialContainerFirst();
        loadInitialContainerSecond();

        findViewById(R.id.load_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragmentOne();
            }
        });

        findViewById(R.id.load_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragmentTwo();
            }
        });
    }

    public void loadInitialContainerFirst()
    {

        loadFragmentOne();

    }

    public void loadInitialContainerSecond()
    {

        FragmentThree fm_three = new FragmentThree();
        getFragmentTransaction().add(R.id.frame_container_second, fm_three);
        getFragmentTransaction().commit();

    }

    public void loadFragmentOne()
    {

        FragmentOne fm_one = new FragmentOne();
        getFragmentTransaction().replace(R.id.frame_container_first, fm_one);
        getFragmentTransaction().commit();

    }

    public void loadFragmentTwo()
    {
        FragmentTwo fm_two = new FragmentTwo();
        getFragmentTransaction().replace(R.id.frame_container_first, fm_two);
        getFragmentTransaction().commit();

    }

    public FragmentTransaction getFragmentTransaction(){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        return fragmentTransaction;
    }



}