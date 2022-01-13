package com.filestorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class PdfViewer extends AppCompatActivity {

    private static final String TAG = "PdfViewer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        Intent intent = getIntent();
        String filePath = intent.getStringExtra("FILE_PATH");
        if (filePath != null) {
            viewPDF(filePath);
        } else {
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private void viewPDF(String filePath) {
        PDFView pdfView = findViewById(R.id.pdfview);
        File file = new File(filePath);
        pdfView.fromFile(file).load();
    }
}