package com.example.newbiechen.ireader.model.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.newbiechen.ireader.model.bean.BookHelpfulBean;
import com.example.newbiechen.ireader.model.bean.BookReviewBean;
import com.example.newbiechen.ireader.model.bean.CollBookBean;
import com.example.newbiechen.ireader.model.bean.AuthorBean;
import com.example.newbiechen.ireader.model.bean.ReviewBookBean;
import com.example.newbiechen.ireader.model.bean.BookHelpsBean;
import com.example.newbiechen.ireader.model.bean.BookCommentBean;

import com.example.newbiechen.ireader.model.gen.BookHelpfulBeanDao;
import com.example.newbiechen.ireader.model.gen.BookReviewBeanDao;
import com.example.newbiechen.ireader.model.gen.CollBookBeanDao;
import com.example.newbiechen.ireader.model.gen.AuthorBeanDao;
import com.example.newbiechen.ireader.model.gen.ReviewBookBeanDao;
import com.example.newbiechen.ireader.model.gen.BookHelpsBeanDao;
import com.example.newbiechen.ireader.model.gen.BookCommentBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bookHelpfulBeanDaoConfig;
    private final DaoConfig bookReviewBeanDaoConfig;
    private final DaoConfig collBookBeanDaoConfig;
    private final DaoConfig authorBeanDaoConfig;
    private final DaoConfig reviewBookBeanDaoConfig;
    private final DaoConfig bookHelpsBeanDaoConfig;
    private final DaoConfig bookCommentBeanDaoConfig;

    private final BookHelpfulBeanDao bookHelpfulBeanDao;
    private final BookReviewBeanDao bookReviewBeanDao;
    private final CollBookBeanDao collBookBeanDao;
    private final AuthorBeanDao authorBeanDao;
    private final ReviewBookBeanDao reviewBookBeanDao;
    private final BookHelpsBeanDao bookHelpsBeanDao;
    private final BookCommentBeanDao bookCommentBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bookHelpfulBeanDaoConfig = daoConfigMap.get(BookHelpfulBeanDao.class).clone();
        bookHelpfulBeanDaoConfig.initIdentityScope(type);

        bookReviewBeanDaoConfig = daoConfigMap.get(BookReviewBeanDao.class).clone();
        bookReviewBeanDaoConfig.initIdentityScope(type);

        collBookBeanDaoConfig = daoConfigMap.get(CollBookBeanDao.class).clone();
        collBookBeanDaoConfig.initIdentityScope(type);

        authorBeanDaoConfig = daoConfigMap.get(AuthorBeanDao.class).clone();
        authorBeanDaoConfig.initIdentityScope(type);

        reviewBookBeanDaoConfig = daoConfigMap.get(ReviewBookBeanDao.class).clone();
        reviewBookBeanDaoConfig.initIdentityScope(type);

        bookHelpsBeanDaoConfig = daoConfigMap.get(BookHelpsBeanDao.class).clone();
        bookHelpsBeanDaoConfig.initIdentityScope(type);

        bookCommentBeanDaoConfig = daoConfigMap.get(BookCommentBeanDao.class).clone();
        bookCommentBeanDaoConfig.initIdentityScope(type);

        bookHelpfulBeanDao = new BookHelpfulBeanDao(bookHelpfulBeanDaoConfig, this);
        bookReviewBeanDao = new BookReviewBeanDao(bookReviewBeanDaoConfig, this);
        collBookBeanDao = new CollBookBeanDao(collBookBeanDaoConfig, this);
        authorBeanDao = new AuthorBeanDao(authorBeanDaoConfig, this);
        reviewBookBeanDao = new ReviewBookBeanDao(reviewBookBeanDaoConfig, this);
        bookHelpsBeanDao = new BookHelpsBeanDao(bookHelpsBeanDaoConfig, this);
        bookCommentBeanDao = new BookCommentBeanDao(bookCommentBeanDaoConfig, this);

        registerDao(BookHelpfulBean.class, bookHelpfulBeanDao);
        registerDao(BookReviewBean.class, bookReviewBeanDao);
        registerDao(CollBookBean.class, collBookBeanDao);
        registerDao(AuthorBean.class, authorBeanDao);
        registerDao(ReviewBookBean.class, reviewBookBeanDao);
        registerDao(BookHelpsBean.class, bookHelpsBeanDao);
        registerDao(BookCommentBean.class, bookCommentBeanDao);
    }
    
    public void clear() {
        bookHelpfulBeanDaoConfig.clearIdentityScope();
        bookReviewBeanDaoConfig.clearIdentityScope();
        collBookBeanDaoConfig.clearIdentityScope();
        authorBeanDaoConfig.clearIdentityScope();
        reviewBookBeanDaoConfig.clearIdentityScope();
        bookHelpsBeanDaoConfig.clearIdentityScope();
        bookCommentBeanDaoConfig.clearIdentityScope();
    }

    public BookHelpfulBeanDao getBookHelpfulBeanDao() {
        return bookHelpfulBeanDao;
    }

    public BookReviewBeanDao getBookReviewBeanDao() {
        return bookReviewBeanDao;
    }

    public CollBookBeanDao getCollBookBeanDao() {
        return collBookBeanDao;
    }

    public AuthorBeanDao getAuthorBeanDao() {
        return authorBeanDao;
    }

    public ReviewBookBeanDao getReviewBookBeanDao() {
        return reviewBookBeanDao;
    }

    public BookHelpsBeanDao getBookHelpsBeanDao() {
        return bookHelpsBeanDao;
    }

    public BookCommentBeanDao getBookCommentBeanDao() {
        return bookCommentBeanDao;
    }

}