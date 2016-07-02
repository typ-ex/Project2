package app.com.example.android.project1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by typ_ex on 5/21/2016.
 */
public class MovieArrayAdapter extends ArrayAdapter<MovieResults.Movie>
{
    private ArrayList<MovieResults.Movie> movies;
    private Context context;
    public MovieArrayAdapter(Context context, ArrayList<MovieResults.Movie> movies)
    {
        super(context, 0, movies);
        this.movies = movies;
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        MovieResults.Movie movie = movies.get(position);
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
        }
        else
        {
            imageView = (ImageView) convertView;
        }

        Picasso
                .with(context)
                .load(movies.get(position).getMoviePoster())//change this line to force error
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(imageView);

        imageView.setAdjustViewBounds(true); //suggested from https://goo.gl/bgw40p
        return imageView;
    }
}
