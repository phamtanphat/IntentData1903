package khoapham.ptp.phamtanphat.intentdata;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //1 : Lấy dữ liệu dạng chuỗi
//        Intent intent = getIntent();
//        if(intent != null){
//            if(intent.hasExtra("chuoi")){
//                String chuoi = intent.getStringExtra("chuoi");
//                Log.d("BBB",chuoi);
//            }else{
//                Log.d("BBB","Sai từ khóa");
//            }
//        }
        //2 : Lấy dữ liệu dạng integer
//        Intent intent = getIntent();
//        if(intent != null){
//            if(intent.hasExtra("so")){
//                Integer so = intent.getIntExtra("s",Integer.MIN_VALUE);
//                Log.d("BBB",so + "");
//            }else{
//                Log.d("BBB","Sai từ khóa");
//            }
//        }
        //3 : Lấy dữ dạng Array
//        Intent intent = getIntent();
//        if(intent != null){
//            if(intent.hasExtra("array")){
//                String[] arraystring = intent.getStringArrayExtra("array");
//                Log.d("BBB",arraystring.length + "");
//            }else{
//                Log.d("BBB","Sai từ khóa");
//            }
//        }
        //4 : Lấy dữ liệu dạng object
//        Intent intent = getIntent();
//        if(intent != null){
//            if(intent.hasExtra("object")){
//                Person person = (Person) intent.getSerializableExtra("object");
//                Log.d("BBB",person.ten + "");
//            }else{
//                Log.d("BBB","Sai từ khóa");
//            }
//        }
        //5 : Lấy dữ liệu dạng Mảng object
        Intent intent = getIntent();
        if(intent != null){
            if(intent.hasExtra("arraylistobject")){
                ArrayList<Animal> animals =  intent.getParcelableArrayListExtra("arraylistobject");
                Log.d("BBB", animals.size() + "");
            }else{
                Log.d("BBB","Sai từ khóa");
            }
            if(intent.hasExtra("chuoi")){
                String chuoi = intent.getStringExtra("chuoi");
                Log.d("BBB", chuoi);
            }else{
                Log.d("BBB","Sai từ khóa");
            }
        }
    }
}
