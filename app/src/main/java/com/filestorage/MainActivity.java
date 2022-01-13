package com.filestorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openRemote(View view) {
        Intent intent = new Intent(MainActivity.this, FilesStorage.class);
        startActivity(intent);
    }

    public void openLocal(View view) {
        Intent intent = new Intent(MainActivity.this, PdfViewer.class);
        intent.putExtra("FILE_PATH", "/storage/emulated/0/Download/4752794Document.pdf");
        startActivity(intent);
    }
}