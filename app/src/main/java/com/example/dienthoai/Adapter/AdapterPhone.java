package com.example.dienthoai.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dienthoai.Model.Phone;
import com.example.dienthoai.R;
import com.example.dienthoai.View.DetailProducts;

import java.util.ArrayList;

public class AdapterPhone extends RecyclerView.Adapter<AdapterPhone.ViewHolder>{
    private final Context context;
    private final ArrayList<Phone> list;

    public AdapterPhone(Context context, ArrayList<Phone> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_phone, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Phone phone = list.get(position);
        if (phone.getImage() != "" ) {
            Glide.with(context)
                    .load(phone.getImage())
                    .thumbnail(Glide.with(context).load(R.drawable.noimageicon))
                    .into(holder.imgImage);
        }
        holder.tvName.setText(phone.getName());
        holder.tvManufacturer.setText(phone.getManufacturer());
        holder.tvPrice.setText("$" + phone.getPrice());
//        holder.tvDepcription.setText(phone.getDescription());
        holder.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Thêm vào giỏ hàng", Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailProducts.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvManufacturer, tvPrice;
//                tvDepcription;
        ImageView imgImage;
        ImageButton btnAdd;
        LinearLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgImage = itemView.findViewById(R.id.img_Image);
            tvName = itemView.findViewById(R.id.tv_name);
            tvManufacturer =  itemView.findViewById(R.id.tv_manufacturer);
            tvPrice = itemView.findViewById(R.id.tv_price);
//            tvDepcription = itemView.findViewById(R.id.tv_description);
            btnAdd = itemView.findViewById(R.id.btn_add_to_cart);
        }
    }
}
