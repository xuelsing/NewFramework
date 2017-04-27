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
 * DAO for table "GROUP_MEMBER".
*/
public class GroupMemberDao extends AbstractDao<GroupMember, String> {

    public static final String TABLENAME = "GROUP_MEMBER";

    /**
     * Properties of entity GroupMember.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property GroupId = new Property(0, String.class, "groupId", true, "GROUP_ID");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Image = new Property(3, String.class, "image", false, "IMAGE");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property Role = new Property(5, String.class, "role", false, "ROLE");
    }


    public GroupMemberDao(DaoConfig config) {
        super(config);
    }
    
    public GroupMemberDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GROUP_MEMBER\" (" + //
                "\"GROUP_ID\" TEXT PRIMARY KEY NOT NULL UNIQUE ," + // 0: groupId
                "\"USER_ID\" TEXT NOT NULL ," + // 1: userId
                "\"NAME\" TEXT," + // 2: name
                "\"IMAGE\" TEXT," + // 3: image
                "\"TITLE\" TEXT," + // 4: title
                "\"ROLE\" TEXT);"); // 5: role
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GROUP_MEMBER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GroupMember entity) {
        stmt.clearBindings();
 
        String groupId = entity.getGroupId();
        if (groupId != null) {
            stmt.bindString(1, groupId);
        }
        stmt.bindString(2, entity.getUserId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(4, image);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String role = entity.getRole();
        if (role != null) {
            stmt.bindString(6, role);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GroupMember entity) {
        stmt.clearBindings();
 
        String groupId = entity.getGroupId();
        if (groupId != null) {
            stmt.bindString(1, groupId);
        }
        stmt.bindString(2, entity.getUserId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(4, image);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String role = entity.getRole();
        if (role != null) {
            stmt.bindString(6, role);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public GroupMember readEntity(Cursor cursor, int offset) {
        GroupMember entity = new GroupMember( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // groupId
            cursor.getString(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // image
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // role
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GroupMember entity, int offset) {
        entity.setGroupId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setUserId(cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRole(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final String updateKeyAfterInsert(GroupMember entity, long rowId) {
        return entity.getGroupId();
    }
    
    @Override
    public String getKey(GroupMember entity) {
        if(entity != null) {
            return entity.getGroupId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GroupMember entity) {
        return entity.getGroupId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
