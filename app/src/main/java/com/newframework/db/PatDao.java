package com.newframework.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PAT".
*/
public class PatDao extends AbstractDao<Pat, String> {

    public static final String TABLENAME = "PAT";

    /**
     * Properties of entity Pat.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property PatId = new Property(0, String.class, "patId", true, "PAT_ID");
        public final static Property Age = new Property(1, String.class, "age", false, "AGE");
        public final static Property District = new Property(2, String.class, "district", false, "DISTRICT");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property NickName = new Property(4, String.class, "nickName", false, "NICK_NAME");
        public final static Property Sex = new Property(5, String.class, "sex", false, "SEX");
        public final static Property Time = new Property(6, String.class, "time", false, "TIME");
        public final static Property Url = new Property(7, String.class, "url", false, "URL");
        public final static Property Tags = new Property(8, String.class, "tags", false, "TAGS");
        public final static Property Userid = new Property(9, String.class, "userid", false, "USERID");
    }


    public PatDao(DaoConfig config) {
        super(config);
    }
    
    public PatDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PAT\" (" + //
                "\"PAT_ID\" TEXT PRIMARY KEY NOT NULL UNIQUE ," + // 0: patId
                "\"AGE\" TEXT," + // 1: age
                "\"DISTRICT\" TEXT," + // 2: district
                "\"NAME\" TEXT," + // 3: name
                "\"NICK_NAME\" TEXT," + // 4: nickName
                "\"SEX\" TEXT," + // 5: sex
                "\"TIME\" TEXT," + // 6: time
                "\"URL\" TEXT," + // 7: url
                "\"TAGS\" TEXT," + // 8: tags
                "\"USERID\" TEXT);"); // 9: userid
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PAT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Pat entity) {
        stmt.clearBindings();
 
        String patId = entity.getPatId();
        if (patId != null) {
            stmt.bindString(1, patId);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(2, age);
        }
 
        String district = entity.getDistrict();
        if (district != null) {
            stmt.bindString(3, district);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(5, nickName);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(6, sex);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(7, time);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(8, url);
        }
 
        String tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(9, tags);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(10, userid);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Pat entity) {
        stmt.clearBindings();
 
        String patId = entity.getPatId();
        if (patId != null) {
            stmt.bindString(1, patId);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(2, age);
        }
 
        String district = entity.getDistrict();
        if (district != null) {
            stmt.bindString(3, district);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(5, nickName);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(6, sex);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(7, time);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(8, url);
        }
 
        String tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(9, tags);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(10, userid);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public Pat readEntity(Cursor cursor, int offset) {
        Pat entity = new Pat( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // patId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // age
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // district
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // nickName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // sex
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // time
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // url
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // tags
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // userid
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Pat entity, int offset) {
        entity.setPatId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setAge(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDistrict(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNickName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSex(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTime(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTags(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setUserid(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Pat entity, long rowId) {
        return entity.getPatId();
    }
    
    @Override
    public String getKey(Pat entity) {
        if(entity != null) {
            return entity.getPatId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Pat entity) {
        return entity.getPatId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
