package com.example.app5eartquake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app5eartquake.databinding.ActivityMonitorBinding;

public class Monitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMonitorBinding binding= ActivityMonitorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        String id= extras.getString("id");

        binding.latitud.setText(extras.getDouble("latitude")+"");
        binding.txtDatos2.setText(extras.getLong("time")+"");
        binding.longitud.setText(extras.getDouble("longitude")+"");
        binding.magnitud.setText(extras.getDouble("magnitude")+"");
        binding.txtDatos.setText(extras.getString("place"));
    }
}