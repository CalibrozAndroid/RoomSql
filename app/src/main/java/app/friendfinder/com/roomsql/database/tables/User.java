package app.friendfinder.com.roomsql.database.tables;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Muhammed on 06/01/18.
 */

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private int uid;


    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "uname")
    private String uname;

    @ColumnInfo(name = "password")
    private String password;


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
