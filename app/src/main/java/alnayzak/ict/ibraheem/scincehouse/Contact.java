package alnayzak.ict.ibraheem.scincehouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Contact extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);
        Button send = findViewById(R.id.contacting_button_send);
        send.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                Toast.makeText(Contact.this,"Sending",LENGTH_LONG).show();

                new Thread(new Runnable() {

                    public void run() {
                        EditText Name_field = findViewById(R.id.contacting_field_name);
                        String Name = Name_field.getText().toString();
                        EditText Subject_field = findViewById(R.id.contacting_field_subject);
                        String Subject = Subject_field.getText().toString();
                        EditText Message_field = findViewById(R.id.contacting_field_message);
                        String Message = Message_field.getText().toString();
                        EditText Phone_Number_Field = findViewById(R.id.contacting_field_phone_number);
                        String Phone_Number = Phone_Number_Field.getText().toString();
                        try {

                            GMailSender sender = new GMailSender(

                                    "ScienceHouseGuests@gmail.com",

                                    "AlNayzak");


                            sender.sendMail(Subject, "Automated Header From Science House APP(Contact Us Section) \nSender Name Is :"+Name+"\nSenders Phone Number is :"+Phone_Number+"\n\nSenders Message :\n"+Message,

                                    "ScienceHouseGuests@gmail.com",
                                    // TODO Change the Receiver E-Mail to : ScienceHouse@alnayzak.org
                                    "ScienceHouseGuests@gmail.com");


                        } catch (Exception e) {

                            Toast.makeText(getApplicationContext(), "Error", LENGTH_LONG).show();


                        }

                    }

                }).start();

            }

        });


    }

}