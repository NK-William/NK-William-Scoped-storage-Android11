package com.filestorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class PdfViewer extends AppCompatActivity {

    private static final String TAG = "PdfViewer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        viewPDF();
    }

    private void viewPDF(){
        PDFView pdfView = findViewById(R.id.pdfview);
//        pdfView.fromAsset("info.pdf").load();
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/sample.pdf");
        Log.d(TAG, "viewPDF: "+ file);
        pdfView.fromFile(file).load();
    }
}