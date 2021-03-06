package edu.buffalo.cse.cse486586.groupmessenger1;

import android.database.sqlite.*;
import android.content.*;
import android.util.Log;

/**
 * Created by arjunsun on 2/16/16.
 * Reference: Tutorials point, Developers.android
 */
public class ForSql extends SQLiteOpenHelper {

    public static final String tablename = "mytable";
    public static final String col1 = "key";
    public static final String col2 = "value";

    private static final String DATABASE_NAME = "mydb.db";
    private static final int DATABASE_VERSION = 1;


    private static final String tablecreate = "CREATE TABLE "+ tablename + "(" + col1
            + " varchar, " + col2
            + " varchar);";
    private static final String qurr="DROP TABLE mytable";
    public ForSql(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(qurr);
        database.execSQL(tablecreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}
