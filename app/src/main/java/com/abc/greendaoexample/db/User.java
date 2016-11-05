package com.abc.greendaoexample.db;

import org.greenrobot.greendao.annotation.*;

import java.util.List;
import com.abc.greendaoexample.db.DaoSession;
import org.greenrobot.greendao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "USER".
 */
@Entity(active = true)
public class User {

    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private String name;
    private Short age;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient UserDao myDao;

    @ToMany(joinProperties = {
        @JoinProperty(name = "id", referencedName = "userId")
    })
    private List<Repo> userRepos;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    @Generated
    public User(Long id, String name, Short age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(@NotNull String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<Repo> getUserRepos() {
        if (userRepos == null) {
            __throwIfDetached();
            RepoDao targetDao = daoSession.getRepoDao();
            List<Repo> userReposNew = targetDao._queryUser_UserRepos(id);
            synchronized (this) {
                if(userRepos == null) {
                    userRepos = userReposNew;
                }
            }
        }
        return userRepos;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetUserRepos() {
        userRepos = null;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
