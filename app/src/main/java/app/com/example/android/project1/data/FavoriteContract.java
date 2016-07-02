package app.com.example.android.project1.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by typ_ex on 6/27/2016.
 */
public class FavoriteContract {

    public static final String CONTENT_AUTHORITY = "app.com.example.android.project1";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String FAVORITE_MOVIES = "favorites";


    public static final class FavoritesEntry implements BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(FAVORITE_MOVIES).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + FAVORITE_MOVIES;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + FAVORITE_MOVIES;

        public static final String TABLE_NAME = "favorites";

        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_POSTER = "poster";
        public static final String COLUMN_PLOT = "plot";
        public static final String COLUMN_RATING = "rating";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_TRAILER = "trailer";
        public static final String COLUMN_REVIEW = "review";

        public static Uri buildFavorites(long id)
        {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }
}
