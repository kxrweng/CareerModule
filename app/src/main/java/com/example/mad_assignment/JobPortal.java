package com.example.mad_assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mad_assignment.R;
import com.example.mad_assignment.databinding.JobPortalBinding;

public class JobPortal extends AppCompatActivity {

    private JobPortalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = JobPortalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String article1 = getString(R.string.virtualthumbnaillink1),
                article2 = getString(R.string.virtualthumbnaillink2),
                article3 = getString(R.string.virtualthumbnaillink3);
        Glide.with(this)
                .load(article1)
                .into(binding.skillimage1);
        Glide.with(this)
                .load(article2)
                .into(binding.skillimage2);
        Glide.with(this)
                .load(article3)
                .into(binding.skillimage3);

        binding.MoreSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Skill.class);
                startActivity(intent);
            }
        });

        binding.skillcardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(JobPortal.this, Skill.class);
                intent.putExtra("searchQuery","Dan");
                startActivity(intent);

            }
        });
        binding.skillcardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(JobPortal.this, Skill.class);
                intent.putExtra("searchQuery","Self");
                startActivity(intent);

            }
        });
        binding.skillcardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(JobPortal.this, Skill.class);
                intent.putExtra("searchQuery","Linda");
                startActivity(intent);

            }
        });

        binding.MoreJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), Job.class);
                startActivity(intent);
            }
        });

        binding.CreateResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResumeBuilderPg1.class);
                startActivity(intent);

            }
        });
    }
}
