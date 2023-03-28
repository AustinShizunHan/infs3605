package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlantDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_detail);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");

        TextView plantNameTextView = findViewById(R.id.plant_name_text_view);
        TextView plantDescriptionTextView = findViewById(R.id.plant_details_text_view);
        ImageView imageView = findViewById(R.id.plant_image_view);
        VideoView videoView =

// Set the image source based on the selected plant
        int imageResource;
        switch (name) {
            case "Hill's Fig":
                imageResource = R.drawable.abc;
                break;
            case "Gymea Lilly":
                imageResource = R.drawable.b;
                break;
            case "Broad-leaved Paperbark":
                imageResource = R.drawable.c;
                break;
            case "Crimson Bottlerush":
                imageResource = R.drawable.d;
                break;
            case "Heath Banksia":
                imageResource = R.drawable.e;
                break;
            case "Mountain Cedar Wattle":
                imageResource = R.drawable.f;
                break;
            case "Native Mint":
                imageResource = R.drawable.g;
                break;
            case "Tuckeroo":
                imageResource = R.drawable.h;
                break;
            case "Prickly Leaved Tea Tree":
                imageResource = R.drawable.i;
                break;
            case "Water Vine":
                imageResource = R.drawable.j;
                break;
            case "Rock Lily":
                imageResource = R.drawable.k;
                break;
            case "Sandpaper Fig":
                imageResource = R.drawable.l;
                break;
            case "Burrawang":
                imageResource = R.drawable.m;
                break;
            case "Plum Pine":
                imageResource = R.drawable.n;
                break;
            case "Tussock Grass":
                imageResource = R.drawable.o;
                break;
            case "Cabbage Tree Palm":
                imageResource = R.drawable.p;
                break;
            case "Bolwarra":
                imageResource = R.drawable.q;
                break;
            case "Blue Flax Lily":
                imageResource = R.drawable.r;
                break;
            case "Old man banksia":
                imageResource = R.drawable.s;
                break;
            case "Matrush":
                imageResource = R.drawable.t;
                break;
            case "Ribery":
                imageResource = R.drawable.u;
                break;
            case "Grass Tree":
                imageResource = R.drawable.v;
                break;
            case "Native Ginger":
                imageResource = R.drawable.w;
                break;
            case "Flame Tree":
                imageResource = R.drawable.x;
                break;
            case "Port Jackson Fig":
                imageResource = R.drawable.y;
                break;

            default:
                imageResource = R.drawable.a;
                break;
        }

        imageView.setImageResource(imageResource);
        plantNameTextView.setText(name);
        plantDescriptionTextView.setText(description);

    }
}
