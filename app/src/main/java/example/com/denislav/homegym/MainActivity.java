package example.com.denislav.homegym;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_new) {
            startActivity(new Intent(this, Tren_new.class));
            finish();
        } else if (id == R.id.nav_grow) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
            Toast.makeText(getApplicationContext(), "Очаквайте скоро!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_loss) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
            Toast.makeText(getApplicationContext(), "Очаквайте скоро!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_suveti) {
            Intent websiteIntent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://www.facebook.com/pages/%D0%94%D0%BE%D0%BC%D0%B0%D1%88%D0%B5%D0%BD-%D1%84%D0%B8%D1%82%D0%BD%D0%B5%D1%81-%D0%B8%D0%BD%D1%81%D1%82%D1%80%D1%83%D0%BA%D1%82%D0%BE%D1%80/1637890896423949?ref=aymt_homepage_panel");
            websiteIntent.setData(uri);
            startActivity(websiteIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
