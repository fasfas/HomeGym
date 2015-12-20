package example.com.denislav.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tren_new extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener
        {
    public ImageView den1_new;
            public ImageView den2_new;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tren_new);
        Toolbar toolbar3 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar3);

        DrawerLayout drawer3 = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle3 = new ActionBarDrawerToggle(
                this, drawer3, toolbar3, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer3.setDrawerListener(toggle3);
        toggle3.syncState();

        NavigationView navigationView3 = (NavigationView) findViewById(R.id.nav_view);
        navigationView3.setNavigationItemSelectedListener(this);

        den1_new = (ImageView) findViewById(R.id.den1_new);
        den1_new.setOnClickListener((View.OnClickListener) this);

        den2_new = (ImageView) findViewById(R.id.den2_new);
        den2_new.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer3 = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer3.isDrawerOpen(GravityCompat.START)) {
            drawer3.closeDrawer(GravityCompat.START);
        } else {
                finish ();
                startActivity(new Intent(this, MainActivity.class));
 }

    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_new) {
            startActivity(new Intent(this, New_1den_1upr.class));
            finish();
        } else if (id == R.id.nav_grow) {

        } else if (id == R.id.nav_loss) {

        } else if (id == R.id.nav_suveti) {

        }


        DrawerLayout drawer3 = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer3.closeDrawer(GravityCompat.START);
        return true;
    }
public void onClick(View v) {

    if (v.getId() == den1_new.getId()) {
        startActivity(new Intent(this, New_1den_1upr.class));
        finish();
    }
    if (v.getId() == den2_new.getId()) {
        startActivity(new Intent(this, New_2den_1upr.class));
        finish();
    }
        }
}
