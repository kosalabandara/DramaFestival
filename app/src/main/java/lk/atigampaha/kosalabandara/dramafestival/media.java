package lk.atigampaha.kosalabandara.dramafestival;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class media extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media);

    }

    public void f(View view) {
        String url = "https://www.facebook.com/acathespians/";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }

    public void y(View view) {
        String url = "https://www.youtube.com/channel/UCJfMrDZuejtDAX9SwNp8kgw/";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }

    public void t(View view) {
        String url = "https://twitter.com/thespiansvpa";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }

    public void i(View view) {
        String url = "https://www.instagram.com/academic.thespiansvpa";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }

    public void p(View view) {
        String url = "https://www.pinterest.com/academicthespiansuvpa/";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }

    public void in(View view) {
        String url = "https://www.linkedin.com/in/academic-thespians-75772a153/";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }

    public void fik(View view) {
        String url = "https://www.flickr.com/photos/159713206@N05/";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }

    public void g(View view) {
        String url = "https://plus.google.com/u/0/107971042875237047955";
        Uri web = Uri.parse(url);
        Intent com = new Intent(Intent.ACTION_VIEW, web);
        if (com.resolveActivity(getPackageManager()) != null) {
            startActivity(com);
        }
    }
}