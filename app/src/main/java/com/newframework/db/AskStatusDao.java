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
 * DAO for table "ASK_STATUS".
*/
public class AskStatusDao extends AbstractDao<AskStatus, String> {

    public static final String TABLENAME = "ASK_STATUS";

    /**
     * Properties of entity AskStatus.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property TargetId = new Property(0, String.class, "targetId", true, "TARGET_ID");
        public final static Property SenderId = new Property(1, String.class, "senderId", false, "SENDER_ID");
        public final static Property Status = new Property(2, Integer.class, "status", false, "STATUS");
        public final static Property AskId = new Property(3, String.class, "askId", false, "ASK_ID");
        public final static Property ConversationType = new Property(4, int.class, "conversationType", false, "CONVERSATION_TYPE");
        public final static Property Date = new Property(5, long.class, "date", false, "DATE");
    }


    public AskStatusDao(DaoConfig config) {
        super(config);
    }
    
    public AskStatusDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ASK_STATUS\" (" + //
                "\"TARGET_ID\" TEXT PRIMARY KEY NOT NULL UNIQUE ," + // 0: targetId
                "\"SENDER_ID\" TEXT," + // 1: senderId
                "\"STATUS\" INTEGER," + // 2: status
                "\"ASK_ID\" TEXT," + // 3: askId
                "\"CONVERSATION_TYPE\" INTEGER NOT NULL ," + // 4: conversationType
                "\"DATE\" INTEGER NOT NULL );"); // 5: date
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ASK_STATUS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AskStatus entity) {
        stmt.clearBindings();
 
        String targetId = entity.getTargetId();
        if (targetId != null) {
            stmt.bindString(1, targetId);
        }
 
        String senderId = entity.getSenderId();
        if (senderId != null) {
            stmt.bindString(2, senderId);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(3, status);
        }
 
        String askId = entity.getAskId();
        if (askId != null) {
            stmt.bindString(4, askId);
        }
        stmt.bindLong(5, entity.getConversationType());
        stmt.bindLong(6, entity.getDate());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AskStatus entity) {
        stmt.clearBindings();
 
        String targetId = entity.getTargetId();
        if (targetId != null) {
            stmt.bindString(1, targetId);
        }
 
        String senderId = entity.getSenderId();
        if (senderId != null) {
            stmt.bindString(2, senderId);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(3, status);
        }
 
        String askId = entity.getAskId();
        if (askId != null) {
            stmt.bindString(4, askId);
        }
        stmt.bindLong(5, entity.getConversationType());
        stmt.bindLong(6, entity.getDate());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public AskStatus readEntity(Cursor cursor, int offset) {
        AskStatus entity = new AskStatus( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // targetId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // senderId
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // status
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // askId
            cursor.getInt(offset + 4), // conversationType
            cursor.getLong(offset + 5) // date
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AskStatus entity, int offset) {
        entity.setTargetId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setSenderId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setStatus(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setAskId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setConversationType(cursor.getInt(offset + 4));
        entity.setDate(cursor.getLong(offset + 5));
     }
    
    @Override
    protected final String updateKeyAfterInsert(AskStatus entity, long rowId) {
        return entity.getTargetId();
    }
    
    @Override
    public String getKey(AskStatus entity) {
        if(entity != null) {
            return entity.getTargetId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AskStatus entity) {
        return entity.getTargetId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
