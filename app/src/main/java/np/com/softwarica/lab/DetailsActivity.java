package np.com.softwarica.lab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {


    CircleImageView circImg;
    TextView tvFullName, tvPhoneNo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg =findViewById(R.id.circImg);
        tvFullName =findViewById(R.id.tvFullName);
        tvPhoneNo =findViewById(R.id.tvPhoneNo);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            circImg.setImageResource(bundle.getInt("image"));
            tvFullName.setText((bundle.getString("name")));

        }

    }
}
