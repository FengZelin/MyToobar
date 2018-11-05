package com.example.asus.mytoobar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        //获取控件
        mToolbar = findViewById(R.id.toolbar);
        /* 设置标题
        toab.setTitle("标题吗");
        toab.setLogo(R.mipmap.ic_launcher_round);*/
        //添加一个menu的布局文件
        mToolbar.inflateMenu(R.menu.menu);
        //设置一个默认点击的图片
        mToolbar.setNavigationIcon(R.mipmap.ic_launcher);
        //setSupportActionBar(toab);
        //为这个menu设置点击事件
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.item1:
                        Toast.makeText(MainActivity.this,"111", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.item2:
                        Toast.makeText(MainActivity.this,"222", Toast.LENGTH_LONG).show();
                        break;
                }
                return false;
            }
        });
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"dianyix", Toast.LENGTH_LONG).show();
            }
        });

    }
    //设置menu必须要实现的方法
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
