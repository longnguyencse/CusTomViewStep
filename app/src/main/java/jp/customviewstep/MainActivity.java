package jp.customviewstep;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_exit)
    ImageView btnExit;

    @BindView(R.id.btn_next)
    ImageView btnNext;

    @BindView(R.id.title_page)
    TextView titlePage;

    @BindView(R.id.title_areas)
    RelativeLayout titleAreas;

    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    @BindView(R.id.grid_view)
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /*Setup gridview adapter*/
    private void sepupAdapter(){

    }
}
