package alnayzak.ict.ibraheem.scincehouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Gifts extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create a list of words
        final ArrayList<Item> Items = new ArrayList<Item>();
        Items.add(new Item(R.drawable.hoppers,"Hoppers", getString(R.string.hopper_desc), getString(R.string.hopper_main)));
        Items.add(new Item(R.drawable.enis,"Einstein’s riddle", getString(R.string.enis)));
        Items.add(new Item(R.drawable.sciencemem,"Science Memory", getString(R.string.smd),getString(R.string.smm)));
        Items.add(new Item(R.drawable.tquest,"T-Quest", getString(R.string.tqd), getString(R.string.tqm)));
        Items.add(new Item(R.drawable.challange,"Challenge yourself", getString(R.string.cyd),getString(R.string.cym)));
        Items.add(new Item(R.drawable.badir,"Think.. Initiate",getString(R.string.badird),getString(R.string.badirm)));
        Items.add(new Item(R.drawable.rush,"Rush Hour", getString(R.string.rhd),getString(R.string.rhm)));


        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(this, Items, 303030);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);
    }
}