//package com.tbcmad.todoapp.viewModel;
//
//import android.app.Application;
//import android.util.Log;
//
//import androidx.annotation.NonNull;
//import androidx.lifecycle.AndroidViewModel;
//import androidx.lifecycle.LiveData;
//
//
//import com.tbcmad.todoapp.data.UserRepository;
//
//import com.tbcmad.todoapp.model.User;
//
//import java.util.List;
//
//public class UserViewModel extends AndroidViewModel {
//    private UserRepository mUserRepository;
//    private LiveData<List<User>> allTodos;
//    public UserViewModel(@NonNull Application application){
//        super(application);
//        mUserRepository =new UserRepository(application);
//        allTodos = mUserRepository.getAllTodoList();
//    }
//
//    public LiveData<List<User>> getAllTodoList() {
//        return allTodos;
//    }
//
//    public User getUser(String username, String passwd){
//        Log.e("err1","ErrorA");
//       return mUserRepository.getTodoById(username, passwd);
//    }
//
//   public void insert(User eTodo) {
//        mUserRepository.insert(eTodo);
//    }
//
//    public  void delete(User eTodo){
//        mUserRepository.delete(eTodo);
//    }
//
//}
