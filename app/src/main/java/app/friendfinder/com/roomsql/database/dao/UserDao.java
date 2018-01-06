package app.friendfinder.com.roomsql.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import app.friendfinder.com.roomsql.database.tables.User;

/**
 * Created by Muhammed on 06/01/18.
 */

@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Query("SELECT * FROM user")
    List<User> getAllUsers();
}
