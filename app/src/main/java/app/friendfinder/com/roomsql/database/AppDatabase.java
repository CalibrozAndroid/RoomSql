package app.friendfinder.com.roomsql.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import app.friendfinder.com.roomsql.database.dao.UserDao;
import app.friendfinder.com.roomsql.database.tables.User;

/**
 * Created by Muhammed on 06/01/18.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
