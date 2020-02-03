package com.example.androideventbasic06012020;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1 : Khởi tạo view
//    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1 : Task : Bắt sự kiện cho view
        // 2 : Task : Kiểm tra dữ liệu theo log
        // 3 : Task : Hiển thị dư liệu ra màn hình

//        int a = 5;
//        int b = 5;

        // 2 Th

        //1 : Đối tượng chỉ truyền tham trị (Kiểu giá trị nguyên thủy)
//        int c = 5 + 5;  c = 10 sẽ không thay đổi khi a thay đổi vì kiểu dữ liệu là tham trị
        //2 : Đối tượng truyền tham chiếu
//
//        Integer c = 6;
//        Integer d = 7;
//
//        Integer e = c + d;

        // 2 : Ánh xạ
//        mButton = findViewById(R.id.buttonClickMe);

        //3 : Bắt sự kiện
//        mButton.setText("Changed");
        //Kiểm tra dữ liệu
//        Log.d("BBB",null);

        // Hiển thị thông báo ra màn hình
        Anotation : Chú thích được ký hiệu bằng @
        Toast.makeText()
    }

}
