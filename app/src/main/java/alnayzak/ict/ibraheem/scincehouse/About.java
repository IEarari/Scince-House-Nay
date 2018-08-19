package alnayzak.ict.ibraheem.scincehouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        Button book_button_as = findViewById(R.id.book_tour_as);
        book_button_as.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(About.this,Tour.class));
            }
        });
        Button gifts_button_as = findViewById(R.id.GShop_as);
        gifts_button_as.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(About.this,Gifts.class));
            }
        });
        Button contact_button_as = findViewById(R.id.Contact_US_as);
        contact_button_as.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(About.this,Contact.class));
            }
        });
        Button news_button_as = findViewById(R.id.Latest_news_as);
        news_button_as.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(About.this,NewsActivity.class));
            }
        });
    }
}