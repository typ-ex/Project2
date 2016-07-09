package app.com.example.android.project1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by typ_ex on 7/2/2016.
 */
public class Review_viewholder extends RecyclerView.ViewHolder {

    private TextView author;
    private TextView content;

    public Review_viewholder(View v)
    {
        super(v);
        author = (TextView) v.findViewById(R.id.author);
        content = (TextView) v.findViewById(R.id.content);
    }

    public TextView getAuthor() {
        return author;
    }

    public void setAuthor(TextView author) {
        this.author = author;
    }

    public TextView getContent() {
        return content;
    }

    public void setContent(TextView content) {
        this.content = content;
    }
}
