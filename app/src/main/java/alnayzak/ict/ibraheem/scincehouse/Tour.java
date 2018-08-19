package alnayzak.ict.ibraheem.scincehouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tour extends AppCompatActivity {
    int adults = 0;
    int kids = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_tour);
        Button plusA= findViewById(R.id.plusadults);
        Button minusA = findViewById(R.id.minusA);
        Button plusK= findViewById(R.id.plusK);
        Button minusK = findViewById(R.id.minusK);
        plusA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (adults<5) {
                    adults = adults + 1;
                    displayA(adults);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Sorry But We Could Not Receive More Than 5 Teachers",Toast.LENGTH_LONG).show();
                }
            }
        });
        minusA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (adults > 0){
                adults = adults - 1;
                displayA(adults);
            }
        }
        });
        plusK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (kids < 50) {
                    kids = kids +1;
                    displayK(kids);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Sorry But We Could Not Receive More Than 50 Students",Toast.LENGTH_LONG).show();
                }
            }
        });
        minusK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (kids > 0){
                    kids = kids - 1;
                    displayK(kids);
                }
            }
        });
        Button Submit = findViewById(R.id.Booking_Tour_Submit);
        Submit.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Toast.makeText(Tour.this ,"Sending",Toast.LENGTH_LONG).show();
                new Thread(new Runnable() {

                    public void run() {
                        EditText Person_Name_field = findViewById(R.id.Booking_Person_Name);
                        String PersonName = Person_Name_field.getText().toString();
                        EditText Person_Number_field = findViewById(R.id.Booking_Person_Number);
                        String Person_Number = Person_Number_field.getText().toString();
                        EditText Person_City_field = findViewById(R.id.Booking_City_Name);
                        String Person_City= Person_City_field.getText().toString();
                        EditText Organization_Name_Field = findViewById(R.id.Booking_ORG_Name);
                        String Organization_Name = Organization_Name_Field.getText().toString();
                        EditText Organization_Number_Field = findViewById(R.id.Booking_ORG_Number);
                        String Organization_Number = Organization_Number_Field.getText().toString();
                        EditText Date_field = findViewById(R.id.Booking_Date);
                        String Date = Date_field.getText().toString();
                        try {

                            GMailSender sender = new GMailSender(

                                    "ScienceHouseGuests@gmail.com",

                                    "AlNayzak");


                            sender.sendMail("Booking Tour (Science House APP)", "Dear Science House, \nWe Are in : "+Organization_Name+"\nin : "+Person_City+"\nWant to Visit Science House On : "+Date+"\nWe Have "+kids+"Kid/s And "+adults+"Teachers,\nOur ORG/School Phone Number "+Organization_Number+"\nTeacher Name : "+PersonName +" \nTeacher Number :"+Person_Number,

                                    "ScienceHouseGuests@gmail.com",
                                    // TODO Change the Receiver E-Mail to : ScienceHouse@alnayzak.org
                                    "ScienceHouseGuests@gmail.com");


                        } catch (Exception e) {

                            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();


                        }


                    }



                }).start();


            }
        });
    }
    private void displayA(int num){
        TextView Adults_Number = findViewById(R.id.adultsN);
        Adults_Number.setText(""+num);
    }
    private void displayK(int num){
        TextView Kids_Number = findViewById(R.id.kidsN);
        Kids_Number.setText(""+num);
        TextView Pay = findViewById(R.id.costs);
        Pay.setText("You Have to Pay : "+num*12+" ILS");
    }
}