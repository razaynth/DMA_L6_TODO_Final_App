//package com.tbcmad.todoapp.data;
//
//import android.app.Application;
//import android.os.AsyncTask;
//import androidx.lifecycle.LiveData;
//import com.tbcmad.todoapp.model.TodoRoomDatabase;
//import com.tbcmad.todoapp.model.User;
//
//import java.util.List;
//
//public class UserRepository {
//    private UserDao mTodoDAO;
//    private LiveData<List<User>> allTodoList;
//
//    public UserRepository(Application application){
//        TodoRoomDatabase database = TodoRoomDatabase.getDatabase(application);
//        mTodoDAO = database.userdao();
//        allTodoList = mTodoDAO.getAllUsers();
//    }
//
//    public UserDao getmuserdao() {
//        return mTodoDAO;
//    }
//
//    public void setmuserdao(UserDao mTodoDAO) {
//        this.mTodoDAO = mTodoDAO;
//    }
//
//    public LiveData<List<User>> getAllTodoList() {
//        return allTodoList;
//    }
//
//    public void setAllTodoList(LiveData<List<User>> allTodoList) {
//        this.allTodoList = allTodoList;
//    }
//
//    public void insert(User eTodo){
//        new insertTodoAysncTask(mTodoDAO).execute(eTodo);
//    }
//
//    public void delete(User eTodo){
//        new deleteTodoAysncTask(mTodoDAO).execute(eTodo);
//    }
//
//    public User getTodoById(String id,String pwd){
//        return  mTodoDAO.getUser(id, pwd);
//    }
//
//
//
//    public void update(User eTodo){
//        new updateTodoAysncTask(mTodoDAO).execute(eTodo);
//    }
//
//    private static class insertTodoAysncTask extends AsyncTask<User, Void, Void>{
//        private UserDao mTodoDao;
//        private insertTodoAysncTask(UserDao todoDAO){
//            mTodoDao=todoDAO;
//        }
//
//        @Override
//        protected Void doInBackground(User... eTodos) {
//            mTodoDao.insert(eTodos[0]);
//            return null;
//        }
//    }
//
//    private static class deleteTodoAysncTask extends AsyncTask<User, Void, Void>{
//        private UserDao mTodoDao;
//        private deleteTodoAysncTask(UserDao todoDAO){
//            mTodoDao=todoDAO;
//        }
//
//        @Override
//        protected Void doInBackground(User... eTodos) {
//
//            mTodoDao.delete(eTodos[0]);
//            return null;
//        }
//    }
//
//    private static class updateTodoAysncTask extends AsyncTask<User, Void, Void>{
//        private UserDao mTodoDao;
//        private updateTodoAysncTask(UserDao todoDAO){
//            mTodoDao=todoDAO;
//        }
//
//        @Override
//        protected Void doInBackground(User... eTodos) {
//            mTodoDao.update(eTodos[0]);
//            return null;
//        }
//
//    }
//}
