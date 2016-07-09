package app.com.example.android.project1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by typ_ex on 5/21/2016.
 */
public class MovieArrayAdapter extends RecyclerView.Adapter<MovieArrayAdapter.ViewHolder>
{
    private ArrayList<MovieResults.Movie> movies;

    private final int DETAILS = 0;
    private final int REVIEWS = 1;

    public MovieArrayAdapter(ArrayList<MovieResults.Movie> movies)
    {
        this.movies = movies;
    }

    @Override
    public int getItemCount()
    {
        return this.movies.size();
    }

    @Override
    public int getItemViewType(int position)
    {
        if (movies.get(position) instanceof DETAILS)
        {
            return DETAILS;
        }
        else if (movies.get(position) instanceof REVIEWS)
        {
            return REVIEWS;
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType)
        {
            case DETAILS:
                View v1 = inflater.inflate(R.layout.detail_viewholder, viewGroup, false);
                viewHolder = new ViewHolder1(v1);
                break;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position)
    {

    }
    /*private Context context;
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
    }*/
}
