package com.example.newsfeedapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of articles
        News currentNews = getItem(position);

        // Find the TextView with view ID news_title
        TextView newsTitleView = (TextView) listItemView.findViewById(R.id.news_title);
        // Display the title of the current news in that TextView
        newsTitleView.setText(currentNews.getTitle());

        // Find the TextView with view ID news_section_name
        TextView newsSectionView = (TextView) listItemView.findViewById(R.id.news_section_name);
        // Display the section of the current news in that TextView
        newsSectionView.setText(currentNews.getSectionName());

        // Create a new Date object from the time in milliseconds of the news
        Date dateObject = new Date(currentNews.getDate());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.news_date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current news in that TextView
        dateView.setText(formattedDate);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}
