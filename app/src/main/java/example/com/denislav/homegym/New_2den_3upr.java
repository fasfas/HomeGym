package example.com.denislav.homegym;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class New_2den_3upr extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener
        {
    public ImageView youtube;
    public ImageView start;
    public ImageView next;
    public WebView web1;
    public TextView txtLeft;
    int k=3;
    public ImageView all;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_2den_3upr);
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar2);

        DrawerLayout drawer2 = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle2 = new ActionBarDrawerToggle(
                this, drawer2, toolbar2, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer2.setDrawerListener(toggle2);
        toggle2.syncState();

        NavigationView navigationView2 = (NavigationView) findViewById(R.id.nav_view);
        navigationView2.setNavigationItemSelectedListener(this);

        start = (ImageView) findViewById(R.id.start);
        start.setOnClickListener((View.OnClickListener) this);

        youtube = (ImageView) findViewById(R.id.youtube);
        youtube.setOnClickListener((View.OnClickListener) this);

        next = (ImageView) findViewById(R.id.next);
        next.setOnClickListener((View.OnClickListener) this);
        txtLeft = (TextView) findViewById(R.id.txtLeft);

        txtLeft.setVisibility(View.INVISIBLE);
        next.setVisibility(View.INVISIBLE);

        WebView myWebView = (WebView) findViewById(R.id.web1);
        myWebView.loadUrl("http://prikachi.com/images/316/8527316t.png");


    }

    public void onClick(View v) {
        if (v.getId() == start.getId()) {

            final MediaPlayer mpButtonClick1 = MediaPlayer.create(getBaseContext(), R.raw.broqch);
            mpButtonClick1.start();

            new CountDownTimer(30100, 1000) {//CountDownTimer(edittext1.getText()+edittext2.getText()) also parse it to long


                public void onTick(long millisUntilFinished) {

                    txtLeft.setText("Оставащи секунди: " + millisUntilFinished / 1000);
                    start.setVisibility(View.INVISIBLE);
                    txtLeft.setVisibility(View.VISIBLE);
                }



                public void onFinish() {
                    k = k - 1;
                    txtLeft.setVisibility(View.INVISIBLE);
                    txtLeft.setText("done!");
                    if (k == 0) {
                        next.setVisibility(View.VISIBLE);

                    } else {
                        start.setVisibility(View.VISIBLE);
                    }

                }
            }
                    .start();

        }
        if (v.getId() == next.getId()) {
            startActivity(new Intent(this, New_2den_4upr.class));
            finish();

        }
        if (v.getId() == youtube.getId()) {
            Intent websiteIntent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://www.youtube.com/watch?v=AHxi2opykIY");
            websiteIntent.setData(uri);
            startActivity(websiteIntent);

        }

    }

    private static final int TIME_INTERVAL = 3000;
    private long mBackPressed;

    public void onBackPressed() {
        DrawerLayout drawer2 = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer2.isDrawerOpen(GravityCompat.START)) {
            drawer2.closeDrawer(GravityCompat.START);
        } else {
            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis())
            {
                startActivity(new Intent(this, Tren_new.class));
                finish();
            }
            else { Toast.makeText(getBaseContext(), "Натиснете още един, за да излезете от дневната тренировка.",  Toast.LENGTH_SHORT).show(); }

            mBackPressed = System.currentTimeMillis();
 }

    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_upr1_den2) {
            startActivity(new Intent(this, New_2den_1upr.class));
            finish();

        } else if (id == R.id.nav_upr2_den2) {
            startActivity(new Intent(this, New_2den_2upr.class));
            finish();

        } else if (id == R.id.nav_upr3_den2) {

        } else if (id == R.id.nav_upr4_den2) {
            startActivity(new Intent(this, New_2den_4upr.class));
            finish();

        }
        else if (id == R.id.nav_upr5_den2) {
            startActivity(new Intent(this, New_2den_5upr.class));
            finish();

        }
        else if (id == R.id.nav_upr6_den2) {
            startActivity(new Intent(this, New_2den_6upr.class));
            finish();

        }
        else if (id == R.id.nav_upr7_den2) {
            startActivity(new Intent(this, New_2den_7upr.class));
            finish();

        }


        DrawerLayout drawer2 = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer2.closeDrawer(GravityCompat.START);
        return true;
    }

}
