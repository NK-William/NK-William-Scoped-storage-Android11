package com.filestorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        viewPDF();
    }

    private void viewPDF(){
        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("info.pdf").load();
    }
}