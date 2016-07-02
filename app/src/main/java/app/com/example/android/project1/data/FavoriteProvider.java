package app.com.example.android.project1.data;

import android.content.ContentProvider;
import android.content.UriMatcher;
import android.database.sqlite.SQLiteQueryBuilder;

/**
 * Created by typ_ex on 6/30/2016.
 */
public class FavoriteProvider extends ContentProvider {
    private static final UriMatcher sUriMatcher = buildUriMatcher();
    private FavoriteDbHelper mOpenHelper;

    static final int FAVORITE = 100;
    static final int FAVORITES = 101;

    private static final SQLiteQueryBuilder sFavoritesQueryBuilder;
}
