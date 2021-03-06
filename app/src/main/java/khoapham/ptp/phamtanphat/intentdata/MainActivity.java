package khoapham.ptp.phamtanphat.intentdata;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntenInteger,btnIntentArray,btnIntentObject,btnIntentArraylistobject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanceof <=> === kiểm tra kiểu dữ liệu
        // (Object) => type casting trong java
        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntenInteger = findViewById(R.id.buttonIntentInteger);
        btnIntentArray = findViewById(R.id.buttonIntentArray);
        btnIntentObject = findViewById(R.id.buttonIntentObject);
        btnIntentArraylistobject = findViewById(R.id.buttonIntentArraylistObject);


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
        btnIntentArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] mangten = {"Toán","Lý","Hóa","Địa"};
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("array",mangten);
                startActivity(intent);
            }
        });
        btnIntentObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person person1 = new Person("Nguyen Van A");
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("object", (Serializable) person1);
                startActivity(intent);
            }
        });
        btnIntentArraylistobject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Animal> mangthucung = new ArrayList<>();
                mangthucung.add(new Animal("Mèo"));
                mangthucung.add(new Animal("Chó"));
                mangthucung.add(new Animal("Hưu"));
                mangthucung.add(new Animal("Cá"));
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("arraylistobject",mangthucung);
                intent.putExtra("chuoi","hello");
                startActivity(intent);
            }
        });
    }
    //generic
//    public <T> void senData(String key , T value ){
//        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//        if (value instanceof ArrayList<?> ){
//            if (value instanceof String)
////            Type casting
//            intent.putExtra(key,(String) value);
//        }
//
//        startActivity(intent);
//    }
}
