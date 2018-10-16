package com.example.yore.myannotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.annotation.YcAnnotation;

@YcAnnotation(
        name = "annotation",
        text = "you welcome === "
)
public class MyAnnotation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_annotation);
    }
}
