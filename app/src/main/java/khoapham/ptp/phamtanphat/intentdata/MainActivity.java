package khoapham.ptp.phamtanphat.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntenInteger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntenInteger = findViewById(R.id.buttonIntentInteger);

        //1 : Gửi dữ liệu dạng chuỗi
        btnIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("chuoi","Xin chào màn hình 2");
                startActivity(intent);
            }
        });
        //2 : Gửi dữ liệu dạng integer
        btnIntenInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("so",-1);
                startActivity(intent);
            }
        });
    }
}
