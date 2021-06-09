package sg.edu.rp.c346.id20045435.demoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
//    String[] fruits;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

                // FOR ARRAY
//        fruits = new String[3];
//        fruits[0] = "appple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";

//        for (int i=0; i < fruits.length; i++) {
//            text += fruits[i] + "\n";
//        }
                // FOR ARRAYLIST
        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3, "durian");

        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(fruits.size()-1, "dragon fruit");

        String text = "Fruits\n=====\n";

        for (int i=0; i < fruits.size(); i++) {
            text += fruits.get(i) + "\n";
        }

        tv.setText(text);
    }
}