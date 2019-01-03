package com.mylocarson.hanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public  static final  String REGISTER = "http://han.com.ng/member-registration/";
    public  static final String EVENTS = "http://han.com.ng/events/list/";
    public  static final String ASSOCIATION = "http://han.com.ng/associations/";
    public static final String NEWS = "http://han.com.ng/news/";
    public static final String ABOUT = "http://han.com.ng/about/";
    public static final String GALLERY = "http://han.com.ng/gallery/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    private void openWebView(String url){
        Intent intent  = new Intent(MainActivity.this, WebVewActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

    @OnClick(R.id.about_container)
    void about(){
        openWebView(ABOUT);

    }
    @OnClick(R.id.event_container)
    void event(){
        openWebView(EVENTS);
    }

    @OnClick(R.id.register)
    void register(){
        openWebView(REGISTER);
    }

    @OnClick(R.id.news_container)
    void news(){
        openWebView(NEWS);
    }

    @OnClick(R.id.gallery_container)
    void  gallery(){
        openWebView(GALLERY);
    }

    @OnClick(R.id.assoc_container)
    void assoc(){
        openWebView(ASSOCIATION);
    }
}
