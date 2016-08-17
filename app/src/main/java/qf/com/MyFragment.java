package qf.com;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class MyFragment extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        tv= (TextView) findViewById(R.id.tv);
        tv.setText("合体成功");
    }
public class MyFragment extends AppCompatActivity{
    ImageView iv;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        init();
    }

    private void init() {
        iv.setImageResource(R.mipmap.ic_launcher);
    }
}
