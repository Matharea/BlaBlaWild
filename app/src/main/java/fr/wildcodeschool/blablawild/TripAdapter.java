package fr.wildcodeschool.blablawild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class TripAdapter extends ArrayAdapter {

    public TripAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TripModel trip = (TripModel) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
        }
        // Lookup view for data population
        TextView time = (TextView) convertView.findViewById(R.id.time);
        TextView firstname = (TextView) convertView.findViewById(R.id.firstname);
        TextView lastname = (TextView) convertView.findViewById(R.id.lastname);
        TextView price = (TextView) convertView.findViewById(R.id.price);
        // Populate the data into the template view using the data object
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");
        time.setText(format.format(trip.getDate()));
        firstname.setText(trip.getFirstname());
        lastname.setText(trip.getLastname());
        price.setText("$" + String.valueOf(trip.getPrice()));
        // Return the completed view to render on screen
        return convertView;
    }
}
