package alnayzak.ict.ibraheem.scincehouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button book_button = findViewById(R.id.book);
        book_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Tour.class));
            }
        });
        Button about_button = findViewById(R.id.about);
        about_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home.this,About.class));
            }
        });
        Button gifts_button = findViewById(R.id.gifts);
        gifts_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Gifts.class));
            }
        });
        Button contact_button = findViewById(R.id.contact);
        contact_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Contact.class));
            }
        });
        Button news_button = findViewById(R.id.news);
        news_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(Home.this,NewsActivity.class));
            }
        });
    }


}