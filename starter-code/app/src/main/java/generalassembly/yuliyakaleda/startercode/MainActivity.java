package generalassembly.yuliyakaleda.startercode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mInput;
    TextView mWish;
    Button mAddWish;
    ListView mWishListView;
    ArrayList<String> wishlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInput = (EditText) findViewById(R.id.edittext);
        mWish = (TextView) findViewById(R.id.textview);
        mAddWish = (Button) findViewById(R.id.button);
        mWishListView = (ListView) findViewById(R.id.wishlist);
        mWishListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wishlist));
        mAddWish.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String input = mInput.getText().toString();
        Animation animation = null;
        animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        mWish.setText(input);
        mWish.startAnimation(animation);
        wishlist.add(0, input);
        mInput.setText("");
    }


}
