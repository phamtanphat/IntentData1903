package khoapham.ptp.phamtanphat.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //1 : Lấy dữ liệu dạng chuỗi
        Intent intent = getIntent();
        if(intent != null){
            if(intent.hasExtra("chuoi")){
                String chuoi = intent.getStringExtra("chuoi");
                Log.d("BBB",chuoi);
            }else{
                Log.d("BBB","Sai từ khóa");
            }
        }
    }
}
