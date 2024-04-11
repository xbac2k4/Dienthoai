package com.example.dienthoai.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dienthoai.R;

public class DetailProducts extends AppCompatActivity {

    ImageView img_Image;
    TextView  tv_name, tv_description, tv_storageCapacity, tv_ram, tv_chipset, tv_display, tv_price, tv_discountPrice, tv_manufacturer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_products);

        anhXa();
        userListener();
        getIntentCategories();
    }
    private void anhXa() {
        img_Image = findViewById(R.id.img_Image);
        tv_name = findViewById(R.id.tv_name);
        tv_description = findViewById(R.id.tv_description);
        tv_storageCapacity = findViewById(R.id.tv_storagecapacity);
        tv_ram = findViewById(R.id.tv_ram);
        tv_chipset = findViewById(R.id.tv_chipset);
        tv_display = findViewById(R.id.tv_display);
        tv_price = findViewById(R.id.tv_price);
//        tv_discountPrice = findViewById(R.id.tv_di);
        tv_manufacturer = findViewById(R.id.tv_manufacturer);
    }
    private void getIntentCategories() {

    }
    private void userListener() {

    }
}