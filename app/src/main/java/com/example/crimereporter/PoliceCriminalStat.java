package com.example.crimereporter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PoliceCriminalStat<adapter, simple_spinner_dropdown_item> extends AppCompatActivity {

    Button jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec,year2021,janu,febr,marc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_criminal_stat);

        jan = findViewById(R.id.jan);
        feb = findViewById(R.id.feb);
        mar = findViewById(R.id.mar);
        apr = findViewById(R.id.apr);
        may = findViewById(R.id.may);
        jun = findViewById(R.id.jun);
        jul = findViewById(R.id.jul);
        aug = findViewById(R.id.aug);
        sep = findViewById(R.id.sep);
        oct = findViewById(R.id.oct);
        nov = findViewById(R.id.nov);
        dec = findViewById(R.id.dec);
        year2021 = findViewById(R.id.year2021);
        janu = findViewById(R.id.janu);
        febr = findViewById(R.id.febr);
        marc = findViewById(R.id.marc);
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/r.WFBaT7C_December_2021_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        nov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/H3yPjoKdm_november_2021_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        oct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/pOVuoa5VL_October2021_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        sep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/0za2uvfyx_september2021_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        aug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/0o0Ij1oqj_August_2021_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        jul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/PSFq7rGBj_July_crime_cases_sheet_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        jun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/H1BHexRkA_june_crime_cases_sheet_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        may.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/DDX~6zm8l_may_crime_cases_sheet_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        apr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/qYZ8uVFmj_April_crime_cases_sheet_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/3sC7VDoBd_march_crime_cases_sheet_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        feb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/6RW2HjdBF_feb_crime_cases_sheet_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        jan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/YbSCC2tyH_january_crime_cases_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });
        year2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geturl = "https://pdfhost.io/v/j.P6WJmjk_yearly_crime_cases_Sheet1";
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(geturl));
                String title = URLUtil.guessFileName(geturl,null,null);
                request.setTitle(title);
                request.setDescription("wait");
                String cookie = CookieManager.getInstance().getCookie(geturl);
                request.addRequestHeader("cookie",cookie);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,title);
                DownloadManager downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                downloadManager.enqueue(request);
                Toast.makeText(PoliceCriminalStat.this, "Downloading", Toast.LENGTH_SHORT).show();
            }
        });

    }
}