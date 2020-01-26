package mcm.edu.ph.kinkyfurry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TableRow item1,item2,item3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);

        item1.setOnClickListener(this);
        item2.setOnClickListener(this);
        item3.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.item1:

                Intent intent1 = new Intent(this, PaymentOptionItem1.class);
                startActivity(intent1);

                break;
            case R.id.item2:

                Intent intent2 = new Intent(this, PaymentOptionItem2.class);
                startActivity(intent2);


                break;
            case R.id.item3:

                break;

        }}



}
