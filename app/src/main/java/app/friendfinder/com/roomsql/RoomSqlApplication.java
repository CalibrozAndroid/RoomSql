package app.friendfinder.com.roomsql;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.facebook.stetho.Stetho;

import app.friendfinder.com.roomsql.database.AppDatabase;

/**
 * Created by Muhammed on 06/01/18.
 */

public class RoomSqlApplication extends Application {

    private static RoomSqlApplication roomSqlApplication;
    private AppDatabase db;

    public static RoomSqlApplication getInstants() {
        return roomSqlApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "room_sql").allowMainThreadQueries().build();
        roomSqlApplication = this;

        Stetho.initializeWithDefaults(this);
    }

    public AppDatabase getDatabase() {
        return db;
    }
}
