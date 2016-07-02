package app.com.example.android.project1.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by typ_ex on 6/27/2016.
 */
public class FavoriteDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    static final String DATABASE_NAME = "favorites.db";

    public FavoriteDbHelper(Context context)
    {
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        final String SQL_CREATE_FAVORITE_TABLE =
                "CREATE TABLE " + FavoriteContract.FavoritesEntry.TABLE_NAME + " (" +
                        FavoriteContract.FavoritesEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +

                        FavoriteContract.FavoritesEntry.COLUMN_TITLE + " TEXT NOT NULL, " +
                        FavoriteContract.FavoritesEntry.COLUMN_POSTER + " TEXT NOT NULL, " +
                        FavoriteContract.FavoritesEntry.COLUMN_PLOT + " TEXT NOT NULL, " +
                        FavoriteContract.FavoritesEntry.COLUMN_RATING + " INTEGER NOT NULL, " +
                        FavoriteContract.FavoritesEntry.COLUMN_DATE + " TEXT NOT NULL, " +
                        FavoriteContract.FavoritesEntry.COLUMN_TRAILER + " TEXT NOT NULL, " +
                        FavoriteContract.FavoritesEntry.COLUMN_REVIEW + " TEXT NOT NULL, " +
                        " );";
        sqLiteDatabase.execSQL(SQL_CREATE_FAVORITE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + FavoriteContract.FavoritesEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
