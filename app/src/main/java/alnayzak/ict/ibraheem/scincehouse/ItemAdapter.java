package alnayzak.ict.ibraheem.scincehouse;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ItemAdapter extends ArrayAdapter<Item> {
    private int mColor;

    public ItemAdapter(Context context, ArrayList<Item> words, int color) {
        super(context, 0, words);
        mColor = color;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_gifts, parent, false);
        }

        Item currentWord = getItem(position);

        ImageView ItemImage = (ImageView) listItemView.findViewById(R.id.imageOfItem);
        ItemImage.setImageResource(currentWord.getmImageSRC());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentWord.getmTitle());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentWord.getmDiscription());

        TextView mPointsTextView = (TextView) listItemView.findViewById(R.id.mPoints);
        mPointsTextView.setText(currentWord.getmMainPoints());

       // View textContainer = listItemView.findViewById(R.id.text_container);

        //int color = ContextCompat.getColor(getContext(), mColor);
       // textContainer.setBackgroundColor(color);
        return listItemView;
    }


}