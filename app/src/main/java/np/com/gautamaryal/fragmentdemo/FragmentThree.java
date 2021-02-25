package np.com.gautamaryal.fragmentdemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentThree extends Fragment {
    Button demo_one;
    Button demo_two;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        demo_one = (Button)rootView.findViewById(R.id.demo_one);
        demo_two = (Button)rootView.findViewById(R.id.demo_two);

        demo_one.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), DemoOne.class);
                startActivity(i);
            }
        });

        demo_two.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), DemoTwo.class);
                startActivity(i);
            }
        });

        return rootView;
    }
}